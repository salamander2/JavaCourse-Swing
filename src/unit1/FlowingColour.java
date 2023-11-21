package unit1;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

public class FlowingColour implements ActionListener {
	public static void main(String[] args) { new FlowingColour(); }

	//Only make global what you absolutely need to.
	JFrame window = new JFrame("Flowing Colours");
	int winW = 350, winH = 500;
		
	FlowingColour() {		
		window.setSize(winW,winH);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout(FlowLayout.LEFT,0,0));
		
		for (int i=0; i < 20000; i++) {
			panel.add(new ColourLabel());
		}

		window.add(panel);
		window.setVisible(true);
		
		//Time does not need to be global. We're never interacting with it again.
		Timer timer = new Timer(5, this);
		timer.start();
	}

	private class ColourLabel extends JLabel {		
		ColourLabel() {
			this.setText(" ");			
			this.setBackground(ColourRainbow.getNextColour());
			this.setOpaque(true);
			//this.setAlignmentX(0.5f);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		window.setSize(++winW, winH);
		window.repaint(); //this updates the graphics		
	}
}
