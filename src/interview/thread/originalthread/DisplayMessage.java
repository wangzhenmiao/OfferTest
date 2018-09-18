package interview.thread.originalthread;

public class DisplayMessage implements Runnable {

	private String message;
	
	public DisplayMessage(String message) {
		super();
		this.message = message;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true){
			System.out.println(message);
		}
	}

}
