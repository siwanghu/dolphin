package com.siwanghu.array;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

public class LongestConsecutiveSequence {
    public int longestConsecutiveSequence(int[] array){
        HashSet<Integer> set=new HashSet<Integer>();
        for(int i=0;i<array.length;i++){
            set.add(array[i]);
        }
        int result=Integer.MIN_VALUE,max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
        for(int i=0;i<array.length;i++){
            max=array[i]>max?array[i]:max;
            min=array[i]<min?array[i]:min;
        }
        for(int i=0;i<array.length;i++){
            int length=0;
            for(int j=array[i];j<=max;j++){
                if(set.contains(j))
                    length++;
                else
                    break;
            }
            for(int j=array[i]-1;j>=min;j--){
                if(set.contains(j))
                    length++;
                else
                    break;
            }
            result=Math.max(result,length);
        }
        return result;
    }
}
