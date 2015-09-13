import java.util.Scanner;
public class oval extends Shape{
	
	public double x,y;
	
	public String ShapeName,col;
	Scanner scn = new Scanner(System.in);
	public oval (double x, double y){
	
		super("Oval");
	this.x=x;
	this.y=y;
	}
	public oval (String ShapeName)
	{

		super(ShapeName);
	}
			
	public double area() {
		return Math.PI*x*y;
		
	}
	public double perimeter()
	{
		return 2*Math.PI*x*y;
	
	}
	
	public String color()
	
	{
		col=scn.next();
	return col;	
	}	
}
