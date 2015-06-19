package com.duan.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOUtil {
    public static boolean copy(String src,String des)throws IOException {
        if(!isFile(src)){
            throw new IllegalArgumentException("源文件不存在！");
        }
        File srcFile=new File(src);
        File desFile=new File(des);
        FileInputStream in=new FileInputStream(srcFile);
        FileOutputStream out=new FileOutputStream(desFile);
        byte[] buf=new byte[8*32];
        int b;
        while((b=in.read(buf,0,buf.length))!=-1){
            out.write(buf,0,b);
            out.flush();//
        }
        in.close();
        out.close();
        return  true;
    }
    public static boolean isFile(String str){
        File file=new File(str);
        if(file.exists()&&file.isFile())
            return true;
        return false;
    }
}
