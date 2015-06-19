package com.company;
import java.io.IOException;
public class CMDUtil {
	private String command;
	public CMDUtil(String command){
		this.command=command;
	}
	public void executeCMD(){
		new MyExecute(command).start();
	}
	class MyExecute extends Thread{
		String command;
		private Process pro=null;
		public MyExecute(String command){
			this.command=command;
		}
		public void run(){
			try{
				pro=Runtime.getRuntime().exec("cmd /k start cmd.exe /k "+command);
			}catch(IOException e){
				System.out.println("Fail to execute the command "+command);
				e.printStackTrace();
			}
		}
	}
}
