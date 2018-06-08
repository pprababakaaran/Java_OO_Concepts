package com.example.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {
		Employee e = new Employee(1,"Praba",100);
		//System.out.println(e.hashCode());
		
		Employee e1 = new Employee(2,"Prakash",200);
		//System.out.println(e1.hashCode());

		Employee e2 = new Employee(3, "Karthi",300);
		//System.out.println(e2.hashCode());

		Employee e3 = new Employee(4, "Santhosh",400);
		//System.out.println(e3.hashCode());
		Employee e4 = new Employee(4, "Santhosh",600);

		
		Map<Employee,Integer> eMap = new HashMap<Employee,Integer>();
		eMap.put(e, 1);
		eMap.put(e1, 2);
		eMap.put(e2,3);
		eMap.put(e3, 4);
		eMap.put(e4, 5);

		e.setSalary(500);
		
		//System.out.println(eMap.toString());
		
		Set<Entry<Employee, Integer>> it = eMap.entrySet();
		for(Entry<Employee, Integer> entry:it)
		{
			Employee temp = entry.getKey();
			System.out.println(temp.hashCode() +":::"+temp.toString()+":::"+entry.getKey());
		}
		
		System.out.println("---------------------------------------------------------------");
		
		Map<Employee3,Integer> withouHashcodeKey = new HashMap<Employee3,Integer>();


		Employee3 emp1 = new Employee3(1,"Praba",100);
		Employee3 emp2 = new Employee3(2,"Prakash",200);
		Employee3 emp3 = new Employee3(1,"Praba",100);
		withouHashcodeKey.put(emp1, 1);
		withouHashcodeKey.put(emp2, 2);
		withouHashcodeKey.put(emp3, 3);
		
		Set<Entry<Employee3, Integer>> hashIt = withouHashcodeKey.entrySet();
		for(Entry<Employee3, Integer> entry:hashIt)
		{
			Employee3 temp = entry.getKey();
			System.out.println(temp.hashCode() +":::"+temp.toString()+":::"+entry.getKey());
		}
		System.out.println("---------------------------------------------------------------");
		
		Map<Employee4,Integer> withoutEquals = new HashMap<Employee4,Integer>();

		Employee4 emp4 = new Employee4(1,"Praba",100);
		Employee4 emp5 = new Employee4(2,"Prakash",200);
		Employee4 emp6 = new Employee4(1,"Praba",100);
		withoutEquals.put(emp4, 1);
		withoutEquals.put(emp5, 2);
		withoutEquals.put(emp6, 3);
		
		Set<Entry<Employee4, Integer>> equalIt = withoutEquals.entrySet();
		for(Entry<Employee4, Integer> entry:equalIt)
		{
			Employee4 temp = entry.getKey();
			System.out.println("No Equals " + temp.hashCode() +":::"+temp.toString()+":::"+entry.getKey());
		}
	}

}
