import javax.swing.JFrame;

public class modifiedFarenheit {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame ("Fahrenheit");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		modifiedFarenheitPanel panel = new modifiedFarenheitPanel();
		frame.getContentPane().add(panel);
		
		frame.pack();
		frame.setVisible(true);
	}

}
