package testiingExercise;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Exercise_2 {
	
	public static void main(String[] args) {
		
		LinkedHashMap<String,Integer> people=new LinkedHashMap<>();
		
		
		people.put("Kyw Kyaw", 1);
		people.put("Yella", 3);
		people.put("Aung Aung",2);
		
		
		System.out.println(people);
		
		LinkedHashSet<String> country=new LinkedHashSet<>();
		
		
		country.add("Barminham");
		country.add("London");
		country.add("Yangon");	
		country.add("Barminham");
		country.add("Manchester");
		
		System.out.println(country);
		
		Iterator<String> i= country.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		
		
		List<Map.Entry<String, Integer> > list=new ArrayList<>(people.entrySet());
 		Collections.sort(list,new Comparator<Map.Entry<String,Integer>>() {

			@Override
			public int compare(Entry<String, Integer> e1, Entry<String, Integer> e2) {
				// TODO Auto-generated method stub
				return e1.getKey().compareTo(e2.getKey());
			}
		});
		
		
		
	}

}
