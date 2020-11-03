import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Window {
	
	public  Window() {
		JFrame jf=new JFrame("test window");
		jf.setLayout(null);
		jf.setSize(600,600);
		jf.setLocation(300,100);
		
		JLabel displayLabel=new JLabel("hello");
		displayLabel.setBounds(0,0,600,600);
		displayLabel.setBackground(Color.red);
		displayLabel.setOpaque(true);
		jf.add(displayLabel);
		
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}



   public static void main(String ar[]) {
	   
	   new Window();
	   
   }


}