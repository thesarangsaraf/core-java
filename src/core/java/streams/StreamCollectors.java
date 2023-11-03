package core.java.streams;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import core.java.dto.Employee;

public class StreamCollectors {

	public static void convertIntoCollection() {
		Stream<Integer> stream = Stream.of(1, 2, 34, 5, 6, 3);

		// convert stream into list
		stream.collect(Collectors.toList());

		// convert stream into set
		stream.collect(Collectors.toSet());

		// convert stream into hashmap
		Map<Integer, Integer> collect = stream.collect(Collectors.toMap(i -> i, j -> j + 1));
	}

	public static void groupingBy() {
		List<Employee> employees = CollectionGeneratorUtil.getEmployees();

		Map<String, List<Employee>> groupedByName = employees.stream()
				.collect(Collectors.groupingBy(Employee::getName));

		Map<String, Set<String>> lastNamesByCity = employees.stream().collect(
				Collectors.groupingBy(Employee::getName, Collectors.mapping(Employee::getName, Collectors.toSet())));
	}

	// Sum all integers into long
	public static Long sumAsLong(List<Integer> nums) {
		return nums.stream().collect(Collectors.summingLong(i -> i));
	}

}