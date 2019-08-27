package com.mng.sorting;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class EmployeeChainedComparator implements Comparator<Employee> {
   List<Comparator<Employee>> list;
	
	public EmployeeChainedComparator(Comparator<Employee>...  comparators) {
		this.list = Arrays.asList(comparators);
	}
	@Override
	public int compare(Employee e1, Employee e2) {
		for(Comparator<Employee> comparator : list) {
			int result = comparator.compare(e1, e2);
			if(result != 0) {
				return result;
			}
		}
		return 0;
	}
}
