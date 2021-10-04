package swing2;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class TwoEvents implements ActionListener {

	public static void main(String[] args) {
		new TwoEvents();
	}

	JFrame window;
	JPanel panel;
	boolean toggle = false;
		
	TwoEvents() {
		window = new JFrame("Events");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLocationRelativeTo(null);
		window.setSize(400,400);
		
		panel = new JPanel();
		panel.setBackground(Color.YELLOW);
		JButton btn1 = new JButton("Change colour");
		btn1.addActionListener(this);  //choose option "Let \classname\ implement ActionListener" to get rid of the error
				
		JButton btn2 = new JButton("Do stuff");
		btn2.addActionListener(this); // "this" means that it is in the same class as this method is.
		btn2.setActionCommand("two");
		
		panel.add(btn1);
		panel.add(btn2);
		
		window.add(panel);
		window.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		toggle = !toggle;
		if (toggle) panel.setBackground(Color.GREEN);
		else panel.setBackground(Color.RED);
		
		
		//ActionCommand is handy to identify the source of an event. The actionCommand defaults to the text on the button.
		if (e.getActionCommand().equals("two")) {
			window.setLocation((int)(Math.random()*500), (int)(Math.random()*500));
		}		
		
		
	}
	
	
}
