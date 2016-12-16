import javax.swing.JFrame;

public class guiSort {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Enter and Sort!");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		guiSortPanel panel = new guiSortPanel();
		frame.getContentPane().add(panel);
		
		frame.pack();
		frame.setVisible(true);
	}
}
