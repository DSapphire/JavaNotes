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

public class MultiMatrix {

    Scanner console;

    public MultiMatrix(){
        this.console=new Scanner(System.in);
    }
    
    public double[][] multiplyMatrix(double[][] a, double[][] b){
        double[][] multi=new double[a.length][b[0].length];
        int i=0,j=0,k=0;
        for(i=0;i<multi.length;i++){
            for(j=0;j<multi[i].length;j++){
                multi[i][j]=0;
                for(k=0;k<a[0].length;k++){
                    multi[i][j]+=a[i][k]*b[k][j];
                }
            }
        }
        return multi;
    }
    public void printMatrix(double[][] m){
        for(int i=0;i<m.length;i++){
            for(int j=0;j<m[i].length;j++){
                System.out.printf("%.1f\t",m[i][j]);
            }
            System.out.printf("\n");
        }
    }
    public double[][] inputMatrix(){
        int a=0,b=0;
        a=console.nextInt();
        b=console.nextInt();
        //System.out.printf("AAA\n");
        double[][] m=new double[a][b];
        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                //System.out.printf("BB"+i+j+"\n");
                m[i][j]=console.nextDouble();
            }
        }
        return m;
    }
    public static void main(String[] args){
        //double[][] m={{1.0,2.0,23.0},{3.0,6.0,5.0},{8.0,9.0,7.0}};

        //printMatrix(m);
        MultiMatrix mm=new MultiMatrix();
        double[][] a=mm.inputMatrix();
        double[][] b=mm.inputMatrix();
        mm.printMatrix(a);
        System.out.printf("\n");
        mm.printMatrix(b);
        System.out.printf("\n");
        mm.printMatrix(mm.multiplyMatrix(a,b));
    }
}
