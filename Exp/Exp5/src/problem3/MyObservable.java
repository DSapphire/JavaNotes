/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem3;

import java.util.Observable;
import java.util.Observer;
/**
 *
 * @author Duan
 */
public class MyObservable extends Observable{
    String info="";
    public MyObservable(String info){
        this.info=info;
        
        this.addObserver(new Observer() {
            @Override
            public void update(Observable o, Object arg) {
                System.out.println("Observer 1 updated for <My MyObservable>");
            }
        });
        
        this.addObserver(new Observer() {

            @Override
            public void update(Observable o, Object arg) {
                System.out.println("Observer 2 updated for <My MyObservable>");
            }
        });
    }
    public MyObservable(){
        
    }
    
    public static void main(String[] args){
        MyObservable obs=new MyObservable("My MyObservable");
        obs.setChanged();
        obs.notifyObservers();
    }
    
}
