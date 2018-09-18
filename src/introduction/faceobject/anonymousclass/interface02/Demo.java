package introduction.faceobject.anonymousclass.interface02;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person = new Person() {
			
			@Override
			public void eat() {
				// TODO Auto-generated method stub
				System.out.println("eat something");
			}
		};
		person.eat();
	}

}
