package lianbiao;

public class Solution {
    public static boolean isPalindrome(ListNode head){
        ListNode fast=head;
        ListNode slow=head;
        ListNode pre=head;
        ListNode prepare=null;
        while(fast!=null&&fast.next!=null){
            pre=slow;
            fast=fast.next.next;
            slow=slow.next;
            pre.next=prepare;
            prepare=pre;
        }
        if(fast!=null){
            slow=slow.next;
        }
        while(slow!=null){
            if(slow.val!=pre.val){
                return false;
            }
            slow=slow.next;
            pre=pre.next;
        }
        return true;
    }
}
