package hashmapUsage;

import java.util.HashMap;

public class LoopUsingkey {

	public static void main(String[] args) {

		HashMap<String,String> cities=new HashMap<String,String>();
		cities.put("England", "London");
		cities.put("Germany", "Berlin");
		cities.put("Norway", "Oslo");
		cities.put("USA", "Warshinton DC");
		
		
		for(String i : cities.keySet()) { //output key
			System.out.println(i);
		}
		
		for(String j : cities.values()) {   //value
			System.out.println(j);
		}
		
		System.out.println("Key \t \t Values");//output both using key and value
		
		for(String kv :cities.keySet()){
			System.out.println(kv+"\t\t "+cities.get(kv));
			
		}
	
	}
	
		
}
