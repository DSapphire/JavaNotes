/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem6;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author Duan
 */
public class EncodeTransfer {
    
    public static void GbkToUtf8(String src,String des) throws IOException{
        byte[] buf=new byte[128];
        int c;
        String lineIn,lineOut;
        BufferedInputStream in = new BufferedInputStream(
                        new FileInputStream(src) );
        BufferedOutputStream out = new BufferedOutputStream( 
                        new  FileOutputStream(des) );
        
        while((c=in.read(buf,0,buf.length))!=-1){
            lineIn=new String(buf,0,c,"gbk");
            System.out.println(lineIn);
            lineOut=new String(lineIn.getBytes("utf-8"),0,lineIn.getBytes("utf-8").length,"utf-8");
            System.out.println(lineOut);
            out.write(lineIn.getBytes("utf-8"),0,lineIn.getBytes("utf-8").length);
            out.flush();
        }
        in.close();
        out.close();
    }
    
    public static void Utf8ToGbk(String src,String des) throws IOException{
        byte[] buf=new byte[128];
        int c;
        String lineIn,lineOut;
        BufferedInputStream in = new BufferedInputStream(
                        new FileInputStream(src) );
        BufferedOutputStream out = new BufferedOutputStream( 
                        new  FileOutputStream(des) );
        
        while((c=in.read(buf,0,buf.length))!=-1){
            lineIn=new String(buf,0,c,"utf-8");
            System.out.println(lineIn);
            lineOut=new String(lineIn.getBytes("gbk"),0,lineIn.getBytes("gbk").length,"gbk");
            System.out.println(lineOut);
            out.write(lineIn.getBytes("gbk"),0,lineIn.getBytes("gbk").length);
            out.flush();
        }
        in.close();
        out.close();
    }
    
    
    public static void main(String[] args) throws IOException{
        String src="EncodeTransfergbk.txt";
        String des="EncodeTransferutif8.txt";
        GbkToUtf8(src,des);
        String src1="EncodeTransfergbk1.txt";
        Utf8ToGbk(des,src1);
    }
}
