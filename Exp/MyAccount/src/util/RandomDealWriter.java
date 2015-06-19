/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;
import java.util.Random;
import model.*;

/**
 *
 * @author Duan
 */
public class RandomDealWriter {
    public static Deal[] DealTest(int n){
        Deal[] deal=new Deal[n];
        Random random=new Random();
        int year,month,day,amountInt,type;
        Date date;
        String des="description",amount="";
        for(int i=0;i<n;i++){
            year=random.nextInt(10)+2000;
            month=random.nextInt(12)+1;
            day=random.nextInt(28)+1;
            date=new Date(year,month,day);
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
            System.out.println(deal[i]);
        }
        return deal;
    }
    
    public static void DosDeal(Deal[] deal) throws IOException{
        String file="deal.dat";
        DataOutputStream dos = new DataOutputStream(
                    new FileOutputStream(file));
        for(Deal deal1:deal){
            //dos.writeChars(deal1.toPlainText());//会有空格
            dos.writeBytes(deal1.toPlainText());
            dos.flush();
            //
        }
        dos.close();
    }
    public static void DisDeal() throws IOException{
        String file="deal.dat";
//        DataInputStream dis = new DataInputStream(
//                    new FileInputStream(file));
        FileInputStream fis=new FileInputStream (file);
        int c;
        byte[] buf=new byte[128];
        while((c=fis.read(buf,0,buf.length))!=-1){
            String s=new String(buf,0,c);
            System.out.print(s);
        }

//        while((c=fis.read())!=-1){
//            System.out.write(c);
//        }//会缺少一行
        fis.close();
        
    }
    public static void main(String[] args) throws IOException{
        Deal[] deal=DealTest(3);
        DosDeal(deal);
        System.out.println("------");
        DisDeal();
    }
}
