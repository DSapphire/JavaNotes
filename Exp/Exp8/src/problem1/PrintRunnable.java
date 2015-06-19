/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem1;

/**
 *
 * @author Duan
 */
public class PrintRunnable implements Runnable{

     private int num=0;
     public PrintRunnable(int num){
         this.num=num;
     }
    @Override
    public void run() {
        System.out.println("PrintRunnable 打印：");
        for(int i=0;i<num;i++){
            System.out.println("PrintRunnable 打印："+i);
        }
        System.out.println("PrintRunnable 结束");
    }
    
}
