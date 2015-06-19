import java.awt.Font;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Demo2 extends JFrame{
	public Demo2(){

	}
	public void drawDemo(){
		setSize(300,200);
		JPanel mainPanel=new JPanel(new GridLayout(3,2));
		setContentPane(mainPanel);
		
		mainPanel.add(new JPanel());
		mainPanel.add(new MessagePanel("HTML",Color.CYAN));
		mainPanel.add(new MessagePanel("Java",null));
		mainPanel.add(new MessagePanel("Tomcat",null));
		mainPanel.add(new JPanel());
		mainPanel.add(new MessagePanel("PHP",Color.GREEN));

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setLocationRelativeTo(null);
	}
	public static void main(String[] args) {
		Demo2 demo=new Demo2();
		demo.drawDemo();
	}
}
// class MessagePanel extends JPanel{
// 	private String messageToDraw;
// 	private Color messageColor;
// 	public MessagePanel(String str,Color color) {
// 		this.messageColor=color;
// 		this.messageToDraw=str;
// 	}
// 	@Override
// 	protected void paintComponent(Graphics g){
// 		if(messageColor!=null){
// 			g.setColor(messageColor);
// 			g.fillRect(0, 0, getWidth(), getHeight());
// 		}
// 		g.setColor(Color.BLACK);
// 		g.setFont(new Font(Font.SERIF, Font.BOLD, 20));
// 		g.drawString(messageToDraw,getWidth()/3, getHeight()/2);
// 	}
// }