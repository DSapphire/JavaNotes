package app;


import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;
import model.Deal;
import util.DealAmountComparator;
import model.NormalDeal;
import model.StockDeal;
import model.TransferDeal;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Duan
 */
public class TestDeal {
    public static void main(String[] args){
        Deal[] deal=new Deal[10];
        Random random=new Random();
        int year,month,day,amountInt,type;
        Date date;
        String des="description",amount="";
        for(int i=0;i<10;i++){
            year=random.nextInt(10)+2000;
            month=random.nextInt(12)+1;
            day=random.nextInt(28)+1;
            Calendar cal=Calendar.getInstance();
            cal.set(year, month, day);
            date=cal.getTime();
            //cal.setTime(date);
            //date=new Date(year,month,day);////Calendar
            amountInt=random.nextInt(10000)+2000;
            amount=""+amountInt;
            type=random.nextInt(3);
            switch(type){
                case 0:
                    deal[i]=new NormalDeal(date,amount,des); break;
                case 1:
                    deal[i]=new TransferDeal(date,amount,des); break;
                case 2:
                    deal[i]=new StockDeal(date,amount,des); break;
                default:
                    i--;
            }
        }
        System.out.println("-----before sort------");
        for(int i=0;i<10;i++){
            System.out.println(deal[i].toPlainText());
        }
        Arrays.sort(deal);
        System.out.println("-----default sort------");
        for(int i=0;i<10;i++){
            System.out.println(deal[i].toPlainText());
        }
        Arrays.sort(deal,new DealAmountComparator());
        System.out.println("-----Amount sort------");
        for(int i=0;i<10;i++){
            System.out.println(deal[i].toPlainText());
        }
        
    }
}
