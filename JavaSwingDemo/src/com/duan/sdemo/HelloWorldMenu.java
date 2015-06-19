package com.duan.sdemo;

import javax.swing.*;
import java.awt.*;

public class HelloWorldMenu {
	private static final long serialVersionUID=1L;
	static final int WIDTH=600;
	static final int HEIGHT=400;
	JPopupMenu pop;//???
	JFrame jf;
	JPanel jp;
	JToolBar bar;
	
	public HelloWorldMenu(){
		jf=new JFrame("My Test!");
		JMenuBar menubar1=new JMenuBar();
		jp=new JPanel();
		
		jf.setContentPane(jp);
		jf.setJMenuBar(menubar1);
		
		JMenu menu1=new JMenu("Menu 1");
		JMenu menu2=new JMenu("Menu 2");
		JMenu menu3=new JMenu("Menu 3");
		JMenu menu4=new JMenu("Menu 4");
		JMenu menu5=new JMenu("Menu 5");
		
		menubar1.add(menu1);
		menubar1.add(menu2);
		menubar1.add(menu3);
		menubar1.add(menu4);
		menubar1.add(menu5);
		
		JMenuItem item1=new JMenuItem("Child Menu 1");
		JMenuItem item2=new JMenuItem("Child Menu 2");
		JMenuItem item3=new JMenuItem("Child Menu 3");
		JMenuItem item4=new JMenuItem("Child Menu 4");
		JMenuItem item5=new JMenuItem("Child Menu 5");
		JMenuItem item6=new JMenuItem("Child Menu 6");
		JMenuItem item7=new JMenuItem("Child Menu 7");
		JMenuItem item8=new JMenuItem("Child Menu 8");
		JMenuItem item9=new JMenuItem("Child Menu 9");
		JMenuItem item10=new JMenuItem("Child Menu 10");
		JMenuItem item11=new JMenuItem("Child Menu 11");
		JMenuItem item12=new JMenuItem("Child Menu 12");
		
		menu1.add(item1);
		menu1.addSeparator();
		menu1.add(item2);
		menu1.addSeparator();
		menu1.add(item3);
		menu1.addSeparator();
		menu2.add(item4);
		menu2.addSeparator();
		menu2.add(item5);
		menu2.addSeparator();
		menu3.add(item6);
		menu3.addSeparator();
		menu3.add(item7);
		menu3.addSeparator();
		menu4.add(item8);
		menu4.addSeparator();
		menu4.add(item9);
		menu4.addSeparator();
		menu5.add(item10);
		menu5.addSeparator();
		menu5.add(item11);
		menu5.addSeparator();
		menu5.add(item12);
		
		JButton button1=new JButton("Button 1");
		JButton button2=new JButton("Button 2");
		JButton button3=new JButton("Button 3");
		bar=new JToolBar();
		bar.add(button1);
		bar.add(button2);
		bar.add(button3);
		
		BorderLayout bord=new BorderLayout();
		jp.setLayout(bord);
		jp.add("North",bar);
		jf.setVisible(true);
		jf.setSize(WIDTH, HEIGHT);
		Toolkit kit=Toolkit.getDefaultToolkit();
		Dimension screenSize=kit.getScreenSize();
		int width=screenSize.width;
		int height=screenSize.height;
		int x=(width-WIDTH)/2;
		int y=(height-HEIGHT)/2;
		jf.setLocation(x, y);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new HelloWorldMenu();
	}

}
