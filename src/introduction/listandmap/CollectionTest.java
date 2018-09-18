package introduction.listandmap;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 虽然不建议，但是应该是可以在集合内放置不同元素的
 * @author Administrator
 *
 */
public class CollectionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection collection = new ArrayList<>();
		collection.add("xxxxxx");
		collection.add(new Integer(33));
		System.out.println(collection);
		
	}

}
