package com.siwanghu.string;

public class Atoi {
    public int atoi(String str){
        if(str==null || str.length()==0)
            return 0;
        long result=0;
        boolean sign=true,start=false;
        for(int i=0;i<str.length();i++){
            if(!start){
                if(str.charAt(i)==' ') {
                    continue;
                }else if(str.charAt(i)=='+' || str.charAt(i)=='-'){
                    sign=str.charAt(i)=='+'?true:false;
                    start=true;
                    continue;
                }else if(!Character.isDigit(str.charAt(i))){
                    throw new RuntimeException("error input!");
                }else{
                    i--;
                    start=true;
                }
            }else {
                if (!Character.isDigit(str.charAt(i)) || str.charAt(i) == ' ') {
                    throw new RuntimeException("error input!");
                } else if ((sign && result > Integer.MAX_VALUE) ||
                        (!sign && -result < Integer.MIN_VALUE)) {
                    throw new RuntimeException("out of range!");
                } else {
                    result=result*10+(str.charAt(i)-'0');
                }
            }
        }
        return sign?(int)result:-(int)result;
    }
}