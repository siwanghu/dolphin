package com.siwanghu;

public class MultiplyStrings {
    /*
    * 给定两个以字符串表示的整数，将整数的乘法返回为字符串
    * 注意：数字可以任意大，并且不能为负数
    * */
    public String multiplyStrings(String x,String y){
        if("0".equals(x.trim()) || "0".equals(y.trim()))
            return "0";
        else{
            int[] xs=new int[x.length()];
            int[] ys=new int[y.length()];
            int[] zs=new int[x.length()+y.length()];
            for(int i=x.length()-1,j=0;i>=0;i--,j++){
                xs[j]=x.charAt(i)-'0';
            }
            for(int i=y.length()-1,j=0;i>=0;i--,j++){
                ys[j]=y.charAt(i)-'0';
            }
            for(int i=0;i<xs.length;i++){
                for(int j=0;j<ys.length;j++){
                    zs[i+j]+=xs[i]*ys[j];
                }
            }
            for(int i=0;i<zs.length-1;i++){
                zs[i+1]+=zs[i]/10;
                zs[i]%=10;
            }
            String result="";
            for(int i=zs.length-1;i>=0;i--){
                if(zs[i]!=0){
                    result+=zs[i];
                }
            }
            return result;
        }
    }
}
