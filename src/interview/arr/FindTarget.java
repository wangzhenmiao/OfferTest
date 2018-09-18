package interview.arr;

import java.util.Arrays;

public class FindTarget {
	
	//题目：给你一个整形target，数组numbers,找到数组中两个数的和为target的两个值的序列号
	//比如：target=9,numbers = {1,4,5,6,7},因为4+5=9,要返回2，3

	public static int [] findTarget(int [] numbers,int target){
		int [] tmp = new int [2];
		for (int i = 0; i < numbers.length; i++) {
			for (int j = i+1; j < numbers.length; j++) {
				if (numbers[i]+numbers[j] == target) {
					tmp[0] = i+1;
					tmp[1] = j+1;
					return tmp;
				}
			}
		}
		return tmp;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int target = 9;
		int [] numbers = {1,4,5,6,7};
		int [] ret = findTarget(numbers, target);
		if (ret != null) {
			System.out.println("输出结果："+Arrays.toString(ret));
		}else{
			System.out.println("null");
		}
		
	}

}
