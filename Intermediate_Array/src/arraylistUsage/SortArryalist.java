package arraylistUsage;

import java.util.ArrayList;
import java.util.Collections;

public class SortArryalist {

	
	
	public static void main(String[] args) {
		ArrayList<String> cars=new ArrayList<String>();
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Mazda");
		
		System.out.println("Before Sorting");
		System.out.println(cars);
		
		Collections.sort(cars);
		System.out.println("Aftersorting");
		System.out.println(cars);
	}
}
