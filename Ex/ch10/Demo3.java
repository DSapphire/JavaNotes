import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.Color;


public class Demo3{

	public Demo3(){

	}
	public void demo3Paint(){
		JFrame jf=new JFrame();
		JPanel jp=new JPanel(new GridLayout(8,8));

		int temp=0;
		JButton[][] button;
		button=new JButton[8][8];
		for(int i=0;i<8;i++){
			for(int j=0;j<8;j++){
				button[i][j]=new JButton();
				temp=(i+j)%2;
				if(temp==0)
					button[i][j].setBackground(Color.BLACK);
				else
					button[i][j].setBackground(Color.WHITE);
				jp.add(button[i][j]);
			}
		}


		jf.setSize(600,600);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setContentPane(jp);
		jf.setVisible(true);
		jf.setLocationRelativeTo(null);
	}
	public static void main(String[] args) {
		Demo3 demo=new Demo3();
		demo.demo3Paint();
	}
}