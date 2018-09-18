package faceobject.thissuper;

class Animal{
	void eat(){
		System.out.println("animal : eat");
	}
}

class Dog extends Animal{
	void eat(){
		System.out.println("dog : eat");
	}
	void eatTest(){
		this.eat(); // this调用自己的方法
		super.eat(); // super调用父类的方法
	}
}
public class ThisAndSuper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog = new Dog();
		dog.eat();
		dog.eatTest();
	}

}
