package DemoClass;
class rectangle1{
	private float lenght;
	private int height;
	
	//constructor with initalized value:
	public rectangle1() {
		this.lenght =4;
		this.height =5;
	}
	
	//constructor with custom parameter
	public rectangle1(float l , int h) {
		this.lenght = l;
		this.height = h;
	}
	public float getlenght() {
		return lenght;
	}
	public int getheight() {
		return height;
	}
}

public class chapter9Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//object
		
		rectangle1 rect = new rectangle1(2,4);
		System.out.println(rect.getlenght());
		System.out.println(rect.getheight());
		
//		rectangle jhon = new rectangle();
//		System.out.println(jhon.getlenght());
//		System.out.println(jhon.getheight());
//		
		

	}

}
