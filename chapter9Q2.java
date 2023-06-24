package DemoClass;
        class Cy1{
        	private int radius;
        	private int height;
        	
//        	//setter radius
//        	public void setRadius(int r) {
//        		this.radius = r;
//        	}
//        	//getter radius
//        	public int getRadius() {
//        		return radius;
//        	}
        	
//        	//setter height
//        	public void setHeight(int r) {
//        		this.radius = r;
//        	}
//        	//getter height
//        	public int getHeight() {
//        		return radius;
//        	}
//        	
//        	public double AreaOfCylinder() {
//        		return 2*3.14*radius*height + 2 *3.14*radius*radius;
//        	}
//        	jo km getter setter say keya hay wo constructor say krao
        	//constructor
        	
        	public Cy1(){
        	  this.height=3;
        	  this.radius =2;
        	}
        	
        	public int getradius() {
        		return radius;
        	}
        	public int getheight(){
        		return height;
        	}
        	
        	public double areaOfCircle() {
        		return 2 * 3.14*radius*radius + 2*3.14*radius*height;
            }
        	}
public class chapter9Q2 {
	
	public static void main(String[] args) {
		
		//object
		Cy1 cylinder = new Cy1();
		System.out.println(cylinder.getradius());
		System.out.println(cylinder.getradius());
		System.out.println(cylinder.areaOfCircle());
//		cylinder.setRadius(3);
//		cylinder.setHeight(4);
//		System.out.println(cylinder.AreaOfCylinder());
	}

}
