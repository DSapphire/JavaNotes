/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

/**
 *
 * @author Duan
 */
public class DealZipWrite {
    public static void ZipFileDeal() throws IOException{
        String zipfile="deal.zip";
        String fileName1="deal.dat";
        String fileName2="dealreport.txt";
        int c;
        ZipOutputStream out=new ZipOutputStream(
                        new BufferedOutputStream(
                        new FileOutputStream(zipfile)));
        
        BufferedInputStream in1 =new BufferedInputStream(
                        new FileInputStream(fileName1));
        out.putNextEntry(new ZipEntry(fileName1)); 
        while((c = in1.read()) != -1){
            out.write(c);
            out.flush();
        }   
        in1.close();
        
        BufferedInputStream in2 =new BufferedInputStream(
                        new FileInputStream(fileName2));
        out.putNextEntry(new ZipEntry(fileName2)); 
        while((c = in2.read()) != -1){
            out.write(c);
            out.flush();
        }
        in2.close();
        
        out.closeEntry();
        out.close();
    }
    public static void UzipFileDeal() throws IOException{
        String zipfile="deal.zip";
        ZipInputStream in =new ZipInputStream(
                        new BufferedInputStream(
                        new FileInputStream(zipfile)));
        ZipEntry ze;
         while((ze = in.getNextEntry()) != null){
             int c;
             while((c=in.read())!=-1){
                 System.out.write(c);
             }
         }
         in.closeEntry();
         in.close();
    }
    
    public static void main(String[] args) throws IOException{
        ZipFileDeal();
        UzipFileDeal();
    }
}
