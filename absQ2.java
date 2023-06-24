package DemoClass;
//Write a Java program to create an abstract class 
//Shape with abstract methods calculateArea() and calculatePerimeter(). 
//Create subclasses Circle and Triangle that extend the Shape class and 
//implement the respective methods to calculate the area 
//and perimeter of each shape.
abstract class Shape{
	public abstract double calculateArea();
	public abstract double calculatePerimeter();
}
class Circle1 extends Shape{
	int radius;
	int l;
	int w;
	Circle1(int radius ,int l, int w){
		this.radius=radius;
		this.l=l;
		this.w=w;
	}
	@Override
	public double calculateArea(){
		System.out.println("the area of circle ");
		return 2*3.14*radius;
	}
	@Override
	public double calculatePerimeter(){
//		System.out.println("the area of perimeter");
		return(l+w)*2;
	}
}
public class absQ2{
	public static void main(String arg[]) {
		Circle1 c = new Circle1(5,50,25);

		   double area = c.calculateArea();
		   double perimeter = c.calculatePerimeter();
		   System.out.println("Area: " + area);
		   System.out.println("Perimeter:"+perimeter);
	}
}