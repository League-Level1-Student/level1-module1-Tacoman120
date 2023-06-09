package _11_binary_converter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BinaryConverter implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel1 = new JPanel();
	JPanel panel = new JPanel();
	JTextField answer = new JTextField(20);
	JButton button = new JButton();
public void run() {
	button.addActionListener(this);
	frame.add(panel);
	frame.add(panel1);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	panel.add(answer);
	frame.setVisible(true);
	button.setText("convert");
	panel1.add(button);
	frame.pack();
	
}
@Override
public void actionPerformed(ActionEvent arg0) {
	// TODO Auto-generated method stub
	
}
}
