package com.duan.sdemo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HelloWorldEvent {

	static final int WIDTH=600;
	static final int HEIGHT=400;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame jf=new JFrame("Mutil Calculation");
		JPanel jp=new JPanel();
		jf.setContentPane(jp);
		jf.setSize(WIDTH, HEIGHT);
		//jp.setLayout(new BorderLayout());
		
		
		JTextField jt1=new JTextField(5);
		JTextField jt2=new JTextField(5);
		JLabel jl=new JLabel("*");
		JButton jb=new JButton("=");
		JTextField jt=new JTextField(10);
		
		jp.add(jt1);
		jp.add(jl);
		jp.add(jt2);
		jp.add(jb);
		jp.add(jt);
		//jp.setVisible(true);
		jf.setVisible(true);
		
		jb.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				double d1=Double.valueOf(jt1.getText());
				double d2=Double.valueOf(jt2.getText());
				Double d=d1*d2;
				jt.setText(d.toString());
			}
		});
		
	}

}
