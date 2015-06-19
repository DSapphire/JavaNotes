/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem1;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Duan
 */
public class Test {
    public static void main(String[] args){
        PrintThread pt1=new PrintThread(10);
        PrintRunnable pr1=new PrintRunnable(10);
        pt1.start();
        new Thread(pr1).start();
        
        try {
            Thread.sleep(20);
        } catch (InterruptedException ex) {
            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("----------------");
        PrintThread pt2=new PrintThread(10);
        PrintRunnable pr2=new PrintRunnable(10);
        pt2.setPriority(6);
        new Thread(pr2).start();
        pt2.start();
        
        
        try {
            Thread.sleep(20);
        } catch (InterruptedException ex) {
            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("----------------");
        PrintThread pt3=new PrintThread(10);
        PrintRunnable pr3=new PrintRunnable(10);
        pt3.setPriority(8);
        new Thread(pr3).start();
        pt3.start();
        
        try {
            Thread.sleep(20);
        } catch (InterruptedException ex) {
            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("----------------");
        PrintThread pt4=new PrintThread(100);
        PrintRunnable pr4=new PrintRunnable(100);
        pt4.setPriority(8);
        new Thread(pr4).start();
        pt4.start();
        
    }
}
