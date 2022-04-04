package javaLab7_10;
import java.util.Scanner;

public class TwoWheeler extends Vehicle {
	Scanner sc=new Scanner(System.in);
    String colour;
    String modal;
	TwoWheeler(int yom,String colour,String modal){
    	   super(yom);
    	   this.colour=colour;
    	   this.modal=modal;
       }
	public String getData() {
		return "Two wheeler: "+modal+" "+colour+" "+yom;
	}
	public void putData() { 
		yom=sc.nextInt();
		sc.nextLine();
		colour=sc.next();
		modal=sc.next();
	}
}
