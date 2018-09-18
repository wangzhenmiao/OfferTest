package introduction.faceobject;

class Animal{
	public void move(){
		System.out.println("动物可以移动");
	}
}

class Dog extends Animal{
	public void move(){
		System.out.println("狗是跑和跳的");
	}
}
public class TestDog {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal animal = new Animal();
		Animal dog = new Dog();
		animal.move();
		dog.move();
	}

}
