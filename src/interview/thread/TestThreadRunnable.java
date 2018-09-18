package interview.thread;

class RunnableDemo implements Runnable{
	private Thread t;
	private String threadName;
	
	public RunnableDemo(String treadName) {
		super();
		threadName = treadName;
		System.out.println("Creating " +  threadName );
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		 System.out.println("Running " +  threadName );
		 try{
			for(int i=4;i>0;i--){
				System.out.println("Thread: " + threadName + ", " + i);
	            // 让线程睡眠一会
	            Thread.sleep(50);
			   }
			} catch (InterruptedException e) {
				// TODO: handle exception
				System.out.println("Thread " +  threadName + " interrupted.");
			}
		 System.out.println("Thread " +  threadName + " exiting.");
	}
	
	public void startMyThread(){
		System.out.println("Starting " +  threadName );
		if (t== null) {
			t = new Thread(this,threadName);
			t.start();
		}
	}
 }


public class TestThreadRunnable {

	public static void main(String args[]) {
		RunnableDemo R1 = new RunnableDemo( "Thread-1");
		R1.startMyThread();
	/*	Thread t1 = new Thread(R1);
		t1.start();*/
		
		RunnableDemo R2 = new RunnableDemo("Thread-2");
		R2.startMyThread();
	}
}
