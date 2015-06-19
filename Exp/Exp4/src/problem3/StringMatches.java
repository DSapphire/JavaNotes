/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem3;

/**
 *
 * @author Duan
 */
public class StringMatches {
    public static boolean testInput1(String s){
            boolean test=false;
            String regex="\\d+\\.?\\d+;\\d+\\.?\\d+;{1}\\d+\\.?\\d+;{1}\\d+\\.?\\d+";
            if(s.matches(regex))
                test=true;
            return test;
        }
    public static void main(String[] args){
        String s1="3.0;2.0;3.0;2.0";//true
        String s2="32;2.0;3.0;2.0";//
        String s3="0.01;2.0;3.0;2.0";//
        
        String s4=";2.0;3.0;2.0";//false
        String s5="1.2.1;2.0;3.0;2.0";//false
        String s6="1.;2.0;3.0;2.0";
        if(testInput1(s6)){
            System.out.println(s2);
        }
    }
}
