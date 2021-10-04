package unit1;

import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class LayoutExamples {
	public static void main(String[] args) {
		new LayoutExamples();
	}
	LayoutExamples() {
		// JFrames default to BorderLayout
		JFrame window = new JFrame("Darren's Example Layouts");
		window.setSize(600, 300);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLocationRelativeTo(null);
		/***
		 * Leave as true so you can see how LayoutManagers work when you resize
		 **/
		window.setResizable(true);
		// JPanel default to FlowLayout
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(4,3,2,2));
		panel.setBackground(Color.MAGENTA.darker().darker());
//		for (int i = 0; i < 16; i++) {
//			panel.add(new MyButton(i));
//		}
		panel.add(new MyButton(1));
		JPanel panelEast = new JPanel();
		panelEast.setBackground(Color.RED.darker().darker());
		JPanel panelWest = new JPanel();
		panelWest.setBackground(Color.BLUE.darker().darker());
		JPanel panelNorth = new JPanel();
		panelNorth.setBackground(Color.GREEN.darker().darker());
		JPanel panelSouth = new JPanel();
		panelSouth.setBackground(Color.YELLOW.darker().darker());
		panelEast.add(new JLabel("About") {
			{
				this.setForeground(Color.WHITE);
			}
		});
		window.add(panel, BorderLayout.CENTER);
		window.add(panelEast, BorderLayout.EAST);
		window.add(panelWest, BorderLayout.WEST);
		window.add(panelNorth, BorderLayout.NORTH);
		window.add(panelSouth, BorderLayout.SOUTH);
		window.setVisible(true);
		
		for (int i = 2; i < 25; i++) {
			try {
				Thread.sleep(600);
			} catch (InterruptedException e) {}
			panel.add(new MyButton(i));
			//window.validate();
			//window.repaint();	
			//window.setVisible(true);
		}
	}
	// Inner class
	class MyButton extends JButton {
		// constructor
		MyButton(int n) {
			/* hmmm doesn't work ... */
			// JButton btn = new JButton("#" + n);
			// return btn;
			this.setText("#" + n);
			this.setForeground(Color.BLUE);
		}
	}
}












