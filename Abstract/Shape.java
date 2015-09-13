
public abstract class Shape {
	
	public String ShapeName,col;
	
	
	public Shape (String name){
	 ShapeName = name;}
	
	 public abstract double area();
	 public abstract double perimeter();
	 public abstract String color();

	 public String tostring()
	 {
		 return ShapeName;
	 }
	 
	}


