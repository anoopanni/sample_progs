Solution number 1:

class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode curr, next, temp;
        
        if(head == null || head.next == null)
            return head;
        
        next = head.next;
        curr = head;

        while(next.next != null){
            temp = next.next;
            next.next = curr;
            curr = next;
            next = temp;
        }
        
        next.next = curr;
        head.next = null;

        return next;
    }
}


better solution : 

class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode curr, next, temp;

        next = head;
        curr = null;

        while(next != null){
            temp = next.next;
            next.next = curr;
            curr = next;
            next = temp;
       }

        return curr;
    }
}

