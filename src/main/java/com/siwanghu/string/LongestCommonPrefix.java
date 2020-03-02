package com.siwanghu.string;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs){
        if(strs==null || strs.length==0)
            return null;
        String result="";
        for(int i=0;i<strs[0].length();i++){
            boolean isCommon=true;
            char ch=strs[0].charAt(i);
            for(int j=0;j<strs.length;j++){
                if(i==strs[j].length())
                    return result;
                if(strs[j].charAt(i)!=ch){
                    isCommon=false;
                    break;
                }
            }
            if(!isCommon)
                return result;
            result+=ch;
        }
        return result;
    }
}
