package com.siwanghu;

public class RemoveDuplicatesfromSortedListV2 {
    public Node removeDuplicatesfromSortedListV2(Node head){
        if(head==null || head.next==null)
            return head;
        int curDelete=head.val;
        Node preDelete=null,pHead=head;
        while(head!=null){
            Node preNode=head;
            while(head.val==curDelete){
                preNode=head;
                head=head.next;
            }
            
        }
        return pHead;
    }
}
