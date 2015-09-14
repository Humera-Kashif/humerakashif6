
public class Abstract {
		public static void main (String[] args){
			
			
	int i;
	
	Shape[] shapeList =  new Shape[7];
    shapeList[0] = new Circle(3.0);
    shapeList[1] = new Rectangle(3.0,4.0);
    shapeList[2] = new Rectangle(5.0,9.0);
    shapeList[3] = new oval(3.0,4.0);
    shapeList[4] = new Square(2.0);
    shapeList[5] = new Triangle(2.0,1.0,3.0,4.0);
    shapeList[6] = new Trapezoid(2.0,1.0,1.0,2.0,2.0);
    
	for(i=0;i<shapeList.length;i++){
		System.out.print(shapeList[i].tostring());
		System.out.print(shapeList[i].area()+" ");
		System.out.println(shapeList[i].perimeter()+ " ");
		System.out.print("Color?");
		System.out.println(shapeList[i].color());
	}
		}
	

}
