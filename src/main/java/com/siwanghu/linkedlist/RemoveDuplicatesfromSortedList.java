package com.siwanghu.linkedlist;

import com.siwanghu.linkedlist.Node;

public class RemoveDuplicatesfromSortedList {
    public Node removeDuplicatesfromSortedList(Node head){
        if(head==null || head.next==null)
            return head;
        Node pHead=head,preNode=head;
        while(head!=null){
            if(preNode!=head){
                if(preNode.val==head.val){
                    preNode.next=head.next;
                }else{
                    preNode=head;
                }
            }
            head=head.next;
        }
        return pHead;
    }
}
