package com.siwanghu.linkedlist;

public class LinkedListCycleV2 {
    public Node linkedListCycleV2(Node head){
        if(head==null)
            return null;
        Node slowNode=head,fastNode=head;
        while(slowNode!=null && fastNode!=null){
            slowNode=slowNode.next;
            fastNode=fastNode.next!=null?fastNode.next.next:null;
            if(fastNode==slowNode && fastNode!=null){
                Node pHead=head;
                while(pHead!=slowNode){
                    pHead=pHead.next;
                    slowNode=slowNode.next;
                }
                return pHead;
            }
        }
        return null;
    }
}
