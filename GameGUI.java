package Main;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Shape;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.text.JTextComponent;

public class GameGUI extends JFrame {

	final int width = 600;
	final int height = 420;
	JPanel panel;
	JTextField box;
	static JTextArea gameText;
	Dimension d = new Dimension(width - 20, 20);

	public GameGUI() {
		panel = new JPanel();
		box = new JTextField();
		gameText = new JTextArea();

		gameText.setText("Welcome to the Binding of Cody Burrows" + "\n\n\n" + "You are in a room. It is " + Movement.map[Movement.y][Movement.x][2][0]);
		gameText.setEnabled(false);
		gameText.setForeground(Color.BLUE);
		gameText.setBackground(Color.black);
		this.setTitle("The Binding of Cody Burrows");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(new BorderLayout());
		this.setBackground(Color.BLACK);
		this.setForeground(Color.BLACK);
		this.setBounds(0, 0, width, height);
		panel.setBounds(0, 0, width, height);
		box.setPreferredSize(d);
		this.add(gameText, BorderLayout.CENTER);
		// box.setBackground(Color.black);
		this.add(panel, BorderLayout.SOUTH);
		panel.add(box, BorderLayout.SOUTH);
		this.setVisible(true);
		panel.setVisible(true);
		box.setVisible(true);

	}

	public JTextField getTextField() {
		return box;
	}

	public static JTextArea getGameText() {
		return gameText;
	}
}
