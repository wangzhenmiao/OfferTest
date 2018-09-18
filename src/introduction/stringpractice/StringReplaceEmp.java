package introduction.stringpractice;

import java.util.Arrays;

public class StringReplaceEmp {

	
	//自己手动实现字符替换
	public static String myReplaceChar(char oldChar,char newChar,String str){
		char [] strArr = str.toCharArray();
		int len = strArr.length;
		char [] arr = new char[len];
		if (oldChar == newChar) {
			return str;
		}
		for(int i=0;i<len;i++){
			if (strArr[i] == oldChar) {
				arr[i] = newChar;
			}else{
				arr[i] = strArr[i];
			}
		}
		return Arrays.toString(arr);
		//return arr.toString();
	}
	
	/*代码分析：
	 * 1、char [] arr = new char[len];
	 * 定义返回数组中间变量时，要分配空间，否则会写入失败
	 * 2、Arrays.toString(arr)，
	 * char [] 数组，转字符串，要用Arrays.toString(arr)
	 * 用arr.toString()，返回的是 String java.lang.Object.toString()，
	 * 既object类的toString()的方法，返回值为：getClass().getName() + '@' + Integer.toHexString(hashCode())
*/

	//jdk源码实现
	public static String replaceJdkCode(char oldChar, char newChar,String str) {
        if (oldChar != newChar) {
            int len = str.toCharArray().length;
            int i = -1;
            char[] val = str.toCharArray(); /* avoid getfield opcode */

            while (++i < len) {
                if (val[i] == oldChar) {
                    break;
                }
            }
            if (i < len) {
                char buf[] = new char[len];
                for (int j = 0; j < i; j++) {
                    buf[j] = val[j];
                }
                while (i < len) {
                    char c = val[i];
                    buf[i] = (c == oldChar) ? newChar : c;
                    i++;
                }
                return new String(buf);
            }
        }
        return str;
    }
	
	//源码解析：
	/*但是我不明白，为什么要先找到第一个替换的位置*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Hello World";
		System.out.println(str.replace('H', 'W'));
		System.out.println(str.replaceFirst("He", "Wa"));
		System.out.println(str.replaceAll("He", "Ha"));
		
		String aString = "xaabab";
		String bString = "ab";
		String cString = "bcd";
		String dString = aString.replace(bString, cString);
		System.out.println("repalce得到的字符串："+dString);
		
		String eString = myReplaceChar('a', 'x', aString);
		System.out.println("myRepalce得到的字符串："+eString);
		
		System.out.println("object的toString()方法："+aString.toCharArray().toString());
		
		String fString = replaceJdkCode('a', 'x', aString);
		System.out.println("replaceJdkcode得到的字符串："+fString);
		
	}

}
