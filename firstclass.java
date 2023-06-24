package DemoClass;

 class Employee{
	int id;
	String Name;
	int salary;
	int phoneNum;
	String pata;
	
	public void printDetails() {
		System.out.println("my Emloyee id is : " + id);
		System.out.println("my Emloyee name is : " + Name);
		System.out.println("my Emloyee Salary is : " + salary);
		System.out.println("my Emloyee phoneNumber is :" + phoneNum);
	}
	
	public String getpata() {
		return pata;
	}
	
}

 public class firstclass {
	 
	public static void main(String[] ags) {
		System.out.println("this is our first custom class");
		
		Employee harry = new Employee();
		Employee jhon = new Employee();
		
		//setting attributes for harry:
		harry.id = 12;
		harry.Name = "daniyal ali";
		harry.salary = 200;
		harry.phoneNum = 16;
		harry.pata = "benazir";
		
		
		//setting attributes for jhon:
		jhon.id = 19;
		jhon.Name = "ali ammar";
		jhon.salary = 100;
		jhon.phoneNum = 03;	
		jhon.pata = "discomor";
				
				
		// mujhy srf harry ka detail chahye
		harry.printDetails();
		jhon.printDetails();
		String pata = harry.getpata();
		System.out.println(pata);
		}
	}
	
//		// TODO Auto-generated method stub
//		// int float string char double long=2x10^18  
//		
////		int aa = 5;
////		float bb = 4.44f; flaot lay last may f lagay ga
////		char cc = 4;
////		String myString = "Hello, World!";
////		double dd = 34456556l;
////		System.out.println(aa);
////		System.out.println(myString);
//		
//		//operator
//		//ARITHMATIC OPERATOR + , - , / , % , ++ , --
//		
//		//USER INPUT
////		Scanner sc = new Scanner(System.in);
////		System.out.println("please enter your age:");
////		int age = sc.nextInt();
////		float age1 = sc.nextFloat();
////		System.out.println(age);
////		System.out.println(age1);
////		(
////        Scanner sc = new Scanner(System.in);
////        System.out.println("enter your string;");
////        String name = sc.nextLine(); // string input
////        System.out.println(name);
////        
////        int age = sc.nextInt(); //integer input
////        System.out.println(age);     
////        
//        // Conditional Operator:
//		// > , < , >= , <= , != , ==
//        
////		Scanner userInput = new Scanner(System.in);
////		System.out.println("Enter your age:");
////		int age = userInput.nextInt();
////		System.out.println(age);
////		if(age >= 18 && age <= 20) {
////			System.out.println("drive a car solwly");
////		}else if(age >= 21){
////			System.out.println("dive a car fast");
////		}
////		else {
////			System.out.println("your age is less than 18 not drive a car");
////		}		
//		
//		// Switch case:
//		
////		char grade = 'C';
////		
////		switch(grade) {
////		case 'A':
////			System.out.println("case a excecute");
////			break;
////		case 'B':
////			System.out.println("case b excecute");
////			break;
////		case 'C':
////			System.out.println("case c excecute");
////			break;
////	    default:
////	    	System.out.println("wrong argument");
////	    
////		}
//		
//		// loop concept
//		// for loop ,while loop , do-while loop
//		
//		//print 1 to 100 using for loop
//		
////		for(int i=0; i<=10; i++) {
////			System.out.println(i);
////		}
//		
////		// while loop syntax;
////		initialize; i = 0
////		while(condition) {
////			(statment); kch bhy a skta hay bhai conditon loop kch bhy askta hay
//	  //     increment or decrement
////		}`
////		while loop program print 1 to 10 number using while loop
////		int i = 0;
////		while(i<10) {
////			System.out.println(i);
////			i++;
////		}
//		
////		do while loop syantax
////		int i =1;		
////		 do {
////			 System.out.println(i);
////			 i++;
////		 }while(i>10);
//		
//		// Array
////		 int marks[] = {23,45,65,55,66};
////		 for(int i=0; i<marks.length; i++) {
////			 System.out.println(marks[i]);
////		 }
//
//		
//		//2d array matrix
//		
////		int marks[][] = {
////				{
////			1,2
////			},{
////				44,88
////				}
////		};
//		//axis krna 44 ko
//		
////		System.out.println(marks[1][0]);
////		System.out.println(average(3,6));
//		int a[]= new int[3];
//		try {
//			System.out.println(a[4]);
//		
//			
//		}
//		
//	
////		//Method || function ko methdo bhy bolty hay
////		
////		static int average(int fNum ,int secNum) {
////			int sum = fNum + secNum;
////			return sum/2;
////		
////		}
//		
//		
//		
//			
//}