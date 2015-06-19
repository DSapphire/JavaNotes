package com.duan.labelandbutton;
import javax.swing.*;

import java.awt.*;
public class CheckBoxTest {
	static final int WIDTH=600;
	static final int HEIGHT=400;
	
	public static void main(String[] args) {
		JFrame jf=new JFrame("Test Button");
		jf.setSize(WIDTH, HEIGHT);
		
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel jp=new JPanel();
		jf.setContentPane(jp);
		
		JCheckBox jc1=new JCheckBox("Basketball");
		JCheckBox jc2=new JCheckBox("Football");
		JCheckBox jc3=new JCheckBox("Tennis");
		JCheckBox jc4=new JCheckBox("Book");
		jp.add(jc1);
		jp.add(jc2);
		jp.add(jc3);
		jp.add(jc4);
		jf.setVisible(true);
	}

}
