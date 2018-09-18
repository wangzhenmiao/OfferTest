package introduction.stringpractice;

public class StringReplaceString {

	/*public static String myReplaceString(String src,String dest,String target){
		char [] srcArr = src.toCharArray();
		char [] destArr = dest.toCharArray();
		char [] targetArr = target.toCharArray();
		char [] arr = new char[srcArr.length];
		for(int i=0;i<srcArr.length;i++){
			if (srcArr[i] == destArr[0]) {
				
			}else{
				arr[]
			}
		}
	}*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String aString = "xaabcab";
		String bString = "ab";
		String cString = "xyz";
		System.out.println("replace字符串："+aString.replace(bString, cString));
		//输出：replace字符串：xaxyzcxyz
	}

}
