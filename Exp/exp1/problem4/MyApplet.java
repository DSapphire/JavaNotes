import java.awt.Graphics;
import java.applet.Applet;
//import javax.swing.JApplet;
public class MyApplet extends Applet {
    public String s;
    public void init() {
        s=new String("Helloc World!");
    }
    public void paint(Graphics g){
        g.drawString(s,25,25);
    }
}
