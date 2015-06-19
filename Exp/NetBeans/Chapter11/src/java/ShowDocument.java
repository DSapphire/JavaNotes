import java.net.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.AppletContext;
import javax.swing.*;
import javax.swing.event.*;
public class ShowDocument extends JApplet {
	public void init() {
	    JButton goButton = new JButton("Link to www.sohu.com");
	    Container myContainer = getContentPane();
	    myContainer.add( new JLabel("Link to SOHU"),BorderLayout.NORTH);
	    myContainer.add(goButton,BorderLayout.SOUTH);
	    goButton.addActionListener(new ButtonListener());
        }
        class ButtonListener implements ActionListener {
	    public void actionPerformed(ActionEvent e) {
	        try {
	            URL newDocument = new URL("http://www.sohu.com");
		   AppletContext browser = getAppletContext();
	            browser.showDocument(newDocument);
	       }
	       catch(Exception URLException) {}
	    }
	}
}
