package mapspractice;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapsPractice1 {
	public static void main(String[] args) {
		
		Map<Integer, String> map = new HashMap<>();
		map.put(1, null);
		map.put(2, null);
		map.put(3, "Ganesh");
		map.put(4, "Sai");
		map.put(5, "Keerthy");
		map.put(5, "Vasu");
		map.put(1, "Yesh");
		map.put(null, "abc");
		
		System.out.println(map);
		
		Set<Integer> keySet = map.keySet();
		
		for(Integer key : keySet) {
			System.out.println(key + " : " + map.get(key));
		}
		
		Collection<String> values = map.values();	
		System.out.println(values);
		
		Set<Entry<Integer, String>> entrySet = map.entrySet();
		System.out.println(entrySet);
	}
}
