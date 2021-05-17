package t100;


import common.ListNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 * 合并有序链表
 *  1 参数校验，边界校验。
 *  2 循环和循环条件。
 *      1 值的读取和运算
 *      2 指针后移的条件和指针后移
 *      3 边界情况处理
 *  3 循环结束，超出边界的情况处理
 *  4 头节点初始化处理，初始化一个head，返回时去掉head，直接返回head.next。
 */
public class s21 {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        if (l1==null){
            return l2;
        }
        if (l2==null){
            return l1;
        }

        ListNode head = new ListNode(0);
        ListNode p = head;
        while (l1!=null&&l2!=null){
            if (l1.val<l2.val){
                p.next = l1;
                l1 = l1.next;
            } else {
                p.next = l2;
                l2 = l2.next;
            }
            p = p.next;
        }
        if (l1==null){
            p.next = l2;
        }
        if (l2==null){
            p.next = l1;
        }
        return head.next;
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(4);
        node1.next = node2;
        node2.next = node3;

        ListNode node4 = new ListNode(1);
        ListNode node5 = new ListNode(3);
        ListNode node6 = new ListNode(4);

        node4.next =node5;
        node5.next = node6;
        new s21().mergeTwoLists(node1,node4);

        /*for (int i=0;i<10;i++){
            System.out.println("i------>"+i);
            for (int j=0;j<10;j++){
                System.out.println("===============ij=============");
                System.out.println("i------>"+i);
                System.out.println("j------>"+j);
                System.out.println("============================");
                if (j==3){
                    break;
                }
            }
        }*/
    }
}
