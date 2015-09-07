import java.util.Scanner;

public class Main {
	public static void main (String[] args){
		
		
		int wid, len ,radius;
		
		Scanner scn = new Scanner(System.in);
		
		
		//Shape objShape = new Shape("NOSHAPE");
		//System.out.println(objShape.ShapeNAme);

		
		
		System.out.println("Enter Width For Rect");
		wid = scn.nextInt();
		System.out.println("Enter Length For Rect");
		len = scn.nextInt();
		Rectangle objRectangle = new Rectangle(wid, len, "RECTANGLE");		
		System.out.println(objRectangle.ShapeNAme);
		System.out.println("area is"  + objRectangle.area(len, wid));
		
		System.out.println("Enter Side For Square");
		wid = scn.nextInt();
		Square objsquare = new Square(wid);		
	    System.out.println(objsquare.ShapeNAme);
		
		System.out.println("Enter radius of circle");
	    radius = scn.nextInt();
		Circle objCircle = new Circle (radius,"Circle");
		System.out.println(objCircle.ShapeNAme);
		
		//System.out.println("Enter Length");
				
		//len = scn.nextInt();
		
		
		
		
		///Square objSquare = new Square();
		
		
	}

}
