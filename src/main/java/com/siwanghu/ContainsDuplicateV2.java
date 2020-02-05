package com.siwanghu;

import java.util.HashMap;

public class ContainsDuplicateV2 {
    public boolean containsDuplicateV2(int[] array,int k){
        if(array==null || array.length<=1 || k<1)
            return false;
        HashMap<Integer,Integer> map=new HashMap<Integer, Integer>();
        for(int i=0;i<array.length;i++){
            if(!map.containsKey(array[i])){
                map.put(array[i],i);
            }else{
                if(Math.abs(map.get(array[i])-i)<=k)
                    return true;
                else
                    map.put(array[i],i);
            }
        }
        return false;
    }
}
