package introduction.stringpractice;

public class StringRegionMatches {

	public static boolean myRegionMatches(String str1,int index1,String str2,int index2,int len ){
		//获取字符串长度
		int len1 = str1.length();
		int len2 = str2.length();
		if (index1 < 0 || index2 < 0 || (index1 + len) > len1
				||(index2 + len) > len2) {
			return false;
		}
		//转换成字符串，遍历比较
		char [] str1Arr = str1.toCharArray();
		char [] str2Arr = str2.toCharArray();
		int k = 0;
		while(k < len){
			if (str1Arr[index1+k] != str2Arr[index2+k]) {
				return false;
			}
			k++;		
		}
		return true;
	}
	
	//jdk源码
/*	  public boolean regionMatches(int paramInt1, String paramString, int paramInt2, int paramInt3)
	  {
	    char[] arrayOfChar1 = this.value;
	    int i = paramInt1;
	    char[] arrayOfChar2 = paramString.value;
	    int j = paramInt2;
	    if ((paramInt2 < 0) || (paramInt1 < 0) || (paramInt1 > this.value.length - paramInt3) || (paramInt2 > paramString.value.length - paramInt3)) {
	      return false;
	    }
	    while (paramInt3-- > 0) {
	      if (arrayOfChar1[(i++)] != arrayOfChar2[(j++)]) {
	        return false;
	      }
	    }
	    return true;
	  }
	  */
	/*代码分析 
	 * 1、可以先把串转化成数组，在进行长度计算
	 * 2、要判断索引本身是否越界，索引运算后，是否越界
	 * 3、while (paramInt3-- > 0)，可以决定循环运行次数为paramInt3次
	 * 4、if (arrayOfChar1[(i++)] != arrayOfChar2[(j++)])，两个数组的下标，自动运算了*/ 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String aString = "aahaheillowor";
		String bString = "heheisaboy";
		boolean ret = aString.regionMatches(4, bString, 2, 2);
		System.out.println("比较结果:"+ret);
		
		boolean ret1 = myRegionMatches(aString, 4, bString, 2, 3);
		System.out.println("比较结果1:"+ret1);
	}

}
