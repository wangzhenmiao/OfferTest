package introduction.listandmap;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class CollectionsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new LinkedList<>();
		for(int i=0;i<9;i++)
		list.add("a"+i);
		System.out.println("original:"+list);
		//随机排序
		Collections.shuffle(list);
		System.out.println("Collections.shuffle:"+list);
		//倒叙
		Collections.reverse(list);
		System.out.println("Collections.reverse:"+list);
		//排序
		Collections.sort(list);
		System.out.println("Collections.sort:"+list);
		//二分查找
		int index = Collections.binarySearch(list, "a5");
		
	}

}
