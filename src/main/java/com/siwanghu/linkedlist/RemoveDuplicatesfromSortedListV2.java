package com.siwanghu.linkedlist;

import com.siwanghu.linkedlist.Node;

public class RemoveDuplicatesfromSortedListV2 {
    public Node removeDuplicatesfromSortedListV2(Node head){
        if(head==null || head.next==null)
            return head;
        Node preDelete=null,pHead=head,preNode=head;
        while(head!=null){
            if(preNode!=head){
                if(preNode.val!=head.val){
                    preDelete=preNode;
                    preNode=head;
                    head=head.next;
                }else{
                    while(head!=null&&preNode.val==head.val)
                        head=head.next;
                    if(preDelete!=null) {
                        preDelete.next = head;
                        preNode = preDelete;
                    }else{
                        pHead=head;
                    }
                }
            }else{
                preNode=head;
                head=head.next;
            }
        }
        return pHead;
    }
}
