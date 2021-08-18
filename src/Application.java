import leet.addtwonumbers.AddTwoNumbers;
import leet.addtwonumbers.ListNode;

public class Application {
    public static void main(String[] args) {
        addTwoNumbers();
    }

    private static void addTwoNumbers() {
        ListNode node1 = new ListNode(12, null);
        ListNode node2 = new ListNode(20, node1);
        ListNode node3 = new ListNode(44, node2);

        ListNode node4 = new ListNode(76, null);
        ListNode node5 = new ListNode(32, node4);
        ListNode node6 = new ListNode(76, node5);

        AddTwoNumbers.addTwoNumbers(node3, node6);
    }
}
