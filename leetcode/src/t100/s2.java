package t100;


import common.ListNode;

/**
 * 给你两个 非空 的链表，表示两个非负的整数。它们每位数字都是按照 逆序 的方式存储的，并且每个节点只能存储 一位 数字。
 *
 * 请你将两个数相加，并以相同形式返回一个表示和的链表。
 *
 * 你可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/add-two-numbers
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * 提示：
 *
 * 每个链表中的节点数在范围 [1, 100] 内
 * 0 <= Node.val <= 9
 * 题目数据保证列表表示的数字不含前导零
 *  2-4-5
 *  1
 */
public class s2 {


    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1==null&&l2==null) return null;

        ListNode temp1 = l1;
        ListNode temp2 = l2;

        ListNode result = null;
        ListNode curr = result;

        int flag = 0;
        while (temp1!=null||temp2!=null){

            ListNode newNode = new ListNode();
            if (result==null){
                result = newNode;
                curr = result;
            } else {
                curr.next = newNode;
                curr = newNode;
            }
            int v1 = temp1==null?0:temp1.val;
            int v2 = temp2==null?0:temp2.val;

            newNode.val = (v1+v2+flag)%10;
            if (v1+v2+flag>=10){
                flag=1;
            } else {
                flag=0;
            }

            temp1 = temp1==null?null:temp1.next;
            temp2 = temp2==null?null:temp2.next;
        }

        if (flag>0){
            ListNode newNode = new ListNode();
            newNode.val = 1;
            curr.next = newNode;
        }
        return result;
    }

    public static void main(String[] args) {

    }
}
