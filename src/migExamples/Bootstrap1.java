package migExamples;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import net.miginfocom.swing.MigLayout;

public class Bootstrap1 {
	public static void main(String[] args) {
		new Bootstrap1();
	}

	Bootstrap1() {
		// JFrames default to BorderLayout
		JFrame window = new JFrame("Trying to do Bootstrap Layout using MigLayout ");
		window.setSize(600, 300);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLocationRelativeTo(null);

		window.setResizable(true);
		JPanel panel = new JPanel();
		panel.setLayout(new MigLayout("wrap 5, insets 10"));
		panel.setBackground(new Color(230,230,230));
		
		JLabel lbl1 = new JLabel("Locker Information");
		lbl1.setBackground(Color.WHITE);
		lbl1.setOpaque(true);
		lbl1.setFont(new Font("Arial", Font.PLAIN, 22));
		panel.add(lbl1, "span 5, growx");

		JLabel lbl2 = new JLabel("Enter Locker Number: ");
//		lbl2.setBackground(Color.WHITE);
//		lbl2.setOpaque(true);
//		lbl2.setFont(new Font("Arial", Font.PLAIN, 22));
		panel.add(lbl2, "span 2");
		JTextField txt1 = new JTextField(5);
		panel.add(txt1);
		JButton btn1 = new JButton("Search");
		btn1.setBackground(Color.green);
		btn1.setForeground(Color.WHITE);
		panel.add(btn1);
		
		window.add(panel, BorderLayout.CENTER);

		window.setVisible(true);

	}
}