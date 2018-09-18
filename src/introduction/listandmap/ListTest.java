package introduction.listandmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Character> list = new ArrayList<Character>();
		//// 向集合中追加元素
		list.add('a');
		// 向集合的制定位置中追加元素
		list.add(1,'b');
		System.out.println(list);
		// 向集合追加一个collection，只可追加collection
		list.addAll(list);
		System.out.println(list);
		// 与上述含义相同， “4”意为追加元素所放的位置
		 list.addAll(4, list);
		 System.out.println(list);
		 int i = list.size();// 长度
	     System.out.println("list.size()获取长度："+i);
	     list.get(0);// 根据元素下标来取集合中的元素
	     System.out.println("list.get(index)获取元素："+list.get(0));
	     System.out.println("list.remove(index)删除元素前："+list);
	     list.remove(1);// 根据集合中元素下标位置来删除元素
	     System.out.println("list.remove(index)删除元素前："+list);
	     
	     System.out.println("list.contains()："+list.contains('a'));
	        
	     //方式一、list-->String []
	     List<String> listStr = new ArrayList<String>();
	     listStr.add("aaa");
	     listStr.add("bbb");
	     listStr.add("bbb");
	     listStr.add("aaa");
	     String [] arr = (String[]) listStr.toArray(new String[listStr.size()]);
	     System.out.println(Arrays.toString(arr));
	     
	     //方式二、list-->String[]
	     String [] arr2=new String [listStr.size()];
	     listStr.toArray(arr2);
	     for(String arrs: arr2) {
	          System.out.println(arrs);
	     }
	     
	     /*代码分析：
	      * 1、实质都是调用list类的，<T> T[] toArray(T[] a)方法*/
	     System.out.println(list.isEmpty());//false
	     System.out.println(null!=list);//true
	     
	     list.equals(arr);//false
	     System.out.println(list.equals(arr));
	     
	     //用list.indexOf(str)方法判断list中是否有指定的str元素,没有返回-1，有则返回索引
	     list.indexOf("aaa");
	     System.out.println("用list.indexOf(str):"+listStr.indexOf("aaa"));
	     
	     //lastIndexOf源码实现是倒着遍历数组，既从末尾开始遍历，第一次找到的，就是最后一个咯！
	     System.out.println("用list.lastIndexOf(str):"+listStr.lastIndexOf("aaa"));
	   //打印集合元素
	     Iterator<String> it=listStr.iterator();
	        while(it.hasNext()) {
	            String string=(String) it.next();
	            System.out.println(string);
	        }
	        //方式二：
	        for (Object o:listStr) {
	            System.out.println(o);
	        }
	        //方式三：
	        for(int s=0;s<listStr.size();s++) {
	            System.out.println(listStr.get(s));
	        }
	        //将list释放，元素清空，且无返回值
	        list.clear();
	        System.out.println(list);
	}

}
