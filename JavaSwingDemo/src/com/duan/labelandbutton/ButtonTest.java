package com.duan.labelandbutton;
import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class ButtonTest {

	static final int WIDTH=600;
	static final int HEIGHT=400;
	
	public static void main(String[] args) {
		JFrame jf=new JFrame("Test Button");
		jf.setSize(WIDTH, HEIGHT);
		
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel jp=new JPanel();
		jf.setContentPane(jp);
		JRadioButton jr1=new JRadioButton("Ingore");
		JRadioButton jr2=new JRadioButton("Continue");
		JRadioButton jr3=new JRadioButton("Jump");
		
//		ButtonGroup bg=new ButtonGroup();
//		bg.add(jr1);
//		bg.add(jr2);
//		bg.add(jr3);
		
		jp.add(jr1);
		jp.add(jr2);
		jp.add(jr3);
		
		JLabel label=new JLabel("AA");
		jp.add(label);
		jr1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				label.setText("+"+jr1.isSelected());
			}
		});
		jf.setVisible(true);
	}

}
