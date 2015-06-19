package com.imooc.io;

import java.io.IOException;

public class IOUtilTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			IOUtil.printHexByByteArray("F:\\Java\\FileIO.txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
