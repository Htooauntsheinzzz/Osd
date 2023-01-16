package linkedllistUsage;

import java.util.LinkedList;

public class RemoveLinklist {

	public static void main(String[] args) {
		
		
		LinkedList<String> cars=new LinkedList<String>();
		cars.add("aaaaa");
		cars.add("bbbbb");
		cars.add("ccccc");
		cars.add("ddddd");
		cars.add("eeeee");
		
		
		//cars.remove(0);
		//System.out.println(cars); 
		
		System.out.println(cars.removeFirst());
		System.out.println(cars.removeLast());
		
		System.out.println(cars.size());

	}

}
