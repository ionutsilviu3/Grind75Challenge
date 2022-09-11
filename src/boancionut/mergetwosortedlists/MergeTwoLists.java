package boancionut.mergetwosortedlists;

public class MergeTwoLists {

    public static ListNode mergeTwoLists(ListNode listNode1, ListNode listNode2)
    {
        ListNode head = new ListNode(0);
        ListNode handler = head;

        while(listNode1 != null && listNode2 != null)
        {
            if(listNode1.val <= listNode2.val)
            {
                handler.next = listNode1;
                listNode1 = listNode1.next;
            }
            else {
                handler.next = listNode2;
                listNode2 = listNode2.next;
            }
            handler = handler.next;
        }
        if(listNode1 != null)
            handler.next = listNode1;
        else if (listNode2 != null)
            handler.next = listNode2;

        return head.next;
    }

    public static void main(String[] args) {

    }
}
