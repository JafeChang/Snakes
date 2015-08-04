package info.jafe;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Frames extends JFrame {
	/**
	 * the window frame of this game, singleton class
	 * 
	 * @see javax.swing.JFrame
	 */
	private static final long serialVersionUID = 4348098887612819036L;
	public static int WIDTH = 776;
	public static int HEIGHT = 414;
	public static int MARGIN = 0;
	public static int IMAGEWIDTH = 11;
	public static int IMAGEHEIGHT = 11;
	public static int ROWCOUNT = 70;
	public static int COLCOUNT = 35;
	public static BufferedImage images[];

	public static Frames frame = new Frames();// this must be located after
												// other static fields
	private Panels panel = null;

	private Frames() {
		Point screenSize = info.jafe.toolkits.Window.getScreenSize();
		this.setBounds((int) (0.5 * screenSize.x - WIDTH / 2),
				(int) (0.5 * screenSize.y - HEIGHT / 2), WIDTH, HEIGHT);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		
		panel = new Panels();
		this.add(panel);
		this.setVisible(true);
	}

	public static Frames getFrame() {
		images=new BufferedImage[18];
		try{
		images[0] = ImageIO.read(new FileInputStream("./images/empty.jpg")); 
		images[1] = ImageIO.read(new FileInputStream("./images/headL.jpg ")); 
		images[2] = ImageIO.read(new FileInputStream("./images/headU.jpg ")); 
		images[3] = ImageIO.read(new FileInputStream("./images/headR.jpg ")); 
		images[4] = ImageIO.read(new FileInputStream("./images/headD.jpg ")); 
		images[5] = ImageIO.read(new FileInputStream("./images/bodyLD.jpg ")); 
		images[6] = ImageIO.read(new FileInputStream("./images/bodyLR.jpg ")); 
		images[7] = ImageIO.read(new FileInputStream("./images/bodyLU.jpg ")); 
		images[8] = ImageIO.read(new FileInputStream("./images/bodyRD.jpg ")); 
		images[9] = ImageIO.read(new FileInputStream("./images/bodyRU.jpg ")); 
		images[10] = ImageIO.read(new FileInputStream("./images/bodyUD.jpg ")); 
		images[11] = ImageIO.read(new FileInputStream("./images/tailL.jpg ")); 
		images[12] = ImageIO.read(new FileInputStream("./images/tailU.jpg ")); 
		images[13] = ImageIO.read(new FileInputStream("./images/tailR.jpg ")); 
		images[14] = ImageIO.read(new FileInputStream("./images/tailD.jpg ")); 
		images[15] = ImageIO.read(new FileInputStream("./images/hole.jpg ")); 
		images[16] = ImageIO.read(new FileInputStream("./images/bush.jpg ")); 
		images[17] = ImageIO.read(new FileInputStream("./images/apple.jpg ")); 
		}catch(IOException e){
			e.printStackTrace();
		}
		return frame;
	}
}

class Panels extends JPanel {
	/**
	 * the panel of this game
	 * 
	 * @see javax.swing.JPanel
	 */
	private static final long serialVersionUID = -6166110089306579963L;

	Panels() {
		this.setBackground(new Color(63, 63, 63));
	}

	public void paint(Graphics g) {
		super.paint(g);
		drawMap(g);
	}
	
	private void drawMap(Graphics g){
		for(int i=0;i<Frames.ROWCOUNT;i++){
			for (int j=0;j<Frames.COLCOUNT;j++){
				System.out.println(i*100+j);
				g.drawImage(Frames.images[Cell.EMPTY], Cell.getX(i+1), Cell.getY(j+1), this);
			}
		}
//		g.drawImage(Toolkit.getDefaultToolkit().getImage("./images/apple.jpg"), Cell.getX(1), Cell.getY(1), this);
	}
}