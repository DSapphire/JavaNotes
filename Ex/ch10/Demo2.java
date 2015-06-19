import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.Font;
import java.awt.Color;

public class Demo2{

	public Demo2(){

	}
	public void demo2Paint(){
		JFrame jf=new JFrame();
		JPanel jp=new JPanel(new GridLayout(2,3));
		Font font = new Font("TimesRoman", Font.BOLD, 20);//"TimesNewRoman"
		JLabel[] button;
		button=new JLabel[6];
		for(int i=0;i<6;i++){
			button[i]=new JLabel();
			button[i].setBackground(Color.WHITE);
			button[i].setFont(font);
			button[i].setHorizontalAlignment(JLabel.CENTER);
			jp.add(button[i]);
		}
		button[0].setForeground(Color.BLACK);
		button[0].setText("BLACK");
		button[0].setToolTipText("BLACK");

		button[1].setForeground(Color.BLUE);
		button[1].setText("BLUE");
		button[1].setToolTipText("BLUE");

		button[2].setForeground(Color.CYAN);
		button[2].setText("CYAN");
		button[2].setToolTipText("CYAN");

		button[3].setForeground(Color.GREEN);
		button[3].setText("GREEN");
		button[3].setToolTipText("GREEN");

		button[4].setForeground(Color.MAGENTA);
		button[4].setText("MAGENTA");
		button[4].setToolTipText("MAGENTA");

		button[5].setForeground(Color.ORANGE);
		button[5].setText("ORANGE");
		button[5].setToolTipText("ORANGE");

		jf.setSize(400,200);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setContentPane(jp);
		jf.setVisible(true);
		jf.setLocationRelativeTo(null);
	}
	public static void main(String[] args) {
		Demo2 demo=new Demo2();
		demo.demo2Paint();
	}
}