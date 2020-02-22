package com.siwanghu.string;

public class StrStr {
    public int strStr(String str,String subStr){
        if(str==null || subStr==null || str.length()<subStr.length())
            return -1;
        for(int i=0;i<=str.length()-subStr.length();i++){
            boolean isStr=true;
            for(int j=0;j<subStr.length();j++){
                if(subStr.charAt(j)!=str.charAt(i+j)){
                    isStr=false;
                    break;
                }
            }
            if(isStr)
                return i;
        }
        return -1;
    }

    public int strStrKMP(String str,String subStr){
        if(str==null || subStr==null || str.length()<subStr.length())
            return -1;

        return -1;
    }
}