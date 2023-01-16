package hashmapUsageOOP;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class SortEmployeebySalary {
	
	public static void main(String[] args) {
		Map<Employee, Integer> empMap=new TreeMap<>(new Comparator<Employee>() {

			@Override
			public int compare(Employee e1, Employee e2) {
				// TODO Auto-generated method stub
				return (int) (e2.getSalary() -e1.getSalary());
			}
		});
		empMap.put(new Employee(123,"Junny","IT",250000), 25);
		empMap.put(new Employee(135,"Rose","Music",300000),32);
		empMap.put(new Employee(142,"Jiso","Law",400000), 43);
		empMap.put(new Employee(154,"Lisa","Marketing",700000), 54);
		empMap.put(new Employee(164,"Messi","Sport",600000), 64);
		
		//System.out.print(empMap);
		System.out.println("Name"+"\t"+"Department"+"\t"+"Salary");
		for(Employee e: empMap.keySet()) {
			
			System.out.println(e.getName()+"\t"+e.getDepartment()+"\t\t"+e.getSalary());
		}
	}

}
