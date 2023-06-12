package DemoClass;

class base{
	int x;
	//get value
	public int getx() {
		System.out.println("base class");
		return x;
	}
	//set value
	public void setx(int x) {
		this.x = x;
	}
}
// class extend
class derived extends base{
	int y;
	//getter
	public int gety(){
		System.out.println("derived class");
		return y;
	}
	//setter
	public void sety(int y) {
		this.y = y;
	}
}

public class inheritance {
	public static void main(String[] args) {
		// base object
		base b = new base();
		b.setx(12);
		System.out.println(b.getx());
		// derived object
		derived d = new derived();
		d.sety(100);
		// base class ko access keya derived class k obj k help say
		System.out.println(d.gety());
		d.setx(100);
		System.out.println(d.getx());
		
	}
	
}

