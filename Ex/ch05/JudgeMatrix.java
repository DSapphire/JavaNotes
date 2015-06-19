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

public class JudgeMatrix {
    Scanner console;

    public JudgeMatrix(){
    	this.console=new Scanner(System.in);
    }

    public void printMatrix(int[][] m){
        for(int i=0;i<m.length;i++){
            for(int j=0;j<m[i].length;j++){
                System.out.printf("%d\t",m[i][j]);
            }
            System.out.printf("\n");
        }
    }
    public int[][] inputMatrix(){
        int a=0,b=0;
        a=console.nextInt();
        b=console.nextInt();
        //System.out.printf("AAA\n");
        int[][] m=new int[a][b];
        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                //System.out.printf("BB"+i+j+"\n");
                m[i][j]=console.nextInt();
            }
        }
        return m;
    }

    public static boolean isConsecutiveFour(int[][] values){
        boolean isC=false;
        int temp=0;
        if(values.length<4 && values[0].length<4){
        	return false;
        }else{
            //for row
        	for(int i=0;i<values.length;i++){
        		for(int j=0;j<values[i].length-3;j++){
        			temp=values[i][j];
        			isC=true;
        			for(int k=0;k<4;k++){
        				if(temp!=values[i][j+k]){
        					isC=false;
        					break;
        				}
        			}
        			if(isC){
                        System.out.printf("Four consecutive equal number is from (%d,%d) in row.",i+1,j+1);
        				return isC;
        			}
        		}
        	}
            //for column
        	for(int i=0;i<values[0].length;i++){
        		for(int j=0;j<values.length-3;j++){
        			temp=values[j][i];
        			isC=true;
        			for(int k=0;k<4;k++){
        				if(temp!=values[j+k][i]){
        					isC=false;
        					//j+=k;
        					break;
        				}
        			}
        			if(isC){
                        System.out.printf("Four consecutive equal number is from (%d,%d) in column.",j+1,i+1);
        				return isC;
        			}
        		}
        	}


            if(values.length>3&&values[0].length>3){
                //for rightup
                for(int i=3;i<values.length;i++){
                    for(int j=0;j<values.length-3;j++){
                        temp=values[i][j];
                        isC=true;
                        for(int k=0;k<4;k++){
                            if(temp!=values[i-k][j+k]){
                                isC=false;
                                break;
                            }
                        }
                        if(isC){
                            System.out.printf("Four consecutive equal number is from (%d,%d) rightup.",i+1,j+1);
                            return isC;
                        }
                    }
                }
                //for rightdown
                for(int i=0;i<values.length-3;i++){
                    for(int j=0;j<values.length-3;j++){
                        temp=values[i][j];
                        isC=true;
                        for(int k=0;k<4;k++){
                            if(temp!=values[i+k][j+k]){
                                isC=false;
                                break;
                            }
                        }
                        if(isC){
                            System.out.printf("Four consecutive equal number is from (%d,%d) rightdown.",i+1,j+1);
                            return isC;
                        }
                    }
                }
            }
        }
        return isC;
    }
    public static void main(String[] args) {
    	JudgeMatrix jm=new JudgeMatrix();
    	int[][] m=jm.inputMatrix();
    	jm.printMatrix(m);
    	boolean isC=jm.isConsecutiveFour(m);
    	System.out.println(isC);
    }
}
