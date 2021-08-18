package leet.addtwonumbers;

/*
Input: l1 = [2,4,3], l2 = [5,6,4]
Output: [7,0,8]
Explanation: 342 + 465 = 807.
*/

import java.util.ArrayList;

public class AddTwoNumbers {

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Integer firstNumber = nodeToNumber(l1);
        Integer secondNumber = nodeToNumber(l2);

        Integer ans = firstNumber + secondNumber;


        return null;
    }

    private static Integer nodeToNumber(ListNode node) {
        if (node == null){
            return null;
        }

        int value = node.val;
        String strNumber = String.valueOf(value);

        ArrayList<Integer> convertedNumber = new ArrayList<>();

        Integer futureNumber = nodeToNumber(node.next);
        if (futureNumber != null) {
            convertedNumber.add(futureNumber);
        }

        return futureNumber;
    }
}
