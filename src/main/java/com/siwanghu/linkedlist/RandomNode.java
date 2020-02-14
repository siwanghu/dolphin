package com.siwanghu.linkedlist;

public class RandomNode {
    public int val;
    public RandomNode next;
    public RandomNode random;

    public RandomNode(){
        this.val=-1;
        this.next=null;
        this.random=null;
    }

    public RandomNode(int val,RandomNode next,RandomNode random){
        this.val=val;
        this.next=next;
        this.random=random;
    }

    @Override
    public String toString(){
        String result="";
        RandomNode head=this;
        while(head!=null){
            String randomVal="null";
            if(head.random!=null)
                randomVal=String.valueOf(head.random.val);
            result+=("{(val="+head.val+")"+"-->"+randomVal+"}"+"-->");
            head=head.next;
        }
        return result+="null";
    }
}
