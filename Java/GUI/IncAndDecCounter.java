import javax.swing.JFrame;

public class IncAndDecCounter {
	
	public static void main(String[] args) {
		
		JFrame frame1 = new JFrame("Increment Or Decrement!");
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		IncAndDecCounterPanel panel1 = new IncAndDecCounterPanel();
		frame1.getContentPane().add(panel1);
		
		frame1.pack();
		frame1.setVisible(true);
	}
	
}
