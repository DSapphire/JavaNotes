import javax.swing.JFrame;
import java.awt.Polygon;
import java.awt.Graphics;
import javax.swing.JPanel;
public class Demo3 extends JFrame{
	public Demo3(){

	}
	public void drawDemo(){
		setSize(400,200);
		setContentPane(new MyPanel());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setLocationRelativeTo(null);
	}
	public static void main(String[] args) {
		Demo3 demo=new Demo3();
		demo.drawDemo();
	}
}
class MyPanel extends JPanel{
	@Override
	protected void paintComponent(Graphics g){
		int width=getWidth();
		int height=getHeight();

		Polygon p=new Polygon();
		for(int i=-100;i<100;i++){
			p.addPoint(width/2+i, height/2-(int)(50*Math.sin(i/100.0*2*Math.PI)));
		}
		g.drawLine(width/10, height/2, width*9/10, height/2);
		g.drawLine(width/2, height/10, width/2, height*9/10);

		g.drawString("X",width*9/10-20, height/2-20);
		g.drawLine(width*9/10-10, height/2-10, width*9/10, height/2);
		g.drawLine(width*9/10-10, height/2+10, width*9/10, height/2);

		g.drawString("Y",width/2+20, height/10+10);
		g.drawLine(width/2-10, height/10+10,width/2, height/10);
		g.drawLine(width/2+10, height/10+10, width/2, height/10);

		g.drawString("0",width/2, height/2+10);
		g.drawString("-2\u03c0",width/2-100, height/2+10);
		g.drawString("2\u03c0",width/2+100, height/2+10);
		g.drawPolyline(p.xpoints, p.ypoints, p.npoints);
	}
}