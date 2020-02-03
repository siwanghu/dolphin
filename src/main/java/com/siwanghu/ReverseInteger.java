package com.siwanghu;

public class ReverseInteger {
    /*
    *返回整数的反向数字
    **/
    public long reverseInteger(int num){
        long retNum=0;
        boolean flag=num>=0?true:false;
        num=Math.abs(num);
        while(num>0){
            retNum=retNum*10+num%10;
            num/=10;
        }
        if((flag&&retNum>Math.pow(2,31)-1)||(!flag&&retNum>Math.pow(2,31))){
            throw new RuntimeException("overflow error!");
        }else{
            return flag?retNum:-retNum;
        }
    }
}
