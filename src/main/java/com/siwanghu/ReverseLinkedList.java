package com.siwanghu;

public class ReverseLinkedList {
    public Node reverseLinkedList(Node head){
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
