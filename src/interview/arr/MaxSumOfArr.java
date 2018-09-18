package interview.arr;

public class MaxSumOfArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int []arr = {-1, 7,2, 3, -4, 5};
		int max = callMaxSumOfArr(arr);
		System.out.println("最大的值是："+max);
		int max1=calMaxSumOfArray1(arr);
		System.out.println("最大的值是："+max1);
		int max2=calMaxSumOfArray2(arr);
		System.out.println("最大的值是："+max2);
	}
    //方法1-自己写的
	public static int callMaxSumOfArr(int []arr){
		if(arr.length<=0){return -1;}
		int max=0;
		int maxBegin=0;
		int maxEnd=0;
		int tmp=0;
		for(int i=0;i<arr.length;i++){
			tmp=0;
			for(int j=i;j<arr.length;j++){
				tmp+=arr[j];
				if(max<tmp){
					max=tmp;
					maxBegin=i;
					maxEnd=j;
				}
			}
		}
		System.out.println("最大的begin:"+maxBegin+"，最大的结尾："+maxEnd);
		return max;
	}
	
	//方法2-算法来自网络
	public static int calMaxSumOfArray1(int[] a) {
	    if (null == a) {
	        return 0;
	    }
	    if (a.length == 1) {
	        return a[0];
	    }
	    int sum = a[0];
	    int temp;
	    for (int i = 0; i < a.length - 1; i++) {
	        temp = a[i];
	        //开始从a[i]往它之后遍历，相加，再跟sum对比
	        for (int j = i + 1; j < a.length; j++) {
	            temp = temp + a[j];
	            if(sum < temp) {
	                sum = temp;
	            }
	        }
	    }
	    return sum;
	}
	
	//方法3-来源网络
	public static int calMaxSumOfArray2(int[] a) {
	    if (null == a) {
	        return 0;
	    }
	    if (a.length == 1) {
	        return a[0];
	    }
	    int sum = a[0];
	    int temp = a[0];
	    for (int i = 1; i < a.length; i++) {
	        temp = max(temp + a[i], a[i]);
	        if (sum < temp) {
	            sum = temp;
	        }
	    }
	    return sum;
	}

	public static int max(int a, int b) {
	    return a > b ? a : b;
	}
}
