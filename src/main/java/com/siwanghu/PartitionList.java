package com.siwanghu;

public class PartitionList {
    public Node partitionList(Node head,int val){
        if(head==null || head.next==null)
            return head;
        Node preHead=new Node(),preNext=preHead;
        Node postHead=new Node(),postNext=postHead;
        while(head!=null){
            if(head.val<val){
                preNext.next=head;
                preNext=preNext.next;
            }else{
                postNext.next=head;
                postNext=postNext.next;
            }
            head=head.next;
        }
        postNext.next=null;
        preNext.next=postHead.next;
        return preHead.next;
    }
}
