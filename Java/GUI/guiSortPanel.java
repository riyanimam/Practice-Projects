import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.*;

public class guiSortPanel extends JPanel {
	
	private JTextField num1, num2, num3, num4, num5;
    private JTextPane content;
    private JButton send;
    private JLabel label;
    
    public guiSortPanel() {

    	num1 = new JTextField(30);
    	num2 = new JTextField(30);
    	num3 = new JTextField(30);
    	num4 = new JTextField(30);
    	num5 = new JTextField(30);

    	label = new JLabel();

    	add(createComponentWithLabel("Number 1", num1));
    	add(createComponentWithLabel("Number 2", num2));
    	add(createComponentWithLabel("Number 3", num3));
    	add(createComponentWithLabel("Number 4", num4));
    	add(createComponentWithLabel("Number 5", num5));
    	add(label);

        setBackground(Color.cyan);
        send = new JButton("Send");
        send.addActionListener(new sendListener());
        add(send);
    }

    private JPanel createComponentWithLabel(String label, Component comp) {
        JPanel p = new JPanel();
        p.setLayout(new BorderLayout());
        p.add(new JLabel(label, JLabel.RIGHT), BorderLayout.WEST);
        p.add(comp, BorderLayout.CENTER);
        return p;
    }

    private class sendListener implements ActionListener {

        public void actionPerformed(ActionEvent event) {
        	
        	int[] c = {Integer.parseInt(num1.getText()), Integer.parseInt(num2.getText()), 
        			Integer.parseInt(num3.getText()), Integer.parseInt(num4.getText()), Integer.parseInt(num5.getText())};
        	
        	int temp;
            for (int i = 1; i < c.length; i++) {
                for(int j = i ; j > 0 ; j--){
                    if(c[j] < c[j-1]){
                        temp = c[j];
                        c[j] = c[j-1];
                        c[j-1] = temp;
                    }
                }
            }
            label.setText("Here is the sorted version: " + Arrays.toString(c));
        }
    }
}
