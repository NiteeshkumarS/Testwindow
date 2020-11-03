import javax.swing.JFrame;

public class Window {
	
	public  Window() {
		JFrame jf=new JFrame("test window");
		jf.setLayout(null);
		jf.setSize(600,600);
		jf.setLocation(300,100);
		
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}



   public static void main(String ar[]) {
	   
	   new Window();
	   
   }


}
