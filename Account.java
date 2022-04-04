package lab_program;
import java.util.Scanner;

public class Account {
	Scanner sc=new Scanner(System.in);
	int accno;
	String name;
	int phno;
	float bal;
	Account(){
		bal=0;
	}
	public void getinput() {
		System.out.println("enter Account no.");
		accno=sc.nextInt();
		sc.nextLine();
		System.out.println("enter name");
		name=sc.nextLine();
		System.out.println("enter phone no.");
		phno=sc.nextInt();
	}
	public void deposit() {
		System.out.println("enter amount to be deposited");
		float a=sc.nextFloat();
		bal+=a;
		System.out.println("your remaining bal is: "+bal);
	}
	public void withdraw() {
		System.out.println("enter amount to be withdraw");
		float a=sc.nextFloat();
		if(bal>=a) {
			bal-=a;
			System.out.println("your remaining bal is: "+bal);
		}
		else
			System.out.println("cant perform operation");
	}
	public void display() {
		System.out.println("Name: "+name+"\nAccount no: "+accno+"\nBalance: "+bal);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Account a=new Account();
		a.getinput();
		System.out.println("Enter choice\n1. Deposit\n2. Withdraw\n3. Profile\n4. Exit");
		while(true) {
			System.out.print("Enter choice");
			int choice=sc.nextInt();
			switch(choice) {
			case 1: a.deposit();
			        break;
			case 2: a.withdraw();
			        break;
			case 3: a.display();
			        break;
			case 4: System.exit(0);
			}
		}
	

	}

}
