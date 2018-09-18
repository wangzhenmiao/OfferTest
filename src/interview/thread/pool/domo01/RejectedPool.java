package interview.thread.pool.domo01;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class RejectedPool implements Runnable{
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try{
			Thread.sleep(300);
			System.out.println("************run函数");
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args)
    {
        LinkedBlockingQueue<Runnable> queue =
            new LinkedBlockingQueue<Runnable>(3);
        RejectedExecutionHandler handler = new ThreadPoolExecutor.DiscardPolicy();

        ThreadPoolExecutor threadPool = new ThreadPoolExecutor(2, 5, 60, TimeUnit.SECONDS, queue,handler);
        for (int i = 0; i < 9 ; i++)
        {
            threadPool.execute(
                new Thread(new RejectedPool(), "Thread".concat(i + "")));
            System.out.println("线程池中活跃的线程数： " + threadPool.getPoolSize());
            if (queue.size() > 0)
            {
                System.out.println("----------------队列中阻塞的线程数" + queue.size());
            }
        }
        threadPool.shutdown();
    }

}
