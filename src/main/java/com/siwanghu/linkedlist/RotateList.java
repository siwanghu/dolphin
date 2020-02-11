package com.siwanghu.linkedlist;

import com.siwanghu.linkedlist.Node;

public class RotateList {
    public Node rotateList(Node head, int k){
        if(head==null || head.next==null || k<1)
            return head;
        Node preNode=head,postNode=null;
        Node newTail=null,pHead=head;
        for(int i=1;i<=k && head!=null;i++){
            postNode=head;
            head=head.next;
        }
        if(head==null)
            return preNode;
        while(postNode.next!=null){
            newTail=preNode;
            postNode=postNode.next;
            preNode=preNode.next;
        }
        postNode.next=pHead;
        newTail.next=null;
        return preNode;
    }
}
