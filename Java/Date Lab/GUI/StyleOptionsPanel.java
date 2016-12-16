import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;

public class StyleOptionsPanel extends JPanel {
	
	private JLabel saying;
	private JCheckBox bold, italic;
	private JSlider fontSize;
	
	public StyleOptionsPanel(){
		
		saying = new JLabel("Say it with style!");
		saying.setFont(new Font("Helvetica", Font.PLAIN, 36));
		
		fontSize = new JSlider(JSlider.HORIZONTAL, 0, 72, 0);
		fontSize.setMajorTickSpacing(16);
		fontSize.setMinorTickSpacing(4);
		fontSize.setPaintTicks(true);
		fontSize.setPaintLabels(true);
		fontSize.setAlignmentX(Component.LEFT_ALIGNMENT);
		
		bold = new JCheckBox("Bold");
		bold.setBackground(Color.cyan);
		italic = new JCheckBox("Italic");
		italic.setBackground(Color.cyan);
		
		StyleListener listener = new StyleListener();
		bold.addItemListener(listener);
		italic.addItemListener(listener);
		SliderListener listening = new SliderListener();
		fontSize.addChangeListener(listening);
		
		add(saying);
		add(bold);
		add(italic);
		add(fontSize);
		
		setBackground(Color.cyan);
		setPreferredSize(new Dimension(300, 100));
	}

	private class StyleListener implements ItemListener {
		
		public void itemStateChanged(ItemEvent event) {
			
			int style = Font.PLAIN;
			
			if (bold.isSelected())
				style = Font.BOLD;
			
			if (italic.isSelected())
				style += Font.ITALIC;
			
			saying.setFont(new Font("Helvetica", style, 36));
			
		}
	}
	
	private class SliderListener implements ChangeListener {
			
			public void stateChanged(ChangeEvent event) {
				
				int size = fontSize.getValue();
				
				saying.setFont(new Font("Helvetica", Font.PLAIN, size));
				
			}
				
		}
	}