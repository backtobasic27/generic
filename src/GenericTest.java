import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class GenericTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		list.add("1");
		list.add("2");
		list.add("3");
		
		for(String e: list) {
			System.out.println(e);
		}
		
		//forEach
		list.forEach(System.out::println);
		
		//Map을 쓴다고요~?
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "a");
		map.put(2, "b");
		map.put(3, "c");
		
		System.out.println("=================");	
//		Set set = map.keySet();
//		Iterator iterator = set.iterator();
//		밑에 23,24,번 라인과 같다.
		
		for(Integer key:map.keySet()) {
			System.out.println(key);
		}
		
		System.out.println("=================");
		
		Iterator<Integer> it = map.keySet().iterator();
		
		while(it.hasNext()) {
			Integer key =it.next();
			System.out.println(key);
		}
		
		System.out.println("=================");
		
		Iterator<String> it2 = map.values().iterator();
		
		while(it2.hasNext()) {
			String key2 =it2.next();
			System.out.println(key2);
		}
		
		System.out.println("=================");
		
		for(Map.Entry<Integer,String>entry : map.entrySet()) {
			System.out.println(entry.getKey() + "," +entry.getValue());
		}
		
		System.out.println("=================");
		Iterator<Map.Entry<Integer,String>> it3 =  map.entrySet().iterator();
		
		while(it3.hasNext()) {
			Map.Entry<Integer,String> entry = it3.next();
			System.out.println(entry.getKey() + "," +entry.getValue());
		}
		
// 향상된 for문 , Iterator, forEach 셋 다 출력값은 동일.
// 지금은 몰라도 걍 암기하라.		
// 		
	}
}
