import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class modifiedFarenheitPanel extends JPanel {

	private JLabel inputLabel, outputLabel, resultLabel;
	private JTextField fahrenheit;
	private JButton manualTemp;
	
	public modifiedFarenheitPanel() {
		
		inputLabel = new JLabel("Enter Fahrenheit temperature:");
		outputLabel = new JLabel("Temperature in Celsius: ");
		resultLabel = new JLabel("---");
		manualTemp = new JButton("Click To Convert!");
		
		fahrenheit = new JTextField(5);
		fahrenheit.addActionListener(new TempListener());
		manualTemp.addActionListener(new manualListener());
	    
		add(inputLabel);
		add(fahrenheit);
		add(outputLabel);
		add(resultLabel);
		add(manualTemp);
		
		setPreferredSize(new Dimension(300, 75));
		setBackground(Color.yellow);
	}
	
	private class TempListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			
			int fahrenheitTemp, celsiusTemp;
			
			String text = fahrenheit.getText();
			
			fahrenheitTemp = Integer.parseInt(text);
			
			celsiusTemp = (fahrenheitTemp - 32) * 5/9;
			
			resultLabel.setText(Integer.toString(celsiusTemp));
		}
	}
	
	private class manualListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
				
			int fahrenheitTemp, celsiusTemp;
				
			String text = fahrenheit.getText();
				
			fahrenheitTemp = Integer.parseInt(text);
				
			celsiusTemp = (fahrenheitTemp - 32) * 5/9;
				
			resultLabel.setText(Integer.toString(celsiusTemp));
		}
	}
}
