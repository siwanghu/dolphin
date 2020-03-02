package com.siwanghu.string;

public class LongestPalindromicSubstring {
    public String longestPalindromicSubstring(String str){
        if(str==null || str.length()<=1)
            return str;
        int p_left=0,p_right=1;
        for(int i=0;i<str.length();i++){
            int left=i-1,right=i+1;
            if(left>=0 && right<=str.length()-1 &&
                    str.charAt(left)==str.charAt(right)){
                while(left>=0 && right<=str.length()-1 &&
                        str.charAt(left)==str.charAt(right)){
                    left--;
                    right++;
                }
                left++;
                right--;
                if(right+1-left>p_right-p_left){
                    p_right=right+1;
                    p_left=left;
                }
                continue;
            }else if(left>=0 && str.charAt(left)==str.charAt(i)){
                if(i+1-left>p_right-p_left){
                    p_right=i+1;
                    p_left=left;
                }
                continue;
            }else if(right<=str.length()-1 && str.charAt(i)==str.charAt(right)){
                if(right+1-i>p_right-p_left){
                    p_right=right+1;
                    p_left=i;
                }
                continue;
            }
        }
        return str.substring(p_left,p_right);
    }
}
