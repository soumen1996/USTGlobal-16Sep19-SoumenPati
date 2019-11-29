package stcom.ustglobal.streams.list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class TestF {
	
	public static void main(String[] args) {
		
		ArrayList<Employee> al = new ArrayList<Employee>();
		Employee e1 = new Employee(1, "Viru");
		Employee e2 = new Employee(4, "Yuvi");
		Employee e3 = new Employee(2, "Dhoni");
		al.add(e1);
		al.add(e2);
		al.add(e3);
		
		Comparator<Employee> cmp =(c1,c2) ->{
			return c1.name.compareTo(c2.name);
		};
		
		
		List<Employee> l = al.stream().sorted(cmp).collect(Collectors.toList());
		Iterator<Employee> itr = l.iterator();
		while(itr.hasNext()) {
			Employee e = itr.next();
			System.out.println("Id is "+ e.id);
			System.out.println("Name is "+ e.name);
			System.out.println("=========");
		}
		
	}

}
