package frequentlycommon.testhashmap;

import java.util.HashMap;

public class traversehashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> map = new HashMap<>();
		map.put("111", "aaa");
		map.put("222","bbb");
		map.put("333", "ccc");
		
		System.out.println("使用Map.keyset()遍历key和value");
		for(String key:map.keySet())
		{
			System.out.println("key:"+key);
		}
		for(String value:map.values()){
			System.out.println("value:"+value);
		}
		
		System.out.println("使用Map.entrySet(),使用Iterator遍历key和value");
		
	}

}
