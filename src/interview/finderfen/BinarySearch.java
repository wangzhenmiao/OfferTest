package interview.finderfen;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 6, 12, 33, 87, 90, 97, 108, 561 };
		//直接一步调用
		System.out.println("循环查找：" + (binarySearch(arr, 87) + 1));
	}

	//循环实现二分查找算法arr 已排好序的数组x 需要查找的数-1 无法查到数据
	public static int binarySearch(int [] arr ,int x){
		//找到最小和最大下标
		int low = 0;
		int high = arr.length-1;
		//while循环hold住整个查找
		while(low <= high){
			//把常用的中间变量赋值
			int middle = (low+high)/2;
			if(x == arr[middle]){
				return middle;
			}else if(x < arr[middle]){
				//middle下标不行，就要再移动一位
				high = middle-1;
			}else if(x > arr[middle]){
				low = middle+1;
			}
		}
		return -1;
	}
}
