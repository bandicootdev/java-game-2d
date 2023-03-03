package game2D;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Dimension;

import javax.swing.JFrame;

public class Game extends Canvas {
	private static final long serialVersionUID = 1L;
	
	private static final int WIDTH = 800;
	private static final int HEIGTH = 800;
	private static final String Name = "Game";
	
	private static JFrame window;
	
	private Game() {
		setPreferredSize(new Dimension(WIDTH,HEIGTH));
		window = new JFrame(Name);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setResizable(false);
		window.setLayout(new BorderLayout());
		window.add(this, BorderLayout.CENTER);
		window.pack();
		window.setLocationRelativeTo(null);
		window.setVisible(true);
	}
	
	public static void main(String[] args) {
		Game game2D = new Game();
	}
}
