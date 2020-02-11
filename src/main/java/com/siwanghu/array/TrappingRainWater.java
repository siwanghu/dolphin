package com.siwanghu.array;

public class TrappingRainWater {
    public int trappingRainWater(int[] array){
        int trappingRainWater=0;
        if(array==null || array.length<3)
            return trappingRainWater;
        for(int split=0;split<array.length;split++){
            int rightMax=Integer.MIN_VALUE;
            for(int i=split;i<array.length;i++){
                rightMax=array[i]>rightMax?array[i]:rightMax;
            }
            int leftMax=Integer.MIN_VALUE;
            for(int i=0;i<=split;i++){
                leftMax=array[i]>leftMax?array[i]:leftMax;
            }
            trappingRainWater=Math.min(rightMax,leftMax)-array[split]+trappingRainWater;
        }
        return trappingRainWater;
    }
}
