package com.duan.sdemo;

import javax.swing.*;

import java.awt.*;

public class HelloWorldJTabbedPane extends JTabbedPane{
	private static final long serialVersionUID=1L;
	static final int WIDTH=600;
	static final int HEIGHT=400;
	
	public HelloWorldJTabbedPane(){
		JFrame jf=new JFrame("My Test!");
		JPanel jp=new JPanel();
		jf.setContentPane(jp);
		jf.setVisible(true);
		jf.setSize(WIDTH, HEIGHT);
		setLayout(new BorderLayout());
		
		JPanel panel1=new JPanel();
		JPanel panel2=new JPanel();
		JPanel panel3=new JPanel();
		JPanel panel4=new JPanel();
		JPanel panel5=new JPanel();
		panel1.setLayout(new BorderLayout());
		addTab("Panle 1",panel1);
		setEnabledAt(0, true);
		setTitleAt(0,"Test Panel 1");
		addTab("Panle 2",panel2);
		setEnabledAt(1, true);
		setTitleAt(1,"Test Panel 2");
		addTab("Panle 3",panel3);
		setEnabledAt(2, true);
		setTitleAt(2,"Test Panel 3");
		addTab("Panle 4",panel4);
		setEnabledAt(3, true);
		setTitleAt(3,"Test Panel 4");
		addTab("Panle 5",panel5);
		setEnabledAt(4, true);
		setTitleAt(4,"Test Panel 6");
		
		setPreferredSize(new Dimension(500,200));
		setTabPlacement(JTabbedPane.TOP);
		setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
		jp.add("Center",this);
		
		jf.pack();///
		setVisible(true);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new HelloWorldJTabbedPane();
	}

}
