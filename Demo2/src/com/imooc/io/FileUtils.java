package com.imooc.io;

import java.io.File;
import java.io.IOException;

public class FileUtils {
	
	public static void listDirectory(File dir) throws IOException{
		if(!dir.exists()||!dir.isDirectory()){
			throw new IllegalArgumentException("Ŀ¼�����ڣ�");
		}
//		String[] filenames=dir.list();
//		for(String s:filenames){
//			//System.out.println(s);
//			System.out.println(dir+"\\"+s);
//		}
		
		File[] files=dir.listFiles();
		if(files!=null&&files.length>0){
			for(File file:files){
				if(file.isDirectory()){
					listDirectory(file);
				}else{
					System.out.println(file);
				}
				
			}
		}
	}

}
