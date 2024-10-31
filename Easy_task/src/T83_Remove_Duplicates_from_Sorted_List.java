//time complexity: O(n)
//space complexity: O(1)
//Given the head of a sorted linked list, delete all duplicates such that each element appears only once. Return the linked list sorted as well.
//31-10-2024
import java.util.HashMap;

public class T83_Remove_Duplicates_from_Sorted_List {
    public class ListNode {
             int val;
             ListNode next;
             ListNode() {}
             ListNode(int val) { this.val = val; }
             ListNode(int val, ListNode next) { this.val = val; this.next = next; }//q:how to call this constructor?    
    }
    public ListNode deleteDuplicates(ListNode head) {
        if(head== null)
        return head; 
        ListNode temp = head;
        while(temp.next != null)
        {
            if(temp.val == temp.next.val )
            {temp.next = temp.next.next;}
            else
            {temp = temp.next;}
        }
        return head;
    }
}
