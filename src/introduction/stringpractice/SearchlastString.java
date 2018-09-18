package introduction.stringpractice;

public class SearchlastString {

   public static int myLastIndexOf(char[] source, int sourceOffset, int sourceCount,
            char[] target, int targetOffset, int targetCount,
            int fromIndex) {
        /*
         * Check arguments; return immediately where possible. For
         * consistency, don't check for null str.
         */
        int rightIndex = sourceCount - targetCount;
        if (fromIndex < 0) {
            return -1;
        }
        if (fromIndex > rightIndex) {
            fromIndex = rightIndex;
        }
        /* Empty string always matches. */
        if (targetCount == 0) {
            return fromIndex;
        }

        int strLastIndex = targetOffset + targetCount - 1;
        char strLastChar = target[strLastIndex];
        int min = sourceOffset + targetCount - 1;
        int i = min + fromIndex;

    startSearchForLastChar:
        while (true) {
            while (i >= min && source[i] != strLastChar) {
                i--;
            }
            if (i < min) {
                return -1;
            }
            int j = i - 1;
            int start = j - (targetCount - 1);
            int k = strLastIndex - 1;

            while (j > start) {
                if (source[j--] != target[k--]) {
                    i--;
                    continue startSearchForLastChar;
                }
            }
            return start - sourceOffset + 1;
        }
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strOriString = "Hello world ,Hello Runoob";
		int lastIndex = strOriString.lastIndexOf("unoob");
		if (lastIndex == -1) {
			System.out.println("没有找到字符串 Runoob");
		}else{
			System.out.println("Runoob 字符串最后出现的位置： "+ lastIndex);
		}
		
		char [] source = strOriString.toCharArray();
		char [] target = "unoob".toCharArray();
		int l = myLastIndexOf(source, 0, source.length,target,0,target.length,0);
		if (l == -1) {
			System.out.println("My--没有找到字符串 Runoob");
		}else{
			System.out.println("My--Runoob 字符串最后出现的位置： "+ lastIndex);
		}
		
		char [] test = strOriString.toCharArray();
		
	}

}
