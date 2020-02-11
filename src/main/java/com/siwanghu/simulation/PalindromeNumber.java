package com.siwanghu.simulation;

public class PalindromeNumber {
    /*
     *判断整数是否是回文数
     **/
    public boolean palindromeNumber(int num){
        if(num<0)
            return false;
        else{
            int num_=num,mul=1;
            while(num_>10){
                mul*=10;
                num_/=10;
            }
            while(num>0){
                int beg=num/mul;
                int end=num%10;
                if(beg!=end)
                    return false;
                else{
                    num=num-beg*mul;
                    num=num/10;
                    mul/=100;
                }
            }
            return true;
        }
    }
}
