package ISE;
import java.util.Scanner;
class Myexception extends Exception{
	Myexception(String s){
		super(s);
	}
}

public class ISE_department implements Department {
	public void readdata(Faculty f) {
		Scanner sc=new Scanner(System.in);
		try {
			System.out.println("Enter name of faculty:");
			f.name=sc.nextLine();
			System.out.println("Enter designation:");
			f.designation=sc.nextLine();
			System.out.println("Enter year of exp:");
			f.yoe=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter joining date:");
			f.joining_date=sc.nextLine();
			System.out.println("Enter subject handled:");
			f.subject_handled=sc.nextLine();
			
			System.out.println("Enter age:");
			int temp=sc.nextInt();
			if(temp<=58)
				f.age=temp;
		
		else {
			Myexception e=new Myexception("-----Age Exception---should be less than 58----");
			throw e;
		   }
		}
		catch(Myexception e) {
			int a;
			do {
				System.out.println(e.getMessage());
				System.out.println("Enter age of faculty again: ");
				a=sc.nextInt();
			}
			while(a>58);
			f.age=a;
		}
	}
	 public void printdata(Faculty f) {
		 System.out.println("Name : "+f.name);
		 System.out.println("Age is : "+f.age);
		 System.out.println("Designation is: "+f.designation);
		 System.out.println("Year of exp: "+f.yoe);
		 System.out.println("Joining date: "+f.joining_date);
		 System.out.println("Subject handlrd: "+f.subject_handled);
		 
	 }
	 public void print_number_designations(Faculty f) {
		System.out.println("Number of designation : "+f.numDesignation);
		
	 }
	 public void number_reserch_consultancy_projs(Faculty f) {
		 System.out.println("Number of research projects : "+f.numResearch);
	 }
}
