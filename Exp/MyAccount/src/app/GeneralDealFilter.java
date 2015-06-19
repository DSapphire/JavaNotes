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
public class GeneralDealFilter {
    
    class GeneralDeal<T extends Deal>{
	//<T extends ClassA>
	private T var;
	public T getVar(){
		return var;
	}
	public void setVar(T var){
		this.var=var;
	}
	public void printInfo(){
		System.out.println(var);
	}
    }
    
    public List GetGeneralDeal(int n){
        List<GeneralDeal<? extends Deal>> dealList=new ArrayList<GeneralDeal<? extends Deal>>();
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
                    NormalDeal deal=new NormalDeal(date,amount,des);
                    GeneralDeal<NormalDeal> generalDeal=new GeneralDeal<>();
                    generalDeal.setVar(deal);
                    dealList.add(generalDeal);
                    break;
                case 1:
                    TransferDeal deal1=new TransferDeal(date,amount,des); 
                    GeneralDeal<TransferDeal> generalDeal1=new GeneralDeal<>();
                    generalDeal1.setVar(deal1);
                    dealList.add(generalDeal1);
                    break;
                case 2:
                    StockDeal deal2=new StockDeal(date,amount,des);
                    GeneralDeal<StockDeal> generalDeal2=new GeneralDeal<>();
                    generalDeal2.setVar(deal2);
                    dealList.add(generalDeal2);
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
    public void GenaralDealIterator(List<GeneralDeal<? extends Deal>> dealList){
        Iterator it=dealList.iterator();
        while(it.hasNext()){
            GeneralDeal<? extends Deal> deal= (GeneralDeal<? extends Deal>)it.next();
            System.out.println(deal.getVar().toPlainText());
        }
    }
    public void RmGeneralDeal(List<GeneralDeal<? extends Deal>> dealList){
//        for(int i=0;i<dealList.size();i++){
//            if(Double.valueOf(dealList.get(i).getVar().getAmount())<500){
//                dealList.remove(i);
//                i--;
//            }
//        }
        //异常
        Iterator it=dealList.iterator();
        while(it.hasNext()){
            GeneralDeal<? extends Deal> deal= (GeneralDeal<? extends Deal>)it.next();
            if(Double.valueOf(deal.getVar().getAmount())<500){
                it.remove();
            }
        }
    }

    public static void main(String[] args){
        GeneralDealFilter df=new GeneralDealFilter();
        List<GeneralDeal<? extends Deal>> dealList=df.GetGeneralDeal(10);
        System.out.println("-----before------");
        df.GenaralDealIterator(dealList);
        df.RmGeneralDeal(dealList);
        System.out.println("-----after------");
        df.GenaralDealIterator(dealList);
 
    }
}
