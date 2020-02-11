package com.siwanghu.linkedlist;

import com.siwanghu.linkedlist.Node;

public class ReverseNodesInkGroup {
    public Node reverseNodesInkGroup(Node head, int k){
        if(head==null||head.next==null||k==1)
            return head;
        Node preTail=null,pHead=null,newHead=null;
        boolean flag=true;
        while(head!=null){
            int step=1;
            Node nowNode=head;
            while(head.next!=null&&step<k){
                head=head.next;
                step++;
            }
            Node nextNode=head!=null?head.next:null;
            if(step!=k){
                if(preTail==null)
                    return nowNode;
                else{
                    preTail.next=nowNode;
                    return pHead;
                }
            }else{
                newHead=reverseKGroup(nowNode,k);
                if(flag){
                    pHead=newHead;
                    flag=false;
                }
            }
            if(preTail==null) {
                preTail = nowNode;
            }else{
                preTail.next=newHead;
                preTail=nowNode;
            }
            head=nextNode;
        }
        return pHead;
    }

    private Node reverseKGroup(Node head,int k){
        if(head==null)
            return head;
        int step=1;
        Node preNode=head,nextNode=head.next;
        while(step<k){
            Node temp=nextNode.next;
            if(preNode==head)
                preNode.next=null;
            nextNode.next=preNode;
            step++;
            if(step!=k) {
                preNode=nextNode;
                nextNode = temp;
            }
        }
        return nextNode;
    }
}