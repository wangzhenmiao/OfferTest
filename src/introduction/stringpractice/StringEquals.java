package introduction.stringpractice;

public class StringEquals {

	//boolean	equals(Object anObject)
	// equals方法实现
	public static boolean myEquals(Object obj,String str){
		//先判断obj是否是字符串类型
		if (obj instanceof String) {
			char [] objArr = ((String) obj).toCharArray();
			char [] strArr = str.toCharArray();
			if (objArr.length != strArr.length) {
				return false;
			}
			for(int i=0;i<objArr.length;i++){
				if (objArr[i] != strArr[i]) {
					return false;
				}
			}
		}else{
			return false;
		}
		return true;
	}
	
	//jdk源码如下
/*	  public boolean equalsCode(Object paramObject)
	  {
	    if (this == paramObject) {
	      return true;
	    }
	    if ((paramObject instanceof String))
	    {
	      String str = (String)paramObject;
	      int i = this.value.length;
	      if (i == str.value.length)
	      {
	        char[] arrayOfChar1 = this.value;
	        char[] arrayOfChar2 = str.value;
	        for (int j = 0; i-- != 0; j++) {
	          if (arrayOfChar1[j] != arrayOfChar2[j]) {
	            return false;
	          }
	        }
	        return true;
	      }
	    }
	    return false;
	  }*/
	  
	
	//代码分析：
	/*1. String str = (String)paramObject;
	Object类型，要加（String）转化成String类型
	2.整个代码逻辑是 if(正常情况1){if(正常情况2)}...最后是return false;
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String aString = "hello";
		String bString = "hello";
		boolean ret = aString.equals(bString);
		System.out.println("比较结果："+ret);
		
		boolean ret1 = myEquals(aString, bString);
		System.out.println("比较结果1："+ret1);
	}

}
