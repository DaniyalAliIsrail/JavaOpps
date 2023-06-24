package DemoClass;
// polymorphism is the greek word whose meaning is "same object having different behaviour:
//types:
	//compile time error
	// Run time error

// 1) complie time polymorphism
//method overloading:
public class polymorphism {

	void add(){
		int a=5;
		int b=9;
		int c = a+b;
		System.out.println(c);
		
	}
	void add(int x , int y) {
		
		int c;
		c= x+y;
		System.out.println(c);
	}
	
	void add(int x , double d) {
		double c;
		c = x+d;
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		polymorphism a = new polymorphism();
		a.add();
        a.add(5,34);
		a.add(3,45.54);


	}

}
