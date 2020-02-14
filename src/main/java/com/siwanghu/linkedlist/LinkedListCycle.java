package com.siwanghu.linkedlist;

public class LinkedListCycle {
    public boolean linkedListCycle(Node head){
        if(head==null)
            return false;
        Node fastNode=head,slowNode=head;
        while(fastNode!=null && slowNode!=null){
            slowNode=slowNode.next;
            fastNode=fastNode.next!=null?fastNode.next.next:null;
            if(fastNode==slowNode && fastNode!=null)
                return true;
        }
        return false;
    }
}
