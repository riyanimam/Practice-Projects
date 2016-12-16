import javax.swing.JFrame;

public class StyleOptions {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Style It Up!");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		StyleOptionsPanel panel = new StyleOptionsPanel();
		frame.getContentPane().add(panel);
		
		frame.pack();
		frame.setVisible(true);
	}
}
