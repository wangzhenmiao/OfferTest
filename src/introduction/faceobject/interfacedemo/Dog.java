package introduction.faceobject.interfacedemo;

public class Dog implements Animal {

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("dog eats");
	}

	@Override
	public void travel() {
		// TODO Auto-generated method stub
		System.out.println("dog travel");
	}
	
	public void sleep() {
		System.out.println("dog sleep");
	}
	
	public static void main(String args[]){
	      Dog m = new Dog();
	      m.eat();
	      m.travel();
	      m.sleep();
	   }
}
