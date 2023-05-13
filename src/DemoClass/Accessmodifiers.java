package DemoClass;
class myEmp{
	private int id;
	private String name;
	
	public void setid(int i){
		this.id = i;
	}
	public int getid(){
		return id;
	}
	public String getname() {
		return name;
	}
	public void setname(String n) {
		name = n;
	}
	
	
}
public class Accessmodifiers {
	public static void main(String[] args) {

	myEmp jhon = new myEmp();
	jhon.setid(32);
	System.out.println(jhon.getid());
	
	jhon.setname("daniyalaliisrail");
	System.out.println(jhon.getname());
	
	// jhon.id =34;        --> this line are error through because method are private  
	// jhon.name = "dani";  --> this line are error through because method are private 
	
	// set value:
	
	
	
	
	
	
	
	
	}	
}
