package com.siwanghu.linkedlist;

public class ReorderList {
    public Node reorderList(Node head){
        if(head==null || head.next==null || head.next.next==null)
            return head;
        Node slowNode=head,fastNode=head;
        while(slowNode!=null && fastNode!=null){
            if(fastNode.next==null || fastNode.next.next==null)
                break;
            slowNode=slowNode.next;
            fastNode=fastNode.next.next;
        }
        Node postHead=slowNode.next;
        slowNode.next=null;
        postHead=reverseList(postHead);
        Node phead=new Node(),nextNode=phead;
        while(head!=null || postHead!=null){
            nextNode.next=head;
            if(head!=null)
                head=head.next;
            nextNode=nextNode.next;
            nextNode.next=postHead;
            if(postHead!=null)
                postHead=postHead.next;
            nextNode=nextNode.next;
        }
        return phead.next;
    }

    private Node reverseList(Node head){
        if(head==null || head.next==null)
            return head;
        Node nextNode=head.next;
        head.next=null;
        while(nextNode!=null){
            Node temp=nextNode.next;
            nextNode.next=head;
            head=nextNode;
            nextNode=temp;
        }
        return head;
    }
}