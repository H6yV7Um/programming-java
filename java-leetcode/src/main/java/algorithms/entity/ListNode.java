package algorithms.entity;


import java.util.LinkedList;

/**
 * Related Topics
 * Linked List
 * Created by yancy on 2018/4/25.
 */
public class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }

    public static void main(String[] args) {
        int[] nums1 = {4, 3};
        int[] nums2 = {6, 4};
        ListNode l1 = creatListNode(new ListNode(2), nums1);
        ListNode l2 = creatListNode(new ListNode(5), nums2);

        //1、遍历单链表
        while (true) {
            if (l1.next != null) {
                l1 = l1.next;

                break;
            }

        }

        Integer a = Integer.parseInt("" + l1.next.next.val + l1.next.val + l1.val);//遍历单链表
        Integer b = Integer.parseInt("" + l2.next.next.val + l2.next.val + l2.val);
        Integer sum = a + b;

        System.out.println(a);
        System.out.println(b);
        System.out.println(sum);
        System.out.println("===========");

        //2、将字符串分解
        String result = "" + sum;


        //3、创建返回的链表
        String sd = result.trim().substring(1, 1);
        ListNode listNode = creatListNode(new ListNode(7), new int[]{0, 8});
        System.out.println("" + listNode.next.next.val + listNode.next.val + listNode.val);

    }

    public static ListNode creatListNode(ListNode headList, int[] nums) {
        ListNode lastNode = headList;
        for (int i = 0; i < nums.length; i++) {
            ListNode node = new ListNode(nums[i]);
            lastNode.next = node;
            lastNode = node;


        }
        return headList;
    }

}
