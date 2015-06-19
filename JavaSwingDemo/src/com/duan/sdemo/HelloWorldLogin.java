package com.duan.sdemo;
//登陆界面
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class HelloWorldLogin extends JPanel{
	
	static final int WIDTH=300;
	static final int HEIGHT=150;
	
	JFrame loginFrame;
	// x y 控件位于第几列第几行
	// w h 控件的大小占用几列几行
	public void add(Component c,GridBagConstraints cons,int x,int y,
			int w,int h){
		cons.gridx=x;
		cons.gridy=y;
		cons.gridheight=h;
		cons.gridwidth=w;
		add(c,cons);
	}
	HelloWorldLogin(){
		loginFrame=new JFrame("Welcome!");//窗体标题
		loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout lay=new GridBagLayout();
		setLayout(lay);
		loginFrame.add(this,BorderLayout.WEST);
		loginFrame.setSize(WIDTH,HEIGHT);
		
		Toolkit kit=Toolkit.getDefaultToolkit();
		Dimension screenSize=kit.getScreenSize();
		int width=screenSize.width;
		int height=screenSize.height;
		int x=(width-WIDTH)/2;
		int y=(height-HEIGHT)/2;
		loginFrame.setLocation(x, y);
		
		JButton ok=new JButton("Login ");
		JButton cancel=new JButton("Cancel ");
		JLabel title=new JLabel("Welcom to Java！");
		JLabel name=new JLabel("UserName ");
		JLabel password=new JLabel("Password ");
		final JTextField nameInput=new JTextField(15);
		final JTextField passwordInput=new JTextField(15);
		
		GridBagConstraints cons=new GridBagConstraints();
		cons.fill=GridBagConstraints.NONE;//
		cons.anchor=GridBagConstraints.EAST;//
		cons.weightx=3;
		cons.weighty=4;
		add(title,cons,0,0,2,1);
		add(name,cons,0,1,1,1);
		add(password,cons,0,2,1,1);
		add(nameInput,cons,1,1,1,1);
		add(passwordInput,cons,1,2,1,1);
		add(ok,cons,0,3,1,1);
		add(cancel,cons,1,3,1,1);
		loginFrame.setResizable(false);
		loginFrame.setVisible(true);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HelloWorldLogin hello=new HelloWorldLogin();
	}

}
