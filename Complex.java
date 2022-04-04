package lab_program;
import java.util.Scanner;

public class Complex {
	int real,img;
	Complex(int real,int img){
		this.real=real;
		this.img=img;
	}
	public static Complex sum(Complex c1,Complex c2) {
		Complex temp=new Complex(0,0);
		temp.real=c1.real+c2.real;
		temp.img=c1.img+c2.img;
		return temp;
	}
	public static Complex dif(Complex c1,Complex c2) {
		Complex temp=new Complex(0,0);
		temp.real=c1.real-c2.real;
		temp.img=c1.img-c2.img;
		return temp;
	}
	public static Complex mul(Complex c1,Complex c2) {
		Complex temp=new Complex(0,0);
		temp.real=(c1.real*c2.real)-(c1.img*c2.img);
		temp.img=(c1.real*c2.img)+(c1.img*c2.real);
		return temp;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter real and img of first complex");
        int real=sc.nextInt();
        int img=sc.nextInt();
        Complex c1=new Complex(real,img);
        
        System.out.println("enter real and img of second complex");
        int real1=sc.nextInt();
        int img1=sc.nextInt();
        Complex c2=new Complex(real1,img1);
        
        Complex temp=sum(c1,c2);
        Complex temp1=dif(c1,c2);
        Complex temp2=mul(c1,c2);
        System.out.println("sum = "+temp.real+"+"+temp.img+"i");
        System.out.println("diff = "+temp1.real+"+"+temp1.img+"i");
        System.out.println("product = "+temp2.real+"+"+temp2.img+"i");
	}

}
