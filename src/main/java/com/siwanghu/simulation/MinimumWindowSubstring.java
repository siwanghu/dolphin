package com.siwanghu.simulation;

public class MinimumWindowSubstring {
    /*
    *给定一个字符串str和一个字符串substr，找到str中包含所有subStr字符的最小窗口字串
    * */
    public String minimumWindowSubstring(String str,String subStr){
        if(str==null || subStr==null || str.length()<subStr.length())
            return "";
        else{
            int[] appeared=new int[256];
            int[] expected=new int[256];
            int win_start=0,win_end=0,appeared_num=0,win_length=Integer.MAX_VALUE,min_start=0;
            for(int i=0;i<subStr.length();i++){
                expected[subStr.charAt(i)]+=1;
            }
            for(win_end=0;win_end<str.length();win_end++){
                if(expected[str.charAt(win_end)]>0){
                    appeared[str.charAt(win_end)]+=1;
                    if(appeared[str.charAt(win_end)]<=expected[str.charAt(win_end)]){
                        appeared_num++;
                    }
                }
                if(appeared_num==subStr.length()){
                    while (expected[str.charAt(win_start)]==0 ||
                            appeared[str.charAt(win_start)]>expected[str.charAt(win_start)]){
                        appeared[str.charAt(win_start)]--;
                        win_start++;
                    }
                    if(win_length>win_end-win_start+1){
                        win_length=win_end-win_start+1;
                        min_start=win_start;
                    }
                }
            }
            return win_length==Integer.MAX_VALUE ? "":str.substring(min_start,min_start+win_length);
        }
    }
}
