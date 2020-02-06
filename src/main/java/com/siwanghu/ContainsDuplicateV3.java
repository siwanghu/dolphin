package com.siwanghu;

import java.util.TreeSet;

public class ContainsDuplicateV3 {
    public boolean containsDuplicateV3upT(int[] array,int t,int k){
        if(array==null || array.length<=1 || k<1 || t<0)
            return false;
        k=k>array.length-1?array.length-1:k;
        int start=0;
        TreeSet<Integer> treeSet=new TreeSet<Integer>();
        while (start+k<array.length){
            for(int i=start;i<=start+k;i++){
                treeSet.add(array[i]);
            }
            if(treeSet.last()-treeSet.first()>t)
                return true;
            start++;
        }
        return false;
    }

    public boolean containsDuplicateV3downT(int[] array,int t,int k){
        if(array==null || array.length<=1 || k<1 || t<0)
            return false;
        TreeSet<Integer> treeSet=new TreeSet<Integer>();
        for(int i=0;i<array.length;i++){
            Integer floor=treeSet.floor(array[i]);
            Integer ceiling=treeSet.ceiling(array[i]);
            if((floor!=null && array[i]-floor<=t) ||
                    (ceiling!=null && ceiling-array[i]<=t))
                return true;
            treeSet.add(array[i]);
            if(i>=k)
                treeSet.remove(array[i-k]);
        }
        return false;
    }
}
