package com.siwanghu.string;

public class AddBinary {
    public String addBinary(String str1,String str2){
        if(str1==null && str2==null)
            return null;
        int carry=0;
        StringBuffer result=new StringBuffer();
        int i=str1!=null?str1.length()-1:-1;
        int j=str2!=null? str2.length()-1:-1;
        while(i>=0 || j>=0){
            int temp=carry;
            if(i>=0){
                temp+=(str1.charAt(i)-'0');
                i--;
            }
            if(j>=0){
                temp+=(str2.charAt(j)-'0');
                j--;
            }
            if(temp<2){
                result.append(temp);
                carry=0;
            }else{
                carry=1;
                result.append(temp-2);
            }
        }
        if(carry!=0)
            result.append(carry);
        return result.reverse().toString();
    }
}
