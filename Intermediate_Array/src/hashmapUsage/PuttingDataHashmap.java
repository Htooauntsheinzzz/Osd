package hashmapUsage;

import java.util.HashMap;

public class PuttingDataHashmap {

	public static void main(String[] args) {

		
		HashMap<String,String> cities=new HashMap<String,String>();
		cities.put("England", "London");
		cities.put("Germany", "Berlin");
		cities.put("Norway", "Oslo");
		cities.put("USA", "Warshinton DC");
		
		System.out.println(cities);
		
		
		System.out.println(cities.get("England"));
		System.out.println(cities.remove("Germany"));// using other remove package
		System.out.println(cities);
		
		
	//	cities.clear();  it has no parameter
		
		System.out.println(cities.size());
		
		
		
		
	
		
		
	}

}
