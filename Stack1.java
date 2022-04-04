package lab_program;
import java.util.Scanner;

public class Stack1 {
	//class Stack {
    int[] data;
    int top;
    int capacity;
    
    Stack1(int capacity){
    	this.capacity=capacity;
    	data=new int[capacity];
    	top=0;
    }
//    public static int add(int a,int b) {
//    	return a+b;
//    }
  
   public void push(int a) {
    	if(capacity==top) {
    		System.out.println("stack overflow");
    	}
    	else {
    		data[top]=a;
    		top++;
    	}
    }
    public int pop() {
    	if(top==0) {
    		System.out.println("stack underflow");
    		return -1;
    	}
    	else {
    		int a=data[top-1];
    		top--;
    		return a;
    	}
    }
    public void display() {
    	if(top==0) {
    		System.out.println("stack is empty");
    	}
    	else {
    		System.out.println("the element of stack are:");
    		for(int i=0;i<top;i++) {
    			System.out.print(data[i]+" ");
    		}
    	}
    }
//}
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("enter size of stack");
    	int size=sc.nextInt();
    	Stack1 s1=new Stack1(size);
    	//s1.push(size);
    	System.out.println("1. Push\n2. Pop\n3. Display\n4. Exit");
    	while(true) {
    		System.out.println("enter your choice");
    		int ch=sc.nextInt();
    		switch(ch) {
    		case 1:
    			System.out.println("enter total elements");
    			int ele=sc.nextInt();
    			s1.push(ele);
    			break;
    		case 2:
    			int ele2=s1.pop();
    				System.out.println(ele2);
    				break;
    		case 3:
    			s1.display();
    			break;
    		case 4:
    			System.exit(0);
    			default:
    				System.out.println("invalid choice");
    		}
    	}
    }
}
