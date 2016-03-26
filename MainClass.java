package Main;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MainClass {
	public static String line = "";

	static GameGUI game = new GameGUI();

	public static void main(String[] args) {
		TextParsing parsing = new TextParsing();

		game.getTextField().addKeyListener(new KeyListener() {

			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				if (e.getKeyCode() == 10) {
					line = game.getTextField().getText();
					parsing.read(line);
					game.getTextField().setText("");

				}
			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
			}

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
			}

		});

	}

	public void writeString(String sentence) {
		game.getGameText().append("\n" + sentence);
	}

}
