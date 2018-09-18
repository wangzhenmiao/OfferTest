package frequentlycommon.teststr;

import java.util.Arrays;

public class ConvertStrChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "abcdef";
		char c1 = a.charAt(0);
		char c2 = a.charAt(1);
		char[] arr = a.toCharArray();
		System.out.println("string-->char"+c1);
		System.out.println("string-->char[]:"+Arrays.toString(arr));
		//
		char m = 'a';
		char[] marr = {'a','b','d'};
		String test1 = String.valueOf(m);
		String test2 = String.valueOf(marr);
		System.out.println("char-->String:"+test1);
		System.out.println("char[]-->String:"+test2);
		//
		int i = 5;
		//5、String.valueOf(int i),返回字符串，可以把int转成字符串
		String intStr0 = String.valueOf(i);
		//6、Integer.toString(int i) 把int转成String
		String intStr1 = Integer.toString(i);
		System.out.println("String.valueOf():"+intStr0+",Integer.toString():"+intStr1);
		
		//四、String--->int
		String intStr2 = "37";
		//7、Integer.parseInt(String str)
		int iStr = Integer.parseInt(intStr2);
		System.out.println("Integer.parseInt():"+iStr);
		//8、Integer.valueOf(String str).intValue(),String转成int
		int iStr1 = Integer.valueOf(intStr2).intValue();
		System.out.println("Integer.valueOf():"+iStr1);
		
	}

}
