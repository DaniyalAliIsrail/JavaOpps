package DemoClass;

public class this_super_keyword {
	
//	int x;//instance variable
//	// int x is a local variable
//	 this_super_keyword( int x) {
//		this.x = x;
//	}
//	 
//	 void setdata() {
//		 System.out.println(x);
//	 }
	
	this_super_keyword(){
		this(10);
		System.out.println("defalut constructor");
	}
	this_super_keyword(int x){
//		this();
		System.out.println("parameter constucotr" + x);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		this_super_keyword obj = new this_super_keyword();
		
	}

}
