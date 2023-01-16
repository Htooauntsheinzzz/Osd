package hashmapUsage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Hashmapfull {
public static void main(String[] args) {
	
	
		HashMap<String, Integer> people=new HashMap<String, Integer>();
		
		people.put("Johnson", 1);
		people.put("William", 2);
		people.put("Messi", 3);
		people.put("Ricki", 4);
		people.put("Ronaldo", 5);
		
		for(String i : people.keySet()) {
			System.out.println(i);
		}
		
		for(int v: people.values()) {
			System.out.println(v);
		}
		
		System.out.println("Name\t\tAge");
	
		for(String iv:people.keySet()) {
			System.out.println(iv+"\t\t"+people.get(iv));
		}
		
		
		// List detail output code
		
		List<Map.Entry<String, Integer>> list=new ArrayList<>(people.entrySet());
		Collections.sort(list,new Comparator<Map.Entry<String, Integer>>() {

			@Override
			public int compare(Entry<String, Integer> p1, Entry<String, Integer> p2) {
			
				return p1.getValue()-p2.getValue() ;
			}
		});
		
		for(Entry<String, Integer> i :list) {
			System.out.println(i);
		}
		
		
}
}
