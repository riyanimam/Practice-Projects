import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class EmailPanel extends JPanel {
    
	private JTextField to, cc, bcc, subject;
    private JTextPane content;
    private JButton send;
    
    public EmailPanel() {

    	to = new JTextField(30);
    	cc = new JTextField(30);
    	bcc = new JTextField(30);
    	subject = new JTextField(30);


    	add(createComponentWithLabel("to", to));
    	add(createComponentWithLabel("cc", cc));
        add(createComponentWithLabel("bcc", bcc));
    	add(createComponentWithLabel("subject", subject));

        setBackground(Color.cyan);
        content = new JTextPane();
        content.setPreferredSize(new Dimension(375, 200));
        send = new JButton("Send");
        send.addActionListener(new sendListener());
        add(content);
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

        public void actionPerformed(ActionEvent evt) {
            System.out.println("To: " + to.getText());
            System.out.println("Cc: " + cc.getText());
            System.out.println("Bcc: " + bcc.getText());
            System.out.println("Subject: " + subject.getText());
            System.out.println("Message content: "+content.getText());
            System.out.println(content.getText());

        }
    }
}
