package com.siwanghu.array;

public class ClimbingStairs {
    public int climbingStairs(int n){
        if(n<1)
            return 0;
        else if(n==1)
            return 1;
        else if(n==2)
            return 2;
        else{
            int[] array=new int[n];
            array[0]=1;
            array[1]=2;
            for(int i=2;i<array.length;i++){
                array[i]=array[i-1]+array[i-2];
            }
            return array[array.length-1];
        }
    }
}
