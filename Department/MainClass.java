package ISE;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int count=0;
		ISE_department ise=new ISE_department();
		Faculty[] f=new Faculty[20];
		System.out.println("1. Add a faculty\n2. Get details of particular faculty\n3. Get name of experienced faculty\n4. number of designation of particular faculty\n5. Number of reserch projs done by particular faculty\n6. Exit");
		while(true) {
			System.out.print("Enter choice: ");
			int ch=sc.nextInt();
			sc.nextLine();
			switch(ch) {
			case 1: f[count]=new Faculty();
			        ise.readdata(f[count]);
			        count++;
			        break;
			case 2: System.out.println("Enter name of faculty u want details");
			   String s=sc.nextLine();
			   int flag1=0;
			   for(int i=0;i<count;i++) {
				   if(s.equals(f[i].name)) {
					   flag1=1;
					   ise.printdata(f[i]);
					   break;
				   }
			   }
			   if(flag1==0) {
				   System.out.println("Faculty not found");
			   }
			   break;
			case 3: System.out.println("The faculty with exp. greater than 20 are: ");
			int flag2=0;
			  for(int i=0;i<count;i++) {
				  if(f[i].yoe>20) {
					  System.out.print(f[i].name+" , ");
					  flag2=1;
				  }
			  }
			  if(flag2==0)
				  System.out.println("No such faculty found!\n");
			  break;
			case 4: System.out.println("The no. of designations are: ");
			for(int i=0;i<count;i++) {
				System.out.println(f[i].numDesignation+" , ");
			}
			break;
			case 5: System.out.println("The no. of reserch proj are: ");
			for(int i=0;i<count;i++) {
				System.out.println(f[i].numResearch+" , ");
			}
			break;
			case 6: System.exit(0);
			}
			
		}

	}

}
