class ListNode {
    int val;
    ListNode next;

    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0); // Placeholder for the result
        ListNode current = dummyHead; // Pointer to build the result list
        int carry = 0; // Initialize carry to 0

        // Traverse both lists
        while (l1 != null || l2 != null) {
            int x = (l1 != null) ? l1.val : 0; // Value from l1 or 0 if null
            int y = (l2 != null) ? l2.val : 0; // Value from l2 or 0 if null
            int sum = x + y + carry; // Calculate sum

            carry = sum / 10; // Update carry
            current.next = new ListNode(sum % 10); // Create new node for the digit
            current = current.next; // Move to the next node

            // Move to the next nodes in l1 and l2
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }

        // If there is a carry left, add a new node
        if (carry > 0) {
            current.next = new ListNode(carry);
        }

        return dummyHead.next; // Return the result list
    }

    public static void main(String[] args) {
        // Example input: l1 = [2,4,3], l2 = [5,6,4]
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));

        AddTwoNumbers solution = new AddTwoNumbers();
        ListNode result = solution.addTwoNumbers(l1, l2);

        // Print the result
        printList(result); // Output: [7, 0, 8]
    }

    // Helper method to print the list
    public static void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.val);
            if (node.next != null) {
                System.out.print(" -> ");
            }
            node = node.next;
        }
        System.out.println();
    }
}