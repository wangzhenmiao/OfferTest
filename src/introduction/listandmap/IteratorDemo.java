package introduction.listandmap;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection<String> c = new ArrayList<>();
		   //创建并添加元素
        c.add("hello");
        c.add("world");
        c.add("java");
        
        Iterator<String> it = c.iterator();
        while(it.hasNext()){
        	System.out.println(it.next());
        }
	}
}
