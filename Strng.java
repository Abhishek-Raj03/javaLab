package lab_program;
import java.util.Scanner;
import java.util.Arrays;

public class Strng {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("1. Extract portion\n2. count word\3. Replace substring\n4. Rearrange\n5. compare string\n6. concatinate");
		int choice=sc.nextInt();
		sc.nextLine();
		switch(choice){
		case 1:
			System.out.println("enter a string");
			String s=sc.nextLine();
			System.out.println("enter position and length");
			int i=sc.nextInt();
			int n=sc.nextInt();
			String k=s.substring(i, i+n);
			System.out.println(k);
			break;
		case 2:
			//sc.nextLine();
			int count=0;
			System.out.println("enter a string");
			 s=sc.nextLine();
			 System.out.println("enter word to search");
			 k=sc.next();
			 String a[]=s.split(" ");
			 for(int j=0;j<a.length;j++){
				 if(a[j].equals(k))
					 count++;
			 }
			 System.out.println("total occurance is "+ count);
			 break;
		case 6:
			System.out.println("enter two strings");
			String s1=sc.nextLine();
			String s2=sc.nextLine();
			String s3=s1.concat(s2);
			System.out.println("required string is "+s3);
			break;
		case 5:
			System.out.println("enter two strings");
			 s1=sc.nextLine();
			 s2=sc.nextLine();
			 if(s1.compareToIgnoreCase(s2)==0)
				 System.out.println("equal");
			 else
				 System.out.println("not equal");
			 break;
		case 3:
			System.out.println("enter original s1 ,enter s2,enter s3");
		    s=sc.nextLine();
		    s1=sc.nextLine();
		     s3=sc.nextLine();
		     System.out.println(s.replace(s1, s3));
		     break;
		case 4:
			System.out.println("enter string");
			s=sc.nextLine();
			char arr[]=s.toCharArray();
			Arrays.sort(arr);
			System.out.println(arr);
			break;
		case 7:
			System.exit(0);
		default:
			System.exit(0);
		}
    
	}

}
