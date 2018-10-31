package frequentlycommon.testhashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * 遍历hashmap
 */
public class traversehashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> map = new HashMap<>();
		map.put("111", "aaa");
		map.put("222","bbb");
		map.put("333", "ccc");

		//第一种方式，普遍使用，使用Map.keySet()遍历key和value
		System.out.println("使用Map.keySet()遍历key和value");
		for(String key:map.keySet()){
			System.out.println("key:"+key+",value:"+map.get(key));
		}

		//第二种方式,使用Map.entrySet(),使用Iterator遍历key和value
		System.out.println("使用Map.entrySet(),使用Iterator遍历key和value");
		Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
		while(it.hasNext()){
			Map.Entry<String, String> entry = it.next();
			System.out.println("key:"+entry.getKey()+",value:"+entry.getValue());
		}

		//第三种方式，通过Map.entrySet(),遍历key和value
		System.out.println("通过Map.entry，遍历key和value");
		for(Map.Entry<String, String> entry :map.entrySet()){
			System.out.println("key:"+entry.getKey()+",value:"+entry.getValue());
		}

		//第四种方式，通过Map.values遍历value,但不能遍历key
		System.out.println("通过Map.values遍历value,但不能遍历key");
		for(String v:map.values()){
			System.out.println("value:"+v);
		}
		
	}

/*	输出:使用Map.keySet()遍历key和value
	key:111,value:aaa
	key:222,value:bbb
	key:333,value:ccc
使用Map.entrySet(),使用Iterator遍历key和value
	key:111,value:aaa
	key:222,value:bbb
	key:333,value:ccc
	通过Map.entry，遍历key和value
	key:111,value:aaa
	key:222,value:bbb
	key:333,value:ccc
	通过Map.values遍历value,但不能遍历key
	value:aaa
	value:bbb
	value:ccc*/

}
