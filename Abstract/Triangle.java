import java.util.Scanner;
public class Triangle extends Shape {
	
	public double b;
	public double h;
	public double a;
	public double c;
	public String col;
	
	Scanner scn = new Scanner(System.in);
	public Triangle (double b,double h,double a,double c){
		super("Triangle");
		this.b=b;		this.h=h;		this.a=a;		this.c=c;

	
	}
public double area()
{
	return ((b*h)/2);
}
public double perimeter()
{
	return a+b+c;
}
public String color()

{
col=scn.next();
return col;	

}

}
