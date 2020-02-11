package com.siwanghu.array;

import java.util.HashSet;

public class ValidSudoku {
    public boolean validSudoku(char[][] array){
        if(array==null || array.length!=9 || array[0].length!=9)
            return false;
        int m=array.length;
        int n=array[0].length;
        HashSet<Character> setm=new HashSet<Character>();
        HashSet<Character> setn=new HashSet<Character>();
        for(int i=0;i<m;i++){
            setm.clear();
            setn.clear();
            for(int j=0;j<n;j++){
                if(array[i][j]=='.')
                    continue;
                else{
                    if(setm.contains(array[i][j]))
                        return false;
                    else
                        setm.add(array[i][j]);
                }
                if(array[j][i]=='.')
                    continue;
                else{
                    if(setn.contains(array[j][i]))
                        return false;
                    else
                        setn.add(array[j][i]);
                }
            }
        }
        int x=3,y=3;
        setm.clear();
        for(int block=0;block<9;block++){
            for(int i=block/3*3;i<block/3*3+3;i+=1){
                for(int j=block%3*3;j<block%3*3+3;j+=1){
                    if(array[i][j]=='.')
                        continue;
                    else{
                        if(setm.contains(array[i][j]))
                            return false;
                        else
                            setm.add(array[i][j]);
                    }
                }
            }
            setm.clear();
        }
        return true;
    }
}
