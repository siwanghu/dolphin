package com.siwanghu;

import java.util.HashSet;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] array){
        if(array==null || array.length<=1)
            return true;
        HashSet<Integer> set=new HashSet<Integer>();
        for(int i=0;i<array.length;i++){
            if(set.contains(array[i]))
                return false;
            else
                set.add(array[i]);
        }
        return true;
    }
}