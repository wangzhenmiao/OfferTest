package introduction.stringpractice;

public class StringStartWithCode {

	//字符串是否以某个子串开始
	public static boolean myStartWith(String source ,String dest){
		char [] src = source.toCharArray();
		char [] dst = dest.toCharArray();
		if (dst.length > src.length) {
			return false;
		}
		int k = 0;
		while (k<dst.length){
			if (src[k] != dst[k]) {
				return false;
			}
			k++;
		}
		return true;
	}
	
	//源码
	public static boolean startsWithCodejdk(String prefix, int toffset,String str) {
        char ta[] = str.toCharArray();
        int to = toffset;
        char pa[] = prefix.toCharArray();
        int po = 0;
        int pc = prefix.toCharArray().length;
        // Note: toffset might be near -1>>>1.
        if ((toffset < 0) || (toffset > str.toCharArray().length - pc)) {
            return false;
        }
        while (--pc >= 0) {
            if (ta[to++] != pa[po++]) {
                return false;
            }
        }
        return true;
    }
	
	/*源码分析:
	 * 1、只要有两个串，涉及叠加遍历的时候，都要判断索引起始时、索引移动完之后，是否越界
	 * 2、while (--pc >= 0)，用while循环，内写遍历次数自减，确定遍历次数。
	 * 如果为变量先--，要写>=0,如果是后--,要写>0，确保遍历次数为变量值
	 * 3、if (ta[to++] != pa[po++])，if字符串遍历比较，自增下标*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String aString = "abcdef";
		String beginString = "abc";
		boolean ret = aString.startsWith(beginString);
		System.out.println("ret:"+ret);
		
		boolean retMy = myStartWith(aString,beginString);
		System.out.println("retMy:"+retMy);
		
		boolean retCode = startsWithCodejdk(beginString,0,aString);
		System.out.println("retCode:"+retCode);
	}

}
