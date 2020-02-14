package com.siwanghu.linkedlist;

public class CopyListwithRandomPointer {
    public RandomNode copyListwithRandomPointer(RandomNode head){
        if(head==null)
            return head;
        RandomNode pHead=head;
        while(head!=null){
            RandomNode insertNode=new RandomNode(head.val,null,null);
            RandomNode nextNode=head.next;
            head.next=insertNode;
            insertNode.next=nextNode;
            head=nextNode;
        }
        head=pHead;
        while(head!=null){
            head.next.random=head.random;
            head=head.next.next;
        }
        head=pHead.next;
        RandomNode copyHead=new RandomNode();
        RandomNode nextNode=copyHead;
        while(head!=null){
            nextNode.next=head;
            head=head.next==null?null:head.next.next;
            nextNode=nextNode.next;
        }
        return copyHead.next;
    }
}