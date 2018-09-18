package introduction.stringpractice;

import java.util.Arrays;

public class ArrToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char [] arr = {'c','d','e'};
		//String类有多种构造方法
		// String(char[] value)
		String string = new String(arr);
		System.out.println("new String(char [])："+string); //输出：cde
		
		System.out.println("Arrays.toString()："+Arrays.toString(arr)); //输出：[c, d, e]
	}

}
