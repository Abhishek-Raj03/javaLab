package javaLab7_10;

public class MyTwoWheeler extends TwoWheeler{
    String store;    
	MyTwoWheeler(int yom,String colour,String modal){
        	super(yom,colour,modal);
        }
	public String getData() {
		return super.getData()+" purchased at "+store;
	}
	public void putData() {
		yom=sc.nextInt();
		sc.nextLine();
		colour=sc.next();
		modal=sc.next();
	}
} 
