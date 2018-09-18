package introduction.stringpractice;

import java.util.Arrays;

public class StringContact {

	//jdk代码,有问题，待思考
/*	  public static String concat(String paramString,String src)
	  {
	    int i = paramString.length();
	    if (i == 0) {
	      return src;
	    }
	    int j = src.toCharArray().length;
	    char[] arrayOfChar = Arrays.copyOf(src.toCharArray(), j + i);
	    paramString.getChars(arrayOfChar, j);
	    return new String(arrayOfChar, true);
	  }*/
	  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String aString = "hh";
		String bString = "aa";
		String cString = aString.concat(bString);
		System.out.println("拼接后："+cString);
	}

}
