package com.siwanghu;

public class RemoveNthNodeFromEndofList {
    public Node removeNthNodeFromEndofList(Node head,int k){
        if(head==null||k<1)
            return head;
        Node preNode=head,postNode=null;
        Node preDelete=null,pHead=head;
        for(int i=1;i<=k&&head!=null;i++){
            postNode=head;
            head=head.next;
        }
        if(postNode.next==null)
            return preNode.next;
        while (postNode.next!=null){
            preDelete=preNode;
            preNode=preNode.next;
            postNode=postNode.next;
        }
        preDelete.next=preNode.next;
        return pHead;
    }
}
