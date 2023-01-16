package linkedllistUsage;

import java.util.Collections;
import java.util.LinkedList;

public class Addlinked_list {

	public static void main(String[] args) {
		LinkedList<String> cars=new LinkedList<String>();
		cars.add("aaaaa");
		cars.add("bbbbb");
		cars.add("ccccc");
		cars.add("ddddd");
		cars.add("eeeee");
		
		System.out.println(cars);
		
		cars.addFirst("Honda Fit");
		System.out.println(cars);
		
		Collections.sort(cars);
		
		System.out.println(cars);
		
		cars.addLast("Suzuki");
		
		System.out.println(cars);
		
	}
}
