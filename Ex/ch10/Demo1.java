import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.FlowLayout;
public class Demo1{

	public Demo1(){

	}
	public void demo1Paint(){
		JFrame jf=new JFrame();
		JPanel jp1,jp2;
		jp1=new JPanel(new FlowLayout());
		jp2=new JPanel(new FlowLayout());
		JButton[] button;
		button=new JButton[6];
		for(int i=0;i<6;i++){
			button[i]=new JButton("Button"+(i+1));
		}
		jp1.add(button[0]);
		jp1.add(button[1]);
		jp1.add(button[2]);
		jp2.add(button[3]);
		jp2.add(button[4]);
		jp2.add(button[5]);

		jf.setSize(400,200);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.getContentPane().setLayout(new FlowLayout());
		jf.getContentPane().add(jp1);
		jf.getContentPane().add(jp2);
		jf.setVisible(true);
		jf.setLocationRelativeTo(null);

	}
	public static void main(String[] args) {
		Demo1 demo=new Demo1();
		demo.demo1Paint();
	}
}