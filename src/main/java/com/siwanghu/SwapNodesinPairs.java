package com.siwanghu;

public class SwapNodesinPairs {
    public Node swapNodesinPairs(Node head){
        if(head==null || head.next==null)
            return head;
        Node pHead=head.next,preTail=head;
        Node preNode=head,postNode=head.next;
        while(postNode!=null &&preNode!=null){
            Node temp1=postNode.next;
            Node temp2=temp1==null?null:temp1.next;
            postNode.next=preNode;
            preNode=temp1;
            postNode=temp2;
            if(postNode!=null)
                preTail.next=postNode;
            else
                preTail.next=preNode;
            preTail=preNode;
        }
        return pHead;
    }
}
