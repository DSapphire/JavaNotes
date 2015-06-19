/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.*;
/**
 *
 * @author Duan
 */
public class DealObjectSeria {
    public static NormalDeal[]  DealTest(int n){
        NormalDeal[] deal=new NormalDeal[n];
        Random random=new Random();
        int year,month,day,amountInt;
        Date date;
        String des="description",amount=" ";
        for(int i=0;i<n;i++){
            year=random.nextInt(10)+2000;
            month=random.nextInt(12)+1;
            day=random.nextInt(28)+1;
            date=new Date(year,month,day);
            amountInt=random.nextInt(10000)+2000;
            amount=""+amountInt;
           
            deal[i]=new NormalDeal(date,amount,des);
            System.out.println(deal[i]);

        }
        return deal;
    }
    
    public static void DealSeriaOOS(NormalDeal[] deal) throws IOException{
        String file="DealSeria.dat";
        ObjectOutputStream oos;
        oos = new ObjectOutputStream(
                new FileOutputStream(file));
        for(NormalDeal deal1:deal){
            oos.writeObject(deal1);
            oos.flush();
        }
        oos.close();
    }
    public static NormalDeal[] DealSeriaOIS(int n) throws IOException, ClassNotFoundException{
        String file="DealSeria.dat";
        ObjectInputStream ois = new ObjectInputStream(
				new FileInputStream(file));
        NormalDeal[] deal=new NormalDeal[n];
        for(int i=0;i<n;i++){
            deal[i]=(NormalDeal)ois.readObject();
        }
        ois.close();
        return deal;
    }
    public static void main(String[] args) throws IOException{
        NormalDeal[] deal=DealTest(3);
        DealSeriaOOS(deal);
        System.out.println("\n-------\n");
        try {
            NormalDeal[] deal1=DealSeriaOIS(3);
            if(deal1!=null){
                for(NormalDeal deal11:deal1){
                    System.out.println(deal11);
                }
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DealObjectSeria.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
