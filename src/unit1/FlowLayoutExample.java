package unit1;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class FlowLayoutExample {

	public static void main(String[] args) {	
			new FlowLayoutExample();
	}
	
	FlowLayoutExample(){
		
		//JFrames default to BorderLayout
		JFrame window = new JFrame("Darren's Example Layouts");
		window.setSize(600, 300);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLocationRelativeTo(null);
		
		/*** Leave as true so you can see how LayoutManagers work when you resize **/
		window.setResizable(true);		
		
		//JPanel default to FlowLayout
		JPanel panel = new JPanel(); 
		
		for (int i = 0; i < 12; i++) {
			panel.add(new MyButton(i));
		}
		
		JPanel panelEast = new JPanel();
		panelEast.setBackground(Color.RED.darker().darker());
		
		//uncomment the next section to see how things change: the panelEast gets wider
		/*
		//Add a JLabel and make it white ... without creating a variable for it; {{ }}
		// Double brace initialisation creates an anonymous class derived from the specified class (the outer braces), and provides an initialiser block within that class (the inner braces).
		 *  
		panelEast.add(
				new JLabel("About")
				{{
					this.setForeground(Color.WHITE);					
				}}
				);
		*/
		
		window.add(panel, BorderLayout.CENTER);
		window.add(panelEast, BorderLayout.EAST);
		
		window.setVisible(true);
	}

	//Inner class
	class MyButton extends JButton {
		
		//constructor
		MyButton(int n) {
			/* hmmm doesn't work ... */
			//JButton btn = new JButton("#" + n);
			//return btn;
			
			this.setText("#" + n);
			this.setForeground(Color.BLUE);
		}
	}
}
