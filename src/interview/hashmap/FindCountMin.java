package interview.hashmap;

import java.util.HashMap;

/*题目：有字符串 “abc123a2”
找到出现次数最少的第一个字符*/
public class FindCountMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "abc123a2";
		HashMap<Character, Integer> map = new HashMap<>();
		char [] arr = a.toCharArray();
		for(int i=0;i<arr.length;i++){
			if (map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i])+1);
			}else{
				map.put(arr[i], 1);
			}
		}
		int min = Integer.MAX_VALUE;
		char findChar = ' ';
		//要遍历数组，因为hashmap无序
		for(int i=0;i<arr.length;i++){
			System.out.println("遍历map,key:"+arr[i]+",value:"+map.get(arr[i]));
			if(min > map.get(arr[i])){
				min = map.get(arr[i]);
				findChar = arr[i]; 
			}
		}
		System.out.println("第一个出现次数最少的字符是："+findChar+",次数是："+min);
	}

/*代码分析:
 * 1.hashmap存放的是字符，所以定义时：HashMap<Character, Integer> map = new HashMap<>();
 * 2.要直接用map.containsKey(key)来判断map中是否含有某个元素，不用for循环
 * 3.map常用方法，map.put(key,value),map.get(key)
 * 4.hashmap无序，数组有序，如果涉及到出现顺序，要遍历数组*/
}

