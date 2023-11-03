package core.java.streams;

import java.util.List;
import java.util.stream.Collectors;

public class Map {

	// Sum all integers into long
	public static Long mapToLong(List<Integer> nums) {
		return nums.stream().collect(Collectors.summingLong(i -> i));
	}

}