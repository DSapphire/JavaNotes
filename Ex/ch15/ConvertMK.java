import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class ConvertMK extends JFrame implements KeyListener{
	private final double rate=1.609344;
	private JTextField mile,kilo;
	public ConvertMK(){
		setTitle("Convert Demo");
		mile=new JTextField(15);
		kilo=new JTextField(15);
	}
	public void MKView(){
		JPanel mainP=new JPanel(new GridLayout(2,1));
		JPanel mileP=new JPanel();
		mileP.add(new JLabel("Mile      "));
		mileP.add(mile);
		JPanel kiloP=new JPanel();
		kiloP.add(new JLabel("Kilometer "));
		kiloP.add(kilo);
		mainP.add(mileP);
		mainP.add(kiloP);

		mile.addKeyListener(this);
		kilo.addKeyListener(this);
		setContentPane(mainP);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400,100);
		setResizable(false);
		setVisible(true);
	}
	@Override
	public void keyTyped(KeyEvent e) {
		int keyChar = e.getKeyChar(); 
		if(keyChar >= KeyEvent.VK_0 && keyChar <= KeyEvent.VK_9){

		}else{
			e.consume();
		}
	}
	@Override
	public void keyPressed(KeyEvent e) {
	}
	@Override
	public void keyReleased(KeyEvent e) {
		convert();
	}
	private void convert(){
		double m=0;
		double k=0;
		try{
			m=Double.parseDouble(mile.getText());
			k=Double.parseDouble(kilo.getText());
		}catch (NumberFormatException e1){
			//JOptionPane.showMessageDialog(this,"Please enter number!");
		}
		boolean is=mile.isFocusOwner();
		if(is){
			k=m*rate;
			kilo.setText(k+"");
		}else{
			m=k/rate;
			mile.setText(m+"");
		}
	}
	public static void main(String[] args) {
		ConvertMK cmk=new ConvertMK();
		cmk.MKView();
	}
}