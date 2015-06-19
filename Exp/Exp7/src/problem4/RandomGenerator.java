/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem4;

import java.util.Iterator;
import java.util.Random;
import java.util.TreeSet;

/**
 *
 * @author Duan
 */
public class RandomGenerator {
    public static TreeSet RandomGenInt(int n){
        int temp;
        int cnt=0;
        Random random=new Random();
        TreeSet<Integer> ts=new TreeSet<>();
        while(n>0){
            n--;
            temp=random.nextInt(100);
            if(!ts.contains(temp)){
                cnt++;
            }
            ts.add(temp);//元素自动去重
            //ts.add(10);
        }
        System.out.printf("生成了%d个不同的整数,TreeSet中有%d个元素",cnt,ts.size());
        return ts;
    }
    public static void PrintTreeSet(TreeSet ts){
//        int temp=-1,temp1=0;
//        Iterator it = ts.iterator();
//        System.out.println("\n------");
//        while(it.hasNext()){
//            temp1=(int)it.next();
//            if(temp1!=temp){
//                temp=temp1;
//                System.out.print(temp+"   ");
//            }
//        }
        System.out.println("\n------ts.size()="+ts.size());
        Iterator it1 = ts.iterator();
        int i=0;
        while(it1.hasNext()){
            if(i++%8==0){
                System.out.println();
            }
            System.out.print(it1.next()+"\t");
        }
    }
    public static void main(String[] args){
        PrintTreeSet(RandomGenInt(80));
    }
}
