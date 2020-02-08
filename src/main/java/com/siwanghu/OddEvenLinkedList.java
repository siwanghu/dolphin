package com.siwanghu;

public class OddEvenLinkedList {
    public Node oddEvenLinkedList(Node head){
        if(head==null && head.next==null &&
                head.next.next==null)
            return head;
        Node oddHead=new Node(),evenHead=new Node();
        Node oddNode=oddHead,evenNode=evenHead;
        boolean oddEven=true;
        while(head!=null){
            if(oddEven) {
                oddNode.next = head;
                oddNode=oddNode.next;
                head=head.next;
                oddNode.next=null;
                oddEven=false;
            }else{
                evenNode.next=head;
                evenNode=evenNode.next;
                head=head.next;
                evenNode.next=null;
                oddEven=true;
            }
        }
        oddNode.next=evenHead.next;
        return oddHead.next;
    }
}