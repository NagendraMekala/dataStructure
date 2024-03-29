package com.mng.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

import javax.xml.transform.stream.StreamSource;

public class SortByMultipleField {
	public static void main(String[] args) {

		System.out.println("===== SORTING BY MULTIPLE ATTRIBUTES =====");
		List<Employee> listEmployees = new ArrayList<Employee>();

		listEmployees.add(new Employee("Tom", "Developer", 45, 80000));
		listEmployees.add(new Employee("Sam", "Designer", 30, 75000));
		listEmployees.add(new Employee("Bob", "Designer", 45, 134000));
		listEmployees.add(new Employee("Peter", "Programmer", 25, 60000));
		listEmployees.add(new Employee("Tim", "Designer", 45, 130000));
		listEmployees.add(new Employee("Craig", "Programmer", 30, 52000));
		listEmployees.add(new Employee("Anne", "Programmer", 25, 51000));
		listEmployees.add(new Employee("Alex", "Designer", 30, 120000));
		listEmployees.add(new Employee("Bill", "Programmer", 22, 30000));
		listEmployees.add(new Employee("Samuel", "Developer", 28, 80000));
		listEmployees.add(new Employee("John", "Developer", 35, 67000));
		listEmployees.add(new Employee("Patrick", "Developer", 35, 140000));
		listEmployees.add(new Employee("Alice", "Programmer", 35, 80000));
		listEmployees.add(new Employee("David", "Developer", 35, 99000));
		listEmployees.add(new Employee("Jane", "Designer", 30, 82000));

		System.out.println("*** Before sorting:");
		
		for (Employee emp : listEmployees) {
            System.out.println(emp);
        }
		
		/*Collections.sort(listEmployees, new EmployeeChainedComparator(new EmployeeAgeComparator(),
				                                             new EmployeeSalaryComparator(),
				                                             new EmployeeJobTitleComparator()));*/
		
		Comparator<Employee> employeeAgeComparator = (e1,e2) -> e1.getAge() - e2.getAge();
		Comparator<Employee> employeeSalaryComparator = (e1,e2) -> e1.getSalary() - e2.getSalary();
		Comparator<Employee> employeeJobTitleComparator = (e1,e2) -> e1.getJobTitle().compareTo(e2.getJobTitle());
		
/*		Stream<Employee> empStrems = listEmployees.stream().
				                   sorted(new EmployeeAgeComparator()
				                		 .thenComparing(new EmployeeSalaryComparator())
				                		 .thenComparing(new EmployeeJobTitleComparator()));*/
		
		Stream<Employee> empStrems = listEmployees.stream().
                sorted(employeeAgeComparator
             		 .thenComparing(employeeSalaryComparator)
             		 .thenComparing(employeeJobTitleComparator));
		
		 System.out.println("\n*** After sorting:");
		 empStrems.forEach(System.out::println);
		 
		 /*for (Employee emp : listEmployees) {
	            System.out.println(emp);
	        }*/
	}
}
