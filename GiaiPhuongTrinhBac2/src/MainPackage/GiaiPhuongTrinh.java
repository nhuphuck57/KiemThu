package MainPackage;

import java.lang.Math;

public class GiaiPhuongTrinh {
	float a,b,c;
	double delta;
	GiaiPhuongTrinh(double a2, double b2, double c2){
		this.a=(float) a2;
		this.b=(float) b2;
		this.c=(float) c2;
	}
	public double[] giaiphuongtrinh(){
		double[] x = new double[2];
		delta=(b*b)-(4*a*c);
		if(delta<0){
			System.out.println("phuong trinh vo nghiem");
		}
		if(delta==0){
			System.out.println("phuong trinh co nghiem kep");
			x[0]=x[1]= -b/(2*a);
		}
		if(delta>0){
			System.out.println("phuong trinh co 2 nghiem");
			x[1]=(float) ((-b+Math.sqrt(delta))/(2*a));
			x[2]=(float) ((-b-Math.sqrt(delta))/(2*a));
		}
		return(x);
	}
}
	
