/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Duan
 */
import java.util.Scanner;

public class SumMatrix {
    
    public static int SumMajorDiagonal(int[][] m){
        int sum=0;
        for(int i=0;i<m.length;i++){
            if(i==m.length-i-1){
                sum+=m[i][i];
            }else{
                sum+=(m[i][i]+m[i][m.length-i-1]);
            }
        }
        return sum;
    }
    public static int[][] inputMatrix(){
        int a=0,b=0;
        Scanner console=new Scanner(System.in);
        a=console.nextInt();
        b=console.nextInt();
        int[][] m=new int[a][b];
        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                m[i][j]=console.nextInt();
            }
        }
        return m;
    }
    public static void main(String[] args){
        //int[][] m={{1,2,3,5},{4,5,6,10},{7,8,9,11},{5,8,9,3}};
        
        System.out.println(SumMajorDiagonal(inputMatrix()));
    }
}
