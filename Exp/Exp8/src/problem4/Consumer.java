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
public class Consumer extends Thread{
    
    Production pr=null;
    int maxcon=10;//???
    int id;
    
    public Consumer(Production pr){
        this.pr=pr;
        this.id=0;
    }
    public Consumer(Production pr,int maxcon,int id){
        this.pr=pr;
        this.maxcon=maxcon;
        this.id=id;
    }
    public void setId(int id){
        this.id=id;
    }
    @Override
    
    public void run(){
        while(maxcon>pr.consumers[id]){
            pr.consume(id);
        }
        System.out.println("Consumer"+id+" ends! Finish consuming "+maxcon+" productions");
    }
}
