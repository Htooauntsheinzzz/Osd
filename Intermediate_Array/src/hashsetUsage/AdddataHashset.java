package hashsetUsage;

import java.util.HashSet;
import java.util.Iterator;

public class AdddataHashset {

	
	public static void main(String[] args) {
		HashSet<String> map=new HashSet<String>();
		map.add("aaaaaa");
		map.add("bbbbbb");
		map.add("cccccc");
		map.add("cccccca");
		map.add("eeeeee");
		
		System.out.println(map.size());
		System.out.println(map);
		
		if(map.contains("aaaaaa")) {
			System.out.println("Correct");
			
		}else {
			System.out.println("No");
		}
	
		
		// Using Iterator
		Iterator<String>i = map.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}

	}
}
