package DemoClass;

class student{
	private int id;
	private String name;
	
//	public student() {
//		id=244;
//		name="daniyal" ;
//	}
	
	public student(int i , String n) {
		id=i;
		name= n;
	}

	public int getid() {
		return id;
	}
	public String getname() {
		return name;
	}
}

public class Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//with out parameter:
//		student harry= new student();
		//student harry= new student();
		
		// with parameter:
		student harry= new student(23,"israil");
		System.out.println(harry.getid());
		System.out.println(harry.getname());
	}

}
