import java.util.Scanner;
public class Rectangle extends Shape {
	public double len;
	public double wid;
	public String col;
	double roundoff = Math.round(len);

	
	Scanner scn = new Scanner(System.in);
	
	public Rectangle (double len, double wid){
		
		super(" Rectangle");
		this.len=len;
		this.wid=wid;
		
	}
	public Rectangle (String ShapeName)
	{

		super(ShapeName);
		this.len=len;
		this.wid=wid;
			
	}
	public double area() {
		return len* wid;
		
	}
	public double perimeter()
	{
		return 2*(len + wid);
	
	}
	
	public String color()
	
	{
	col=scn.next();
	return col;	
	
	}
}
