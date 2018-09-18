package frequentlycommon.testlist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<>();
		//增加元素
		list.add("java");
		list.add("python");
		list.add("linux");
		list.add("hello");
	    list.add("world");
	    //查看长度
	    System.out.println("ArrayList长度："+list.size());
	    //遍历
	    for(int i=0 ;i<list.size();i++){
	    	System.out.println(i+":"+list.get(i));
	    }
	    System.out.println("===我是快乐的分隔符===");
	    //固定位置插入
	    list.set(3, "haha");
	    for(int i=0 ;i<list.size();i++){
	    	System.out.println(i+":"+list.get(i));
	    }
	    System.out.println("===我是快乐的分隔符===");
	    //固定位置删除
	    list.remove(1);
	    for(int i=0 ;i<list.size();i++){
	    	System.out.println(i+":"+list.get(i));
	    }
	    System.out.println("===我是快乐的分隔符===");
	    //ArrayList和数组交互
	    String [] arr = new String[list.size()];
	    arr = list.toArray(arr);
	    System.out.print("输出数组："+Arrays.toString(arr));
	}

}
