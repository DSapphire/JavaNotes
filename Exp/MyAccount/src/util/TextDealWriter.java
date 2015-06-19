/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Duan
 */
public class TextDealWriter {
    
    public static void FraFwDeal() throws IOException{
        String frName="deal.dat";
        String fwName="dealreport.txt";
        String line;
        BufferedReader in = new BufferedReader(
                        new FileReader( frName  ) );
        BufferedWriter out = new BufferedWriter( 
                        new  FileWriter( fwName ) );
        line=in.readLine();
        while(line!=null){
            System.out.println(line);
            out.write(line);
            out.flush();
            out.newLine();
            line = in.readLine();
        }
        in.close();
        out.close();
        
    }
    public static void main(String[] args) throws IOException{
        FraFwDeal();
    }
}
