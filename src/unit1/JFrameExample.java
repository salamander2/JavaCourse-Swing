 /**
 * D. Schryvers
 * Swing Examples
 * */

package unit1;
import java.awt.Color;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.*;

public class JFrameExample implements FocusListener {
	public static void main(String[] args) {
		new JFrameExample();
	}
	
	JFrame window = new JFrame("Darren's Example GUI #001");
	JPanel panel = new JPanel();
	
	JFrameExample() {
		
		window.setSize(600, 500);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setResizable(false);
		window.setLocationRelativeTo(null);
		
		JLabel label1 = new JLabel("Option");
		label1.setBackground(Color.RED);
		label1.setOpaque(true);
		
		JButton btn1 = new JButton("Button 1");
		
		
		panel.setBackground(Color.WHITE);
		panel.add(label1);
		panel.add(btn1);
		panel.add(new JButton("hey"));
		btn1.addFocusListener(this);
		window.add(panel);
		
		//window.pack(); 
		//window.validate();
		window.setVisible(true);
	}

	@Override
	public void focusGained(FocusEvent e) {
		panel.setBackground(Color.YELLOW);
		
	}

	@Override
	public void focusLost(FocusEvent e) {
		panel.setBackground(Color.PINK);
		
	}
}