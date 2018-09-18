package introduction.listandmap;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TraversalList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <String>list = new ArrayList<String>();
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		//第一种遍历方法使用foreach遍历List
		for (String string :list) {
			System.out.println("foreach遍历："+string);
		}
		for(int i=0;i<list.size();i++){
			System.out.println("list.size()："+list.get(i));
		}
		
		//第二种遍历，把链表变为数组相关的内容进行遍历
		String [] arr = new String[list.size()];
		list.toArray(arr);
		 for(int i=0;i<arr.length;i++) //这里也可以改写为  foreach(String str:strArray)这种形式
	     {
	        System.out.println("list.toArray(arr)："+arr[i]);
	     }
		 
		//第三种遍历 使用迭代器进行相关遍历
		 Iterator<String> iterator = list.iterator();
		 while (iterator.hasNext()){
			 System.out.println("list.itetator()："+iterator.next());
		 }
	}

}
