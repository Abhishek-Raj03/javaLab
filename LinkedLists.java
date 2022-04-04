package javaLab7_10;
import java.util.Scanner;
import java.util.Iterator;

public class LinkedLists {
	Scanner sc=new Scanner(System.in);
	class Node{
		String data;
		 Node next;
		 
		public Node(String data){
				this.data=data;
				this.next=null;
	}
	
	  
	}
	 Node head=null;
	 Node tail=null;
	
	public Node create(String data) {
		Node temp=new Node(data);
		return temp;
	}
	
	public void insert() {
		System.out.print("Enter string to insert: ");
		String s=sc.next();
		Node temp=create(s);
		if(head==null) {
			head=temp;
			tail=temp;
		}
		else {
			tail.next=temp;
			tail=temp;
		}
	}
	
	public  void display() {
		/*Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println();
	}
	*/
		//Iterator it=l.iterator();

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		LinkedLists l=new LinkedLists();
		Iterator<LinkedLists> it=l.iterator();
		System.out.println("1. Insert\n2. Display\n3. Exit\n");
		while(true) {
			System.out.print("Enter choice: ");
			int ch=sc.nextInt();
			switch(ch) {
			case 1:
				l.insert();
				l.display();
				break;
				
			case 2:
				l.display();
				break;
				
			case 3:
				System.exit(0);
			}
		}
		

	}

}
