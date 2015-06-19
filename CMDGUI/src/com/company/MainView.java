package com.company;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class MainView extends JFrame implements ActionListener{
	private JTextField text;
	private JButton button;
	private JPanel jp;
	public MainView(){
		super("CMDGUI MainView");
	}
	public void view(){
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(400,200);
		jp=new JPanel();
		jp.setLayout(new BoxLayout(jp, BoxLayout.Y_AXIS));
		JLabel label=new JLabel("Enter a runnable file name or command here.");
		label.setPreferredSize(new Dimension(150,60));
		text=new JTextField();
		text.setPreferredSize(new Dimension(100,20));
		button=new JButton("execute");
		button.addActionListener(this);
		button.setPreferredSize(new Dimension(100,40));
		jp.add(label);
		jp.add(text);
		jp.add(button);
		setContentPane(jp);
		setVisible(true);
		setLocationRelativeTo(null);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		Object o=e.getSource();
		if(o==button){
			String command=text.getText();
			if (command!=null){
				CMDUtil cmd=new CMDUtil(command);
				cmd.executeCMD();
			}
		}
	}
}
