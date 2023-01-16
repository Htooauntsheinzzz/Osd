package arraylistUsage;

import java.util.ArrayList;

public class RemovearrayList {

	
	
	public static void main(String[] args) {
		ArrayList<String>cars=new ArrayList<String>();
		cars.add("aaaaaa");
		cars.add("bbbbb");
		cars.add("ccccc");
		
		System.out.println(cars);
		
		cars.remove(1);
		
		System.out.println(cars);
		cars.clear();
	}
}
