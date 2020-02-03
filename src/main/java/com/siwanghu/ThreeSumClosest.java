package com.siwanghu;

import java.util.ArrayList;
import java.util.Arrays;

public class ThreeSumClosest {
    public class Triplet{
        public int i;
        public int j;
        public int k;
        public int sum;

        public Triplet(int i,int j,int k){
            this.i=i;
            this.j=j;
            this.k=k;
            this.sum=this.i+this.j+this.k;
        }

        @Override
        public String toString() {
            return "(" + i + "," + j + "," + k + ')'+"="+sum;
        }
    }

    public ArrayList<Triplet> threeSumClosest(int[] array,int target){
        ArrayList<Triplet> triplets=new ArrayList<Triplet>();
        if(array==null || array.length<3)
            return triplets;
        Arrays.sort(array);
        int close=Integer.MAX_VALUE;
        for(int i=0;i<array.length-2;i++){
            if(i>0 && array[i]==array[i-1])
                continue;
            int j=i+1;
            int k=array.length-1;
            while(j<k){
                int closet=Math.abs(array[i]+array[j]+array[k]-target);
                if(closet<=close){
                    if(closet<close) {
                        triplets.clear();
                        triplets.add(new Triplet(array[i], array[j], array[k]));
                        close = closet;
                    }else{
                        triplets.add(new Triplet(array[i], array[j], array[k]));
                        close = closet;
                    }
                }
                if(array[i]+array[j]+array[k]>target){
                    k--;
                    while(array[k]==array[k+1]&&j<k)
                        k--;
                }else{
                    j++;
                    while(array[j]==array[j-1]&&j<k)
                        j++;

                }
            }
        }
        return triplets;
    }
}
