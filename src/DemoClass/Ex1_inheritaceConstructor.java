package DemoClass;

class Base1{
	Base1(){
		System.out.println("Constructor base BAse1");
	}
	Base1(int x){
		System.out.println("overloading cons base1 the value of x"+x);
		
	}
}
class derived1 extends Base1{
	derived1(){
		//super(22);
		System.out.println("Constructor base Derived1");
	}

	
	derived1(int x ,int y){
		super(x);
		System.out.println("overloading constructor Derived1 the value of y is"+y);
	}
}
	
	class derivedofchild extends derived1{
		derivedofchild(){
			System.out.println("i am DerivedofChild constuctor");
		}
		derivedofchild(int x,int y, int z){
			super(x,y);
			System.out.println("i am overloaded constructor of z"+z);
			
		}	
		
	}

public class Ex1_inheritaceConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
//	derived1 d = new derived1(2,3);
	derivedofchild cd = new derivedofchild(2,3,4);
	}

}
