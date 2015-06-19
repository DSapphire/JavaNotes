/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem2;

/**
 *
 * @author Duan
 */
public class CounterThread implements Runnable{
    public static Object lock=new Object();
    int num=2;
    boolean isNotifier=false;
    
    public CounterThread(int num,boolean isNotifier){
        this.num=num;
        this.isNotifier=isNotifier;
    }

    @Override
    public void run() {
        synchronized(lock){
            for(int i=0;i<5;i++){
                System.out.println(Thread.currentThread().getName()+":"+i);
                if(i==num){
                    if(isNotifier){
                        lock.notifyAll();
                    }else{
                        try{
                            lock.wait();
                        }catch(InterruptedException e){
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    }
    public static void main(String[] args){
        Thread t1=new Thread(new CounterThread(2,false),"t1");
        Thread t2=new Thread(new CounterThread(3,false),"t2");
        Thread t3=new Thread(new CounterThread(4,false),"t3");
        
        t1.start();
        t2.start();
        try{
            Thread.sleep(20);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        t3.start();
    }
}
