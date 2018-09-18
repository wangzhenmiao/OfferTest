package introduction.stringpractice;

public class StringCompareEmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = "Hello world!";
		String anotherString = "hello world!";
		Object objStr = string;
		
		System.out.println(string.compareTo(anotherString));
		System.out.println(string.compareToIgnoreCase(anotherString));
		System.out.println(string.compareTo(objStr.toString()));
		
	}

	// A的ASCII是65，a的ASCII是97
/*	输出：
	-32
	0
	0
	既string-anotherString
	*/
}
