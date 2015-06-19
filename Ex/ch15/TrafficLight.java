import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class TrafficLight extends JFrame implements ActionListener{
	private JRadioButton jrbRed, jrbGreen, jrbYellow;
	private LightsPanel lp;
	public TrafficLight(){
		jrbRed = new JRadioButton("Red");
		jrbYellow = new JRadioButton("Yellow");
		jrbGreen = new JRadioButton("Green");
		setTitle("TrafficLight Demo");
	}
	public void TLView(){
		JPanel maimPanel=new JPanel(new BorderLayout());
		JPanel jpRadioButtons = new JPanel();
		jpRadioButtons.setLayout(new GridLayout(1, 3));
		jpRadioButtons.add(jrbRed);
		jpRadioButtons.add(jrbYellow);
		jpRadioButtons.add(jrbGreen);

		jrbRed.addActionListener(this);
		jrbYellow.addActionListener(this);
		jrbGreen.addActionListener(this);

		maimPanel.add(jpRadioButtons, BorderLayout.SOUTH);
		ButtonGroup group = new ButtonGroup();
		group.add(jrbRed);
		group.add(jrbGreen);
		group.add(jrbYellow);
		
		lp=new LightsPanel();
		lp.setPreferredSize(new Dimension(300,200));
		maimPanel.add(lp,BorderLayout.CENTER);

		setContentPane(maimPanel);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,300);
		setResizable(false);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e) {
		Object o=e.getSource();
		if(o==jrbRed||o==jrbYellow||o==jrbGreen){
			lp.repaint();
		}
	}
	private class LightsPanel extends JPanel{
		protected void paintComponent(Graphics g)
		{
			super.paintComponent(g);
			g.drawLine(120,10,120,180);
			g.drawLine(120,10,180,10);
			g.drawLine(180,10,180,180);
			drawLights(g);
		}
		private void drawLights(Graphics g){
			g.drawOval(130,20,40,40);
			g.drawOval(130,70,40,40);
			g.drawOval(130,120,40,40);
			if(jrbRed!=null){
				boolean select=jrbRed.isSelected();
				if(select){
					g.setColor(Color.RED);
					g.fillOval(130,20,40,40);
				}
			}
			if(jrbYellow!=null){
				boolean select=jrbYellow.isSelected();
				if(select){
					g.setColor(Color.YELLOW);
					g.fillOval(130,70,40,40);
				}
			}
			if(jrbGreen!=null){
				boolean select=jrbGreen.isSelected();
				if(select){
					g.setColor(Color.GREEN);
					g.fillOval(130,120,40,40);
				}
			}
		}
	}
	public static void main(String[] args) {
		TrafficLight tl=new TrafficLight();
		tl.TLView();
	}
}