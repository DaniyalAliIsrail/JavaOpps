package DemoClass;

class Vehicle{
	public void drive(){
		System.out.println("drive");
	}
	
}
 class car extends Vehicle{
	 @Override
	 public void drive() {
		 System.out.println("reparing a car");
	 }
 }

public class inhayq1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		car getcar = new car();
		getcar.drive();
		
	}

}
