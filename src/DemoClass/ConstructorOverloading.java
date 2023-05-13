package DemoClass;

class stu{
	private int id;
	private int add;
	
	//method or function name are same this is also called  constructor 
	
	public stu() {
		id=3;
		add=543;
	}
//	
	// basically this method are working there
	
	 public stu(int i , int a) {
		 id =i;
		 add =a;
	 }
	
  //methods	
	public int getid() {
		return id;
	}
	// methods
	public int getadd() {
		return add;
	}
}

public class ConstructorOverloading {
	public static void main(String[] args) {
		
     // constructor with parameter 		
     	stu harry = new stu();
     // the value is return by id with same constructor name	
		System.out.println(harry.getid());
//		
		stu daniyal = new stu(50,25800);
		System.out.println(daniyal.getid());
		System.out.println(daniyal.getadd());
		
	 
	}
}
