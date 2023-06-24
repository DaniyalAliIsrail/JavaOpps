package DemoClass;
class Employee1{
	private int empSalary;

	//constructor
	public Employee1(int empsalary){
		this.empSalary=empsalary;
	}
	 //method
		public void work() {
			System.out.println("Employee work");
		}
	//method
	public int getsalary() {
		return empSalary;
	}
}
class hrmanager extends Employee1{
	 hrmanager(int empSalary){
		 super(empSalary);
	 }
	@Override
	public void work() {
		System.out.println("Hr manager work");
	}
	
	public void addemp(){
		System.out.println("add employee add employee");
	}
}
public class inheriq4Employee {
	public static void main(String[] args) {
		// TODO Auto-generated method 
//		Employee1 E = new Employee1(100);
//		E.work();
		//System.out.println("Employee salary is "+ E.getsalary());
		hrmanager H = new hrmanager(50);
		H.work();
		System.out.println("hr salary is "+ H.getsalary());
		H.addemp();
		H.work();
	}

}

