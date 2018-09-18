package interview.finderfen;

public class TestErFenFind {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] nums = { 1, 2, 3, 4, 5, 6, 7, 9,90 };
		 int index = erfen(nums, 5);
		 System.out.println("index:"+index);
	}

	public static int erfen(int[] nums, int m) {
		int left = 0;
		int right = nums.length-1;
		//先判断要找的数组在数组内，再确认有序数组是升序
		if(m < nums[left] || m > nums[right] || nums[left]>nums[right]){
			return -1;
		}
		while(left < right){
			if (m == nums[(left+right)/2]) {
				return (left+right)/2;
			}else if (m < nums[(left+right)/2]) {
				right = (left+right)/2;
			}else if(m > nums[(left+right)/2]){
				left = (left+right)/2;
			}
		}
		return -1;
	}
}
