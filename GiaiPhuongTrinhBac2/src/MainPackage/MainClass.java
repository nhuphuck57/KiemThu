package MainPackage;

import java.util.Scanner;

public class MainClass {
	public static void main(String[] args){
	    double a,b,c,x1,x2;
	    double delta;
	    Scanner input = new Scanner(System.in);
	    System.out.print("Nhap a= ");
	    a=input.nextFloat();
	    System.out.print("Nhap b= ");
	    b=input.nextFloat();
	    System.out.print("Nhap c= ");
	    c=input.nextFloat();
	    GiaiPhuongTrinh PT1 = new GiaiPhuongTrinh(a,b,c);
	    PT1.giaiphuongtrinh();
	}
}
