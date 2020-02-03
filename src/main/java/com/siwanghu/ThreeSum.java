package com.siwanghu;

import java.util.ArrayList;
import java.util.Arrays;

public class ThreeSum {
    public class Triplet{
        public int i;
        public int j;
        public int k;

        public Triplet(int i,int j,int k){
            this.i=i;
            this.j=j;
            this.k=k;
        }

        @Override
        public String toString() {
            return "(" + i + "," + j + "," + k + ')';
        }
    }

    public ArrayList<Triplet> threeSum(int[] array,int sum){
        ArrayList<Triplet> triplets=new ArrayList<Triplet>();
        if(array==null || array.length<3)
            return triplets;
        Arrays.sort(array);
        for(int i=0;i<array.length-2;i++){
            if(i>0&&array[i]==array[i-1])
                continue;
            int j=i+1;
            int k=array.length-1;
            while(j<k){
                if(array[i]+array[j]+array[k]<sum){
                    j++;
                    while(array[j-1]==array[j] && j<k)
                        j++;
                }else if(array[i]+array[j]+array[k]>sum){
                    k--;
                    while(array[k]==array[k+1] && j<k)
                        k--;
                }else{
                    triplets.add(new Triplet(array[i],array[j],array[k]));
                    j++;
                    k--;
                    while(array[j-1]==array[j] && j<k)
                        j++;
                    while(array[k]==array[k+1] && j<k)
                        k--;
                }
            }
        }
        return triplets;
    }
}
