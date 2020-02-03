package com.siwanghu;

import java.util.*;

public class InsertInterval {

    /**
     * 给定一组不重叠的间隔，在间隔中插入一个新间隔（对重叠的间隔进行合并）
     * 假定间隔最初是根据其开始时间排序的
     */
    public ArrayList<Interval> insertInterval(ArrayList<Interval> intervals,Interval interval){
        Iterator<Interval> iterator=intervals.iterator();
        Interval preElement=null;
        boolean flag=false;
        while (iterator.hasNext()){
            Interval element=iterator.next();
            if(element.end>interval.start && interval.end>element.start){
                if(!flag) {
                    element.start = Math.min(element.start, interval.start);
                    element.end = Math.max(element.end, interval.end);
                    interval.start = element.start;
                    interval.end = element.end;
                    preElement = element;
                    flag = true;
                }else{
                    preElement.start = Math.min(preElement.start, element.start);
                    preElement.end = Math.max(preElement.end, element.end);
                    interval.start = preElement.start;
                    interval.end = preElement.end;
                    iterator.remove();
                }
            }
        }
        return intervals;
    }
}
