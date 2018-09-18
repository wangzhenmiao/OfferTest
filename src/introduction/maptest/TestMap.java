package introduction.maptest;

import java.util.HashMap;
import java.util.Map;

public class TestMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = "ww ee rr tt ee tt tt w tt";
		Map<String, Integer> map = new HashMap<String, Integer>();
		String[] arr = string.split(" ");
		for(int i=0 ;i<arr.length;i++){
			if(map.containsKey(arr[i])){
				map.put(arr[i], map.get(arr[i])+1);
			}else{
				map.put(arr[i], 1);
			}
		}
		int max = 0;
		String maxStr = "";
		for(Map.Entry<String,Integer> e:map.entrySet()){
			if (max < e.getValue()) {
				max = e.getValue();
				maxStr = e.getKey();
			}
		}
		System.out.println("出现次数最多的是："+maxStr+",出现此时："+max);
	}
}
