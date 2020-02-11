package com.siwanghu.linkedlist;

public class AddTwoNumbers {
    public Node addTwoNumbers(Node L1, Node L2){
        if(L1!=null && L2!=null){
            Node head=new Node(),nextNode=head;
            int carry=0;
            while(L1!=null || L2!=null){
                Node temp=new Node(0,null);
                if(L1!=null)
                    temp.val+=(L1.val);
                if(L2!=null)
                    temp.val+=(L2.val);
                temp.val+=carry;
                carry=temp.val/10;
                temp.val%=10;
                nextNode.next=temp;
                nextNode=nextNode.next;
                L1=L1.next;
                L2=L2.next;
            }
            if(carry!=0){
                Node temp=new Node();
                temp.val=carry;
                nextNode.next=temp;
            }
            return head.next;
        }else{
            return L1==null?L2:L1;
        }
    }
}