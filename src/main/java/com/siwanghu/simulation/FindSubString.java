package com.siwanghu.simulation;

import java.util.ArrayList;
import java.util.HashMap;

public class FindSubString {
    /*
    * 给定一个字符串str和一个字符串数组substrs，substrs中的字符串长度都相等，找出str中所有的子串恰好包含substrs中所有字符各一次，返回子串的起始位置
    * */
    public ArrayList<Integer> findSubString(String str,ArrayList<String> substrs){
        ArrayList<Integer> result=new ArrayList<Integer>();
        if(str==null || str.length()==0 || substrs==null || substrs.size()==0
                ||str.length()<substrs.size()*substrs.get(0).length())
            return result;
        else{
            HashMap<String,Integer> map=new HashMap<String, Integer>();
            for(int i=0;i<substrs.size();i++){
                if(map.containsKey(substrs.get(i)))
                    map.put(substrs.get(i),map.get(substrs.get(i))+1);
                else
                    map.put(substrs.get(i),1);
            }
            for(int i=0;i<substrs.get(0).length();i++){
                HashMap<String,Integer> curMap=new HashMap<String, Integer>();
                int count=0;
                int left=i;
                for(int j=i;j<=str.length()-substrs.get(0).length();j+=substrs.get(0).length()){
                    String curStr=str.substring(j,j+substrs.get(0).length());
                    if(map.containsKey(curStr)){
                        if(curMap.containsKey(curStr)){
                            curMap.put(curStr,curMap.get(curStr)+1);
                        }else{
                            curMap.put(curStr,1);
                        }
                        if(curMap.get(curStr)<=map.get(curStr)){
                            count++;
                        }else{
                            while (curMap.get(curStr)>map.get(curStr)){
                                String temp=str.substring(left,left+substrs.get(0).length());
                                if(curMap.containsKey(temp)){
                                    curMap.put(temp,curMap.get(temp)-1);
                                    if(curMap.get(temp)<map.get(temp)){
                                        count--;
                                    }
                                }
                                left+=substrs.get(0).length();
                            }
                        }
                        if(count==substrs.size()){
                            result.add(left);
                            String temp=str.substring(left,left+substrs.get(0).length());
                            if(curMap.containsKey(temp)){
                                curMap.put(temp,curMap.get(temp)-1);
                            }
                            count--;
                            left+=substrs.get(0).length();
                        }
                    }else{
                        curMap.clear();
                        count=0;
                        left=j+substrs.get(0).length();
                    }
                }
            }
            return result;
        }
    }
}
