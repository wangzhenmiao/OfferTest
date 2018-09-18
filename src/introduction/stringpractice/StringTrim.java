package introduction.stringpractice;

public class StringTrim {

	//自己实现的trim
	public static String myTrim(String str){
		char [] arr = str.toCharArray();
		int len = arr.length;
		char [] ret = new char[len];
		char [] ret1 = new char[len];
		//去掉前置空格
		for(int i=0;i<len;i++){
			if (arr[i] != ' ') {
				for(int j=i,k=0;j<len;j++,k++){
					ret[k] = arr[j];
				}
				break;
		    }
		}
		//去掉后置空格
		for(int i=ret.length-1;i>-1;i--){
			if (ret[i] != ' '){
				for(int j=0;j<=i;j++){
					ret1[j] = ret[j];
				}
				break;
			}
		}
		//return Arrays.toString(ret1);
		return new String(ret);
	}
	
	/*自己实现的代码分析：
	 * 1、for-if，break的时机，并且要注意局部变量i的作用域
	 * 2、ret[k] = arr[j];两个数组赋值时，两个下标的注意
	 * 3、Arrays.toString(char []),返回的是 [a,b,..],还是数组
	 * 4、从数组到字符串，可以利用String的构造函数，new String(char [])*/
	
	
	// jdk源码实现方式
	public static String trimJdkCode(String str) {
        int len = str.toCharArray().length;
        int st = 0;
        char[] val = str.toCharArray();    /* avoid getfield opcode */

        while ((st < len) && (val[st] <= ' ')) {
            st++;
        }
        while ((st < len) && (val[len - 1] <= ' ')) {
            len--;
        }
        return ((st > 0) || (len < str.toCharArray().length)) ? str.substring(st, len) : str;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String aString = " xxxeee  ";
		System.out.println("before trim:"+aString);
		System.out.println("after: trim:"+aString.trim());
		
		System.out.println("before trim:len:"+aString.length());
		System.out.println("after: trim:len:"+aString.trim().length());
		/*代码分析:
		 * 1、trim是去掉字符串的前后空格
		 * 2、String.length()会把空格的长度也计算在内*/
		
		System.out.println("before trim:"+aString);
		System.out.println("myTrim trim:"+myTrim(aString));
		
		/*System.out.println("before jdktrim:"+aString);
		System.out.println("myTrim jdktrim:"+trimJdkCode(aString));*/
		
		String bString = "abcd";
		System.out.println("substring: "+bString.substring(0, 3)); //输出：abc
		System.out.println("substring: "+bString.substring(0, bString.length())); //输出：abcd
		
		/*代码分析:
		 * 0、String	substring(int beginIndex, int endIndex)
		 * 1、String.subString(int1,int2),子字符串的范围是[),左闭右开区间*/
		
	}

}
