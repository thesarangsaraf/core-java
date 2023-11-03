package core.java.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import core.java.dto.Employee;

public class CollectionGeneratorUtil {

	public static List<Employee> getEmployees() {
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee("Sarang", "sarang@gmail.com", "30"));
		employees.add(new Employee("Vijay", "vijay@gmail.com", "31"));
		employees.add(new Employee("Sanjay", "sanjay@gmail.com", "32"));
		employees.add(new Employee("Ajay", "ajay@gmail.com", "32"));
		employees.add(new Employee("Tejas", "tejas@gmail.com", "32"));
		return employees;
	}

	public static List<Integer> getIntegers(Integer range) {
		return Stream.iterate(0, i -> i < range, i -> i + 1).toList();
	}

}