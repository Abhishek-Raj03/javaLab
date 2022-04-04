package lab_program;

import java.util.Scanner;
import java.util.Collections;
public class BubbleSort {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no. of elenents in array");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("enter elemens");
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
         for(int i=0;i<n-1;i++) {
        	 for(int j=1;j<n-i;j++) {
        		 if(arr[j]<arr[j-1]) {
        			int temp=arr[j-1];
        			 arr[j-1]=arr[j];
        			 arr[j]=temp;
        		 }
        	 }
         }
         System.out.println("required array is:");
         for(int i=0;i<n;i++)
        	 System.out.print(arr[i]+" ");
	}

}
