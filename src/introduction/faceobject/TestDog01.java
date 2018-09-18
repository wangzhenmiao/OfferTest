package introduction.faceobject;

class Animal01 {
	public void move() {
		System.out.println("动物可以移动");
	}
}

class Dog01 extends Animal01 {
	public void move() {
		System.out.println("动物可以移动");
	}

	public void bark() {
		System.out.println("bark");
	}
}

public class TestDog01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal01 animal = new Animal01();
		Animal01 dogAnimal = new Dog01();
		animal.move();// 执行 Animal 类的方法
		dogAnimal.move();// 执行 Dog 类的方法
		//将抛出一个编译错误，因为b的引用类型Animal没有bark方法。
		//dogAnimal.bark();
	}

}
