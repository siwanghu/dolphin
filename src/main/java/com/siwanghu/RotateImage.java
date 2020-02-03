package com.siwanghu;

public class RotateImage {
    public int[][] rotateImage(int[][] image){
        if(image==null || image.length==0)
            return image;
        else if(image.length!=image[0].length)
            throw new RuntimeException("image error!");
        else{
            int[][] result=new int[image.length][image[0].length];
            for(int i=0;i<image.length;i++){
                for(int j=0;j<image[0].length;j++){
                    result[j][image.length-i-1]=image[i][j];
                }
            }
            return result;
        }
    }
}
