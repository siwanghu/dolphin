package com.siwanghu.string;

public class ValidNumber {
    private enum InputType{
        InValid,  //0
        Space,    //1
        Sign,     //2
        Digit,    //3
        Dot,      //4
        Exp,      //5
    };

    private InputType getInputTypeById(int id){
        if(id==0)
            return InputType.InValid;
        else if(id==1)
            return InputType.Space;
        else if(id==2)
            return InputType.Sign;
        else if(id==3)
            return InputType.Digit;
        else if(id==4)
            return InputType.Dot;
        else if(id==5)
            return InputType.Exp;
        else
            throw new RuntimeException("error id!");
    }
    public boolean validNumber(String str){
        if(str==null || str.length()==0)
            return false;
        int state=0;
        int[][] matchine={
                //InValid  space  Sign  Digit  Dot  Exp
                {-1,0,1,2,-1,-1},     //state0==begin
                {-1,-1,-1,2,-1,-1},   //state1==readSign
                {-1,-1,-1,2,3,4},     //state2==readDight
                {-1,-1,-1,2,-1,-1},   //state3==readDot
                {-1,-1,-1,5,-1,-1},   //state4==readExp
                {-1,-1,-1,6,-1,-1},   //Exp5==readExpAndDigit
                {-1,-1,-1,6,-1,-1},   //Exp6==AfterExp
        };
        for(int i=0;i<str.length();i++){
            InputType inputType;
            if(str.charAt(i)=='.')
                inputType=InputType.Dot;
            else if(str.charAt(i)=='e')
                inputType=InputType.Exp;
            else if(Character.isDigit(str.charAt(i)))
                inputType=InputType.Digit;
            else if(str.charAt(i)=='+' || str.charAt(i)=='-')
                inputType=InputType.Sign;
            else if(str.charAt(i)==' ')
                inputType=InputType.Space;
            else
                inputType=InputType.InValid;
            if(matchine[state][inputType.ordinal()]==-1)
                return false;
            else
                state=matchine[state][inputType.ordinal()];
        }
        return true;
    }
}
