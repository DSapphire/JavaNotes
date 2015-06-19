// Example for PPT page No.29

import java.awt.*;
import javax.swing.*;

public class Cards extends JFrame
{
	/** Main method */
	public static void main(String[] args)
	{
		Cards frame=new Cards();
		
		frame.setTitle("Cards");
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(600,200);
		frame.setVisible(true);
	}
	
	/** Constructor */
	public Cards()
	{
		Image iamge1=new ImageIcon("card/"+(int)(Math.random()*55)+".png").getImage();
		Image iamge2=new ImageIcon("card/"+(int)(Math.random()*55)+".png").getImage();
		Image iamge3=new ImageIcon("card/"+(int)(Math.random()*55)+".png").getImage();
		Image iamge4=new ImageIcon("card/"+(int)(Math.random()*55)+".png").getImage();
		Image iamge5=new ImageIcon("card/"+(int)(Math.random()*55)+".png").getImage();
		
		setLayout(new GridLayout(1,5,5,5));
		
		add(new ImageViewer(iamge1));
		add(new ImageViewer(iamge2));
		add(new ImageViewer(iamge3));
		add(new ImageViewer(iamge4));
		add(new ImageViewer(iamge5));
	}
}