package introduction.stringpractice;

public class StringCopareToCode {

	// 比较字符串source和字符串dest的大小，source大，返回1，否则返回-1
	public static int myCopareTo(String source, String dest) {
		char[] src = source.toCharArray();
		char[] dst = dest.toCharArray();
		if (src.length >= dst.length) {
			for (int i = 0; i < dst.length; i++) {
				if (src[i] > dst[i]) {
					return 1;
				} else {
					return -1;
				}
			}
		} else {
			for (int i = 0; i < src.length; i++) {
				if (src[i] > dst[i]) {
					return 1;
				} else {
					return -1;
				}
			}
		}
		return 0;
	}

	// 标准源码
	// 比较source字符串和dest字符串，返回source-dest的ASIIC码
	public static int jdkCompareTo(String source, String dest) {
		int len1 = source.toCharArray().length;
		int len2 = dest.toCharArray().length;
		int lim = Math.min(len1, len2);
		char v1[] = source.toCharArray();
		char v2[] = dest.toCharArray();

		int k = 0;
		while (k < lim) {
			char c1 = v1[k];
			char c2 = v2[k];
			if (c1 != c2) {
				return c1 - c2;
			}
			k++;
		}
		return len1 - len2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "zabc5";
		String b = "xacd";
		int ret = myCopareTo(a, b);
		System.out.print("ret:" + ret);
		
		int retCode = jdkCompareTo(a, b);
		System.out.print("ret:" + retCode);
	}

}
