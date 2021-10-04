package swing2;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Event_example1 extends JFrame {
	public static int backColour = 1;
	JButton myButton;
	JPanel panel = new JPanel();
	public static void main(String args[]) {
		new Event_example1();
	}
	
	Event_example1() {
		JFrame window = new JFrame("Darren's Event Example");
		window.setSize(300, 300);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLocationRelativeTo(null);
		window.setResizable(true);
		panel.setLayout(new FlowLayout());
		panel.setBackground(Color.YELLOW.darker());
		myButton = new JButton("Change Colour");
		panel.add(myButton);
		
		myButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myClick(e);
			}
		});
		
		window.add(panel, BorderLayout.CENTER);
		window.validate();
		window.setVisible(true);
		System.out.println(backColour);
	}
	
	void myClick(ActionEvent e) {
		backColour = backColour + 1;
		if (backColour % 2 == 0) {
			panel.setBackground(Color.RED.darker());
		} else {
			panel.setBackground(Color.YELLOW.darker());
		}
		System.out.println(backColour);
	}
}