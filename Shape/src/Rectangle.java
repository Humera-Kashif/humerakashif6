
public class Rectangle extends Shape {
	int length;
	int width;
	
	
	public Rectangle (int len, int wid, String ShapeName){
		
		
		super(ShapeName);
		
	}
	public int area(int len, int wid)
	{
		return len*wid;
	}
	

}
