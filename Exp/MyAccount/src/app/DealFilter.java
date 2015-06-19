/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import model.Deal;
import model.NormalDeal;
import model.StockDeal;
import model.TransferDeal;
import util.DealAmountComparator;

/**
 *
 * @author Duan
 */
public class DealFilter {

    public static List GetRandomDeal(int n){
        List<Deal> dealList=new ArrayList<Deal>();
        Deal deal;
        Random random=new Random();
        int year,month,day,amountInt,type;
        Date date;
        String des="description",amount="";
        for(int i=0;i<n;i++){
            year=random.nextInt(10)+2000;
            month=random.nextInt(12)+1;
            day=random.nextInt(28)+1;
            date=new Date(year,month,day);
            amountInt=random.nextInt(1000);
            amount=""+amountInt;
            type=random.nextInt(3);
            switch(type){
                case 0:
                    deal=new NormalDeal(date,amount,des);
                    dealList.add(deal);
                    break;
                case 1:
                    deal=new TransferDeal(date,amount,des); 
                    dealList.add(deal);
                    break;
                case 2:
                    deal=new StockDeal(date,amount,des);
                    dealList.add(deal);
                    break;
                default:
                    i--;
            }
        }
        //System.out.println("-----before sort------");
        
        //Arrays.sort(deal);
        //System.out.println("-----default sort------");
        
       // Arrays.sort(deal,new DealAmountComparator());
        //System.out.println("-----Amount sort------");
        return dealList;
    }
    public static void DealIterator(List<Deal> dealList){
        Iterator it=dealList.iterator();
        while(it.hasNext()){
            Deal deal=(Deal)it.next();
            System.out.println(deal);
        }
    }
    public static void RmFDeal(List<Deal> dealList){
        for(int i=0;i<dealList.size();i++){
            if(Double.valueOf(dealList.get(i).getAmount())<500){
                dealList.remove(i);
                i--;
            }
        }
    }
    public static void main(String[] args){
        //有异常
        List<Deal> dealList=GetRandomDeal(10);
        System.out.println("-----before------");
        DealIterator(dealList);
        RmFDeal(dealList);
        System.out.println("-----after------");
        DealIterator(dealList);
    }
}
