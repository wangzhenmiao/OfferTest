package introduction.faceobject.anonymousclass.thread03;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread thread = new Thread(){
			@Override
			public void run(){
				for (int i = 0; i < 5; i++) {
					System.out.println("input:"+i);
				}
			}
		};
		thread.start();
	}

}
