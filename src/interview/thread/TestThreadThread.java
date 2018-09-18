package interview.thread;

class ThreadDemo extends Thread{
	private Thread t;
	private String threadName;
	public ThreadDemo(String threadName) {
		super();
		this.threadName = threadName;
		System.out.println("Creating " +  threadName );
	}
	
	public void run(){
		System.out.println("Running " +  threadName );
		try{
			for(int i=4;i>0;i--){
				System.out.println("Thread: " + threadName + ", " + i);
	            // 让线程睡眠一会
				Thread.sleep(50);
			}
		}catch(InterruptedException e){
			 System.out.println("Thread " +  threadName + " interrupted.");
		}
		System.out.println("Thread " +  threadName + " exiting.");
	}
	
	public void start(){
		System.out.println("Starting " +  threadName );
		if (t== null) {
			t = new Thread(this,threadName);
			t.start();
		}
	}
}
public class TestThreadThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadDemo td1 = new ThreadDemo("Thread-1");
		td1.start();
		
		ThreadDemo td2 = new ThreadDemo("Thread-2");
		td2.start();
		
	}

}
