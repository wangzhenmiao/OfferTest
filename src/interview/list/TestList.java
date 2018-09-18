package interview.list;

import java.util.ArrayList;
import java.util.List;

public class TestList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<>();
		list.add(3);
		list.add(4);
		list.add(7);
		for(int i=0;i<list.size();i++){
			if(list.get(i)>2){
				System.out.println("hhhhhhhh");
				list.add(0);
				System.out.println("list元素："+list);
				System.out.println("list的长度："+list.size());
			}
		}
		System.out.println(list);
	}

}
