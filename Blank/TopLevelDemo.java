import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TopLevelDemo{
	private static void createAndShowGUI(){
		JFrame frame=new JFrame("TopLevelDemo");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JMenuBar greenMenuBar=new JMenuBar();
		greenMenuBar.setOpaque(true);
		greenMenuBar.setBackground(new Color(0,165,107));
		greenMenuBar.setPreferredSize(new Dimension(500,20));

		JLabel yellowLabel=new JLabel("yellowLabel");
		yellowLabel.setOpaque(true);
		yellowLabel.setBackground(new Color(248,210,101));
		yellowLabel.setPreferredSize(new Dimension(400,180));

		frame.setJMenuBar(greenMenuBar);
		frame.getContentPane().add(yellowLabel,BorderLayout.CENTER);
		frame.pack();
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable(){
			public void run(){
				createAndShowGUI();
			}
		});
	}
}