package com.siwanghu.linkedlist;

public class PalindromeLinkedList {
    public boolean palindromeLinkedList(Node head){
        if(head==null)
            return false;
        else if(head.next==null)
            return true;
        Node slowNode=head,fastNode=head;
        while(slowNode!=null && fastNode!=null){
            if(fastNode.next==null || fastNode.next.next==null)
                break;
            slowNode=slowNode.next;
            fastNode=fastNode.next.next;
        }
        Node posthead=slowNode.next;
        posthead=reverseLinkedList(posthead);
        while(posthead!=null){
            if(posthead.val!=head.val)
                return false;
            posthead=posthead.next;
            head=head.next;
        }
        return true;
    }

    private Node reverseLinkedList(Node head){
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
