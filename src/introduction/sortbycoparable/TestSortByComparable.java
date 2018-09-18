package introduction.sortbycoparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class TestSortByComparable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Name> namelist = new ArrayList<>();
		namelist.add(new Name("wang","zhen"));
		namelist.add(new Name("zhang","feng"));
		namelist.add(new Name("li","qiang"));
		System.out.println(namelist);
		Collections.sort(namelist);
		System.out.println(namelist);
		
	}

}
