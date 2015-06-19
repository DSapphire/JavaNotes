/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem4;

/**
 *
 * @author Duan
 */
public class StringInpute {
    public String st;
    public boolean isFormated=false;
    public StringInpute(String st){
        this.st=st;
    }
    public boolean testIsF(){
        int i;
        for(i=st.length()-1;i>=0;i--){
            if(st.charAt(i)=='0')
                continue;
            else
                break;
        }
        if(st.indexOf(".")-i>=-2)
            isFormated=true;
        return isFormated;
    }
}
