package com.siwanghu;

import java.util.ArrayList;
import java.util.Arrays;

public class FourSum {
    public class Triplet{
        public int a;
        public int b;
        public int c;
        public int d;

        public Triplet(int a,int b,int c,int d){
            this.a=a;
            this.b=b;
            this.c=c;
            this.d=d;
        }

        @Override
        public String toString() {
            return "(" + a + "," + b + "," + c +"," + d + ')';
        }
    }

    public ArrayList<Triplet> fourSum(int[] array,int sum){
        ArrayList<Triplet> triplets=new ArrayList<Triplet>();
        if(array==null || array.length<4)
            return triplets;
        Arrays.sort(array);
        for(int i=0;i<array.length-3;i++){
            if(i>0 && array[i]==array[i-1])
                continue;
            for(int j=i+1;j<array.length-2;j++){
                if(j>i+1 && array[j]==array[j-1])
                    continue;
                int k=j+1;
                int l=array.length-1;
                while(k<l){
                    if(array[i]+array[j]+array[k]+array[l]<sum){
                        k++;
                        while(array[k]==array[k-1] && k<l)
                            k++;
                    }else if(array[i]+array[j]+array[k]+array[l]>sum){
                        l--;
                        while(array[l]==array[l+1] && k<l)
                            l--;
                    }else{
                        triplets.add(new Triplet(array[i],array[j],array[k],array[l]));
                        k++;
                        l--;
                        while(array[k]==array[k-1] && k<l)
                            k++;
                        while(array[l]==array[l+1] && k<l)
                            l--;
                    }
                }
            }
        }
        return triplets;
    }
}
