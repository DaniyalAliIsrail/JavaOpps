package DemoClass;
class Shape{
	private int area;
	
	public int getterarea() {
		return area;
	}
	public void setterarea(int a) {
		this.area=a;
	}

	public int getArea() {
		return area *area;
	}
}
class Rectangle extends Shape{
	private int length1;
	private int width1;
	
	public int getlenth() {
		return length1;
	}
	public void setlenth(int l) {
		this.length1=l;
	}
	public int getwidth() {
		return width1;
	}
	public void setwidth(int w) {
		this.width1=w;
	}
	@Override
	public int getArea() {
		return length1*width1;
	}
}
public class inheriQ3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Shape getshape= new Shape();
	getshape.setterarea(5);// 5
	System.out.println("area is"+getshape.getArea());
	
	Rectangle getrectangle = new Rectangle();
	getrectangle.setlenth(2);
	getrectangle.setwidth(3);
	System.out.println("the area of rectangle is"+getrectangle.getArea());
	
	}
}
