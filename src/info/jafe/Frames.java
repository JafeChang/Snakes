package info.jafe;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Frames extends JFrame {
	/**
	 * the window frame of this game, singleton class
	 * 
	 * @see javax.swing.JFrame
	 */
	private static final long serialVersionUID = 4348098887612819036L;
	public static int WIDTH = 800;
	public static int HEIGHT = 600;
	public static Frames frame = new Frames();// this must be located after
												// other static fields
	private Panels panel=null;

	private Frames() {
		Point screenSize = info.jafe.toolkits.Window.getScreenSize();
		this.setBounds((int) (0.5 * screenSize.x - WIDTH / 2),
				(int) (0.5 * screenSize.y - HEIGHT / 2), WIDTH, HEIGHT);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new Panels();		
		this.add(panel);
		
		this.setVisible(true);
	}

	public static Frames getFrame() {
		return frame;
	}
}

class Panels extends JPanel{
	/**
	 * the panel of this game
	 * 
	 * @see javax.swing.JPanel
	 */
	
	Panels(){
		this.setBackground(new Color(63,63,63));
	}
	
	public void paint(Graphics g){
		
		
	}
}