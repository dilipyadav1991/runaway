package LinkedList;

public class PalindromeList {
	static Node head;
	static Node left;

	public static boolean isPalindrome(Node head2) {
		boolean isPalindrome = palindromeUtil(head2);
		return isPalindrome;
	}

	public static boolean palindromeUtil(Node right) {
		left = head;
		if (right == null)
			return true;
		boolean isPalindrome = palindromeUtil(right.next);
		if (isPalindrome == false)
			return false;
        boolean isp1 = (right.data == (left).data); 
		left = left.next;
		return isp1;
	}

	public static void main(String[] args) {
		PalindromeList ll = new PalindromeList();
		ll.head = new Node(1);
		ll.head.next = new Node(2);
		ll.head.next.next = new Node(2);
		ll.head.next.next.next = new Node(1);
		System.out.println(isPalindrome(head));
	}
}
