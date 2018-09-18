package introduction.designpattern.single.demo3;

public class SingletonPatternTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//调用new实例化对象
		//报错：The constructor Singleton() is not visible
		//Singleton singleton = new Singleton();
		Singleton singleton = Singleton.getInstance();
	}

}
