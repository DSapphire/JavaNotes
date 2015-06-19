import javax.swing.*;
import java.awt.*;

public class HelloSwingApplet extends JApplet {
    public void init() {
      JLabel label = new JLabel("You are successfully running a Swing applet!");
      label.setHorizontalAlignment(JLabel.CENTER);
      label.setBorder(BorderFactory.createMatteBorder(1,1,2,2,Color.black));
      getContentPane().add(label, BorderLayout.CENTER);
    }
}
