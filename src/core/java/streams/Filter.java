package core.java.streams;

import java.util.List;
import java.util.stream.Collectors;

public class Filter {

	// provide all numbers less than given number
	public static List<Integer> numsLessThan(List<Integer> nums, Integer target) {
		return nums.stream().filter(n -> n < target).collect(Collectors.toList());
	}

}