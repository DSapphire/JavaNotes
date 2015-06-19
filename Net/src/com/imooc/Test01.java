package com.imooc;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class Test01 {

	public static void main(String[] args) {

		try {
			InetAddress address=InetAddress.getLocalHost();
			System.out.println(address.getHostAddress());
			System.out.println(address.getHostName());
			byte[] bytes=address.getAddress();
			System.out.println(Arrays.toString(bytes));
			System.out.println(address);
			
			
			//InetAddress address2=InetAddress.getByName("±ò");
			//InetAddress address2=InetAddress.getByName("192.168.189.1");
			//System.out.println(address2.getHostName());
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}

}
