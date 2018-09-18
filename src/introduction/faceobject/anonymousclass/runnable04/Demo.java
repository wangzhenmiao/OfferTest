package introduction.faceobject.anonymousclass.runnable04;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable runnable = new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				for (int i = 0; i < 5; i++) {
					System.out.println("input:"+i);
				}
			}
		};
		Thread thread = new Thread(runnable);
		thread.start();
	}

}
