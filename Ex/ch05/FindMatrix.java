/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Duan
 */
public class FindMatrix {
     public static void printMatrix(int[][] m){
        for(int i=0;i<m.length;i++){
            for(int j=0;j<m[i].length;j++){
                System.out.printf("%d\t",m[i][j]);
            }
            System.out.printf("\n");
        }
    }
    public static int[][] randomFillMatrix(){
        Scanner console=new Scanner(System.in);
        System.out.println("Input the length of the Squal Matrix:");
        int ml=console.nextInt();
        int[][] m=new int[ml][ml];
        Random random=new Random();
        for(int i=0;i<ml;i++){
            for(int j=0;j<ml;j++){
                m[i][j]=random.nextInt(2);
            }
        }
        return m;
    }
    public static void findMatrix(int[][] m){
        int colTemp=0,rowTemp=0,rightdown=0;
        int i,j;
        for(i=0;i<m.length;i++){

            rowTemp=0;
            for(j=0;j<m[i].length;j++){
                rowTemp+=m[i][j];
            }
            if(rowTemp==m[i].length){
                System.out.printf("The %d row is all 1.\n",i+1);
            }else if(rowTemp==0){
                System.out.printf("The %d row is all 0.\n",i+1);
            }

            colTemp=0;
            for(j=0;j<m.length;j++){
                colTemp+=m[j][i];
            }
            if(colTemp==m.length){
                System.out.printf("The %d column is all 1.\n",i+1);
            }else if(colTemp==0){
                System.out.printf("The %d column is all 0.\n",i+1);
            }
        }
        
        rightdown=0;
        for(i=0;i<m.length;i++){
            rightdown+=m[i][i];
        }
        if(rightdown==m.length){
            System.out.println("The rightdown Diagonal is all 1.");
        }else if(rightdown==0){
            System.out.println("The rightdown Diagonal is all 0.");
        }

        rightdown=0;
        for(i=0;i<m.length;i++){
            rightdown+=m[i][m.length-i-1];
        }
        if(rightdown==m.length){
            System.out.println("The leftdown Diagonal is all 1.");
        }else if(rightdown==0){
            System.out.println("The leftdown Diagonal is all 0.");
        }
    }
     public static void main(String[] args){
        int[][] m=randomFillMatrix();
        printMatrix(m);
        System.out.printf("\n");
        System.out.printf("\n");
        findMatrix(m);
        System.out.printf("\n");
        printMatrix(m);
    }
}
