import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class RGBScrolBar extends JFrame implements AdjustmentListener{
	private JScrollBar jscR,jscG,jscB;
	private JLabel message;
	public RGBScrolBar(){
		jscR=new JScrollBar(JScrollBar.HORIZONTAL,200,1,0,255);
		jscG=new JScrollBar(JScrollBar.HORIZONTAL,200,1,0,255);
		jscB=new JScrollBar(JScrollBar.HORIZONTAL,0,1,0,255);
		jscR.setPreferredSize(new Dimension(320,20));
		jscG.setPreferredSize(new Dimension(320,20));
		jscB.setPreferredSize(new Dimension(320,20));
		jscR.addAdjustmentListener(this);
		jscG.addAdjustmentListener(this);
		jscB.addAdjustmentListener(this);
		message=new JLabel("show color");
		message.setFont(new Font(Font.SERIF, Font.PLAIN,50));
		message.setOpaque(true);
		message.setHorizontalAlignment(JLabel.CENTER);
		
		int r=jscR.getValue();
		int g=jscG.getValue();
		int b=jscB.getValue();
		message.setForeground(new Color(r,g,b));
	}
	public void rgbView(){
		JPanel maimPanel=new JPanel(new GridLayout(2,1));

		JPanel jscP=new JPanel(new GridLayout(3,1));
		JPanel jscRP=new JPanel();
		jscRP.add(new JLabel("Red  "));
		jscRP.add(jscR);
		JPanel jscGP=new JPanel();
		jscGP.add(new JLabel("Green"));
		jscGP.add(jscG);
		JPanel jscBP=new JPanel();
		jscBP.add(new JLabel("Blue "));
		jscBP.add(jscB);
		jscP.add(jscRP);
		jscP.add(jscGP);
		jscP.add(jscBP);
		jscP.setBorder(BorderFactory.createTitledBorder("Choose colors"));
		maimPanel.add(message);
		maimPanel.add(jscP);

		setContentPane(maimPanel);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400,300);
		setResizable(false);
		setVisible(true);
	}
	public void adjustmentValueChanged(AdjustmentEvent e){
		int r=jscR.getValue();
		int g=jscG.getValue();
		int b=jscB.getValue();
		message.setForeground(new Color(r,g,b));
	}
	public static void main(String[] args) {
		RGBScrolBar sc=new RGBScrolBar();
		sc.rgbView();
	}
}