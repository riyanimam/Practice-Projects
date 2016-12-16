import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class IncAndDecCounterPanel extends JPanel {
	
	private int counter;
	private JButton inc;
	private JButton dec;
	private JLabel labeler;
	private JPanel buttonPanel;
	private JPanel displayPanel;
	
	public IncAndDecCounterPanel() {
		
		inc = new JButton ("Increment");
        dec = new JButton ("Decrement");
        inc.addActionListener (new incListener());
        dec.addActionListener (new decListener());

        counter = 50;
        labeler = new JLabel ("" + counter);

        buttonPanel = new JPanel();
        displayPanel = new JPanel();

        buttonPanel.add(inc);
        buttonPanel.add(dec);
        displayPanel.add(labeler);

        setLayout(new BorderLayout());
        add(buttonPanel, BorderLayout.CENTER);
        add(displayPanel, BorderLayout.NORTH);
	}
	
	private class incListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            counter++;
            labeler.setText("" + counter);
        }
    }

    private class decListener implements ActionListener {
        public void actionPerformed (ActionEvent event) {
            counter--;
            labeler.setText("" + counter);
        }
    }
}
