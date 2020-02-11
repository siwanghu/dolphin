package com.siwanghu.linkedlist;

import com.siwanghu.linkedlist.Node;

public class ReverseLinkedListV2 {
    public Node reverseLinkedListV2(Node head, int m, int n){
        if(head==null||head.next==null||m<1||m>=n)
            return head;
        Node preHead=head,preTail=head,postHead=head;
        for(int i=1;i<m;i++){
            preTail=postHead;
            postHead=postHead.next;
        }
        Node postTail=postHead;
        Node nextNode=postHead.next;
        for(int i=m+1;i<=n;i++){
            Node temp=nextNode.next;
            nextNode.next=postHead;
            postHead=nextNode;
            nextNode=temp;
        }
        preTail.next=postHead;
        postTail.next=nextNode;
        return m==1?postHead:preHead;
    }
}