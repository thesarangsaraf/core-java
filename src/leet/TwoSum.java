package leet;

public class TwoSum {
    public static int[] twoSum(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                int firstNumber = numbers[i];
                int secondNumber = numbers[j];

                if (firstNumber + secondNumber == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }
}
