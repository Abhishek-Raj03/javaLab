package lab_program;
import java.util.Scanner;

public class fibWithoutRecursion {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] fib=new int[n];
		fib[0]=0;
		fib[1]=1;
		System.out.print(fib[0]+" "+fib[1]+" ");
		for(int i=2;i<n;i++) {
			fib[i]=fib[i-1]+fib[i-2];
			System.out.print(fib[i]+" ");
		}
}

}