package interview.arr;

public class PractiseSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {12,20,5,16,15,1,30,45,23,9};
	       int start = 0;
	       int end = a.length-1;
	       sort(a,start,end);
	       for(int i = 0; i<a.length; i++){
	            System.out.println(a[i]);
	        }
	}
	public static void sort(int [] a ,int low,int high){
		int start = low;
		int end = high;
		int key = a[low];
		while(start < end){
			//从后往前查找一轮
			while((start < end) && (key <= a[end]))
				end--;
			if(key>a[end]){
				//交换start和end
				int tmp = a[end];
				a[end]=a[start];
				a[start]=tmp;
			}
			//从前往后查找一轮
			while(start<end && key>=a[start])
				start++;
			if(key<a[start]){
				int tmp = a[start];
				a[start]=a[end];
				a[end]=tmp;
			}
			//分成两段调用递归
			if (start>low) {
				sort(a, low, start-1);
			}
			if (end<high) {
				sort(a, end+1, high);
			}
		}
		
	}
}
