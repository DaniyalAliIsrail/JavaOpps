package DemoClass;
//1. Write a Java program to create an abstract class Animal with an 
//abstract method called sound(). Create subclasses Lion and Tiger 
//that extend the Animal class and implement the sound() method to make a 
//specific sound for each animal.
abstract class Animal{
	public abstract void sound();
}
class lion extends Animal{
	@Override
	public void sound(){
		System.out.println("the lion is roar");
	}
}
class Tiger extends Animal{
	@Override
	public void sound() {
		System.out.println("the lion is gurar");
	}
}
public class absQ1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tiger a = new Tiger();
		a.sound();
		lion l = new lion();
		l.sound();
	}
}
