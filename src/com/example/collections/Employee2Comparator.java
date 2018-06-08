package com.example.collections;

import java.util.Comparator;

public class Employee2Comparator implements Comparator<Employee2> {

	@Override
	public int compare(Employee2 o1, Employee2 o2) {
		// TODO Auto-generated method stub\
        int result = o1.getId().compareTo(o2.getId());
        if (result != 0)
        {
            return result;
        }
        
        result = o1.getName().compareTo(o2.getName());
        if (result != 0)
        {
            return result;
        }
        
        return result;
	}

}
