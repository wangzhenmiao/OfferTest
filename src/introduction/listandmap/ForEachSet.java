package introduction.listandmap;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class ForEachSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection<String> collection = new HashSet<>();
		collection.add("qqqqq");
		collection.add("aaaa");
		collection.add("ccccc");
		Iterator<String> iterator = collection.iterator();
		while(iterator.hasNext()){
			System.out.println("set:"+iterator.next());
		}
	}

}
