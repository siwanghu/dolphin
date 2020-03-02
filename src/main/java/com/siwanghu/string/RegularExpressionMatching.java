package com.siwanghu.string;

public class RegularExpressionMatching {
    public boolean regularExpressionMatching(String str,String regex){
        if(str==null || regex==null ||
                str.length()==0 || regex.length()==0)
            return false;
        return isMatch(str,regex);
    }

    private boolean isMatch(String str,String regex){
        return true;
    }
}
