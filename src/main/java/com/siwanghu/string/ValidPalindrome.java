package com.siwanghu.string;

public class ValidPalindrome {
    public boolean validPalindrome(String str){
        if(str==null || str.length()==1)
            return true;
        int begin=0,end=str.length()-1;
        while(begin<end){
            while(!isLetterOrDigit(str.charAt(begin)) && begin<end)
                begin++;
            while(!isLetterOrDigit(str.charAt(end)) && begin<end)
                end--;
            if(Character.isLetter(str.charAt(begin)) && Character.isLetter(str.charAt(end))){
                if(Character.toLowerCase(str.charAt(begin))!=Character.toLowerCase(str.charAt(end)))
                    return false;
            }else {
                if(str.charAt(begin) !=str.charAt(end))
                    return false;
            }
            begin++;
            end--;
        }
        return true;
    }

    private boolean isLetterOrDigit(char ch){
        if(97<=ch && ch<=122)
            return true;
        else if(65<=ch && ch<=90)
            return true;
        else if(48<=ch && ch<=57)
            return true;
        else
            return false;
    }
}