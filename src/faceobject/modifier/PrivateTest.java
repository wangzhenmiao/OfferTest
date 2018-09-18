package faceobject.modifier;

public class PrivateTest {

	private int a = 0 ;
	
	public void getA(){
		System.out.println("a:"+a);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrivateTest pTest = new PrivateTest();
		pTest.getA();
	}

}
