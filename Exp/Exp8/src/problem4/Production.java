/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem4;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Duan
 */
public class Production {
    //ArrayList<String> production;
    WareHouse wh;
    int size=0;
    boolean available=false;
    Random random;
    
    int[] consumers;
    int[] producers;
    
    public Production(){
        //this.production=new ArrayList<>();
        this.wh=new WareHouse();
        this.random=new Random();
    }
    
    public void setPaC(int con,int pro){
        this.consumers=new int[con];
        this.producers=new int[pro];
        for(int i=0;i<this.consumers.length;i++){
            this.consumers[i]=0;
        }
        for(int i=0;i<this.producers.length;i++){
            this.producers[i]=0;
        }
    }
    public synchronized void produce(int id){
        if(this.available){
            try{
                wait();
            }catch(Exception e){}
        }
        String s=Test.RandomString(random.nextInt(5)+5);
        System.out.println("Producer"+Thread.currentThread().getName()+" produce string :"+s);
        //production.add(s);
        wh.addCargo(s);
        this.producers[id]++;
        available=true;
        notifyAll();
    }
    
    public synchronized void consume(int id){
        if(!available){
            try{
                wait();
            }catch(Exception e){}
            
        }
        if(this.available){
            int i=random.nextInt(wh.size());
            //String s=production.get(i);
            String s=wh.getCargo(i);
            System.out.println("Consumer"+Thread.currentThread().getName()+" consume string :"+s);
            //production.remove(i);
            wh.removeCargo(i);
            this.consumers[id]++;
            if(wh.size()==0){
                this.available=false;
            }
//            if(this.production.isEmpty()){
//                this.available=false;
//            }
        }
        
        notifyAll();
    }
}
