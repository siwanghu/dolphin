package com.siwanghu;

public class IncreasingTripletSubsequence {
    public boolean increasingTripletSubsequence(int[] array){
        if(array==null || array.length<3)
            return false;
        for(int i=0;i<array.length-2;i++){
            int j=i+1;
            int k=i+2;
            while(j<array.length-1 && k<array.length && array[j]<=array[i]){
                j++;
                k++;
            }
            if(j>=array.length-1)
                continue;;
            while(k<array.length && array[k]<=array[j]){
                k++;
            }
            if(k>=array.length)
                continue;
            return true;
        }
        return false;
    }

    public boolean increasingTripletSubsequenceV2(int[] array) {
        if(array==null || array.length<3)
            return false;
        int[] forward=new int[array.length];
        int[] backward=new int[array.length];
        int min=array[0],max=array[array.length-1];
        for(int i=0;i<array.length;i++){
            min=array[i]<min?array[i]:min;
            forward[i]=min;
        }
        for(int i=array.length-1;i>=0;i--){
            max=array[i]>max?array[i]:max;
            backward[i]=max;
        }
        for(int i=0;i<array.length;i++){
            if(array[i]>forward[i] && array[i]<backward[i])
                return true;
        }
        return false;
    }
}
