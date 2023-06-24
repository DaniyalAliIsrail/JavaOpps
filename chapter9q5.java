package DemoClass;
class sphere{
	private int radius;
	
	//constructor:
	public sphere(int r){
		this.radius = r;
	}
	//getter for radius
	public int getsphere() {
		return radius;
	}
	
	//getter for area of sphere
	
	public double areaOfSphere() {
		return 4*Math.PI*radius;
	}
	
	
}

public class chapter9q5 {
	public static void main(String[] args) {
		
		//object
		
		sphere area = new sphere(2);
		System.out.println("area of sphere is "+area.areaOfSphere());
	}

}
