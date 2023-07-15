package leetcode.trains;

/**
 * @author 灵缘一梦
 * 链表反转
 *
 */
public class ReverseList {

    static class ListNode{
        int val;
        ListNode next;

        public ListNode(int val,ListNode next){
            this.val = val;
            this.next = next;
        }
    }

    /**
     * 迭代
     */
    public static ListNode iterate(ListNode head){
        ListNode pre = null, curr,  next;
        curr = head;

        while (curr != null){
            next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
        }
        return pre;
    }

    /**
     * 递归方式
     */
    public static ListNode reverse(ListNode head){
        if(head == null || head.next == null){
            return head;
        }
        ListNode node = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return node;
    }

    public static void main(String[] args) {
        ListNode node5 = new ListNode(5, null);
        ListNode node4 = new ListNode(4, node5);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(1, node2);

        //ListNode node = iterate(node1);

        ListNode node = reverse(node1);


        System.out.print(node.val + "  ");
        while (node.next != null){
            node = node.next;
            System.out.print(node.val + "  ");
        }
    }
}




















