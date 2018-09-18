package introduction.queuedeque;

import java.util.Deque;
import java.util.LinkedList;

public class DequeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Deque<String> deque = new LinkedList<String>();
        deque.push("a");
        deque.push("b");
        deque.push("c");
        System.out.println(deque);
        //获取栈首元素后，元素不会出栈
        String str = deque.peek();
        System.out.println("取元素："+str);
        System.out.println(deque);
        while(deque.size() > 0) {
            //获取栈首元素后，元素将会出栈
            System.out.println("取元素："+deque.pop());
        }
        System.out.println(deque);
    }

	/*代码分析：双向队列(Deque),是Queue的一个子接口*/
}
