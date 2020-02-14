package com.siwanghu.linkedlist;

import java.util.HashSet;

public class Node{
    public int val;
    public Node next;

    public Node(){
        this.val=-1;
        this.next=null;
    }

    public Node(int val,Node node){
        this.val=val;
        this.next=node;
    }

    @Override
    public String toString() {
        String result="";
        Node head=this;
        HashSet<Node> set=new HashSet<Node>();
        while(head!=null && !set.contains(head)){
            result+=('{'+"val=" + head.val + '}'+"-->");
            set.add(head);
            head=head.next;
        }
        return head==null?result+"null":result+head.next.val;
    }
}
