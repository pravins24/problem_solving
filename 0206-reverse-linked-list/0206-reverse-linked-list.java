
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode previous = null;
        ListNode current = head;
        
        while(current != null)
        {  
            ListNode after = current.next; 
            current.next = previous;
            previous = current;
            current = after;
            
        }
        return previous;
    }
}
