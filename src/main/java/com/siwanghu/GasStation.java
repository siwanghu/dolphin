package com.siwanghu;

import java.util.ArrayList;

public class GasStation {
    public ArrayList<Integer> gasStation(int[] gas,int[] cost){
        ArrayList<Integer> result=new ArrayList<Integer>();
        if(gas==null || cost==null || gas.length!=cost.length)
            return result;
        for(int index=0;index<gas.length;index++){
            int carGas=0;
            boolean travel=true;
            for(int i=index,j=0;j<gas.length;i=(i+1)%gas.length,j++){
                if(gas[i]+carGas<cost[i]) {
                    travel=false;
                    break;
                }else{
                    carGas=carGas+gas[i]-cost[i];
                }
            }
            if(travel)
                result.add(index);
        }
        return result;
    }
}
