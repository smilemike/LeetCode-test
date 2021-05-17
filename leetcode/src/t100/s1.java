package t100;


import common.ListNode;

//反转链表
public class s1 {

    public ListNode reverseList(ListNode head) {
        if (head==null) return null;
        ListNode ret = new ListNode(0);
        ListNode temp = head;
        while (temp!=null){
            ListNode next = temp.next;
            temp.next = ret.next;
            ret.next = temp;
            temp = next;
        }
        return ret.next;
    }
}
