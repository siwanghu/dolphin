package com.siwanghu;

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
        while(head!=null){
            result+=('{'+"val=" + head.val + '}'+"-->");
            head=head.next;
        }
        return result+"null";
    }
}
