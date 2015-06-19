package util;


import java.util.Comparator;
import model.Deal;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Duan
 */
public class DealAmountComparator implements Comparator<Deal>{

    @Override
    public int compare(Deal o1, Deal o2) {
        return Double.valueOf(o1.getAmount()).compareTo(Double.valueOf(o2.getAmount()));
    }
    
}
