
import java.util.Scanner;
public class Trapezoid extends Shape {
	public double a;
	public double b;
	public double h;
	public double c;
	public double d;
	public String col;
	
	Scanner scn = new Scanner(System.in);
	public Trapezoid (double a, double b,double c, double d, double h){
		super("Trapezoid");
		this.a=a; this.b=b; this.c=c; this.d=d; this.h=h;
	}
public double area()
{
	return ((a+b)/2)*h;
}
public double perimeter()
{
	return a+b+c+d;
}
public String color()

{
col=scn.next();
return col;	

}

}
