package com.siwanghu;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public class Indices{
        int begin;
        int end;
        public Indices(int begin,int end){
            this.begin=begin<end?begin:end;
            this.end=end>begin?end:begin;
        }

        @Override
        public String toString() {
            return "[" + begin +
                    "," + end +']';
        }
    }

    public ArrayList<Indices> twoSum(int[] array,int sum){
        ArrayList<Indices> result=new ArrayList<Indices>();
        if(array==null || array.length==0)
            return result;
        else{
            HashMap<Integer,Integer> map=new HashMap<Integer, Integer>();
            for(int i=0;i<array.length;i++){
                map.put(array[i],i);
            }
            for(int i=0;i<array.length;i++){
                if(map.containsKey(sum-array[i])){
                    result.add(new Indices(i,map.get(sum-array[i])));
                    map.remove(sum-array[i]);
                    map.remove(array[i]);
                }
                if(array[i]==sum){
                    result.add(new Indices(i,i));
                    map.remove(array[i]);
                }
            }
            return result;
        }
    }
}
