package com.siwanghu;

import java.util.*;

public class MergeIntervals {
    /**
     * 给定间隔的集合，合并所有重叠的间隔
     * 假定间隔最初是根据其开始时间排序的
     */
    public ArrayList<Interval> mergeIntervals(ArrayList<Interval> intervals){
        if(intervals==null)
            throw new RuntimeException("null pointer error!");
        else if(intervals.size()<=1)
            return intervals;
        else{
            Iterator<Interval> iterator=intervals.iterator();
            Interval preElement=intervals.get(0);
            while(iterator.hasNext()){
                Interval element=iterator.next();
                if(preElement!=element && preElement.start<element.end && preElement.end>element.start){
                    preElement.start=Math.min(preElement.start,element.start);
                    preElement.end=Math.max(preElement.end,element.end);
                    iterator.remove();
                }else{
                    preElement=element;
                }
            }
            return intervals;
        }
    }
}
