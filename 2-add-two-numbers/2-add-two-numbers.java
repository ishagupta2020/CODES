/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
         // Dont change the variable name, its used in main function
    int carry; // Dont change the variable name, its used in main function
/*    static Node reverse(Node head){
        Node current=head;
        Node prev=null;
        Node next=null;
        while(current!=null){
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        return prev;
    }*/

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry=0;
         ListNode dummy=new ListNode(0);
        ListNode tail=dummy;
        while(l1!=null || l2!=null){
            int x=l1!=null?l1.val:0;
            int y=l2!=null?l2.val:0;
            int sum=carry+x+y;
            carry=sum/10;
            tail.next=new ListNode(sum%10);
            tail=tail.next;
            if(l1!=null){
                l1=l1.next;
            }
            if(l2!=null){
                l2=l2.next;
            }
        }
            if(carry>0){
                tail.next=new ListNode(carry);
            }
            return dummy.next;
        }
}
        
          
        

    