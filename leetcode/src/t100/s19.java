package t100;

import com.learn.ListNode;

/**
 * 删除链表的倒数第N个节点
 */
public class s19 {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head==null||n<0) return head;
        ListNode temp = head;
        int l = 0;
        while (temp!=null){
            l++;
            temp = temp.next;
        }

        if (n>l){
            return head;
        }

        temp = head;
        while (l>=n+2){
            temp = temp.next;
            l--;
        }

        if (temp.next!=null){
            temp.next = temp.next.next;
            return head;
        }

        if (temp==head){
            return null;
        }
        return head;
    }
}
