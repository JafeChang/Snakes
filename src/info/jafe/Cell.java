package info.jafe;

public class Cell {
	public static int EMPTY = 0;
	public static int HEADL = 1;
	public static int HEADU = 2;
	public static int HEADR = 3;
	public static int HEADD = 4;
	public static int BODYLD = 5;
	public static int BODYLR = 6;
	public static int BODTLU = 7;
	public static int BODYRD = 8;
	public static int BODYRU = 9;
	public static int BODYUD = 10;
	public static int TAILL = 11;
	public static int TAILU = 12;
	public static int TAILR = 13;
	public static int TAILD = 14;
	public static int HOLE = 15;
	public static int BUSH = 16;
	public static int APPLE = 17;

	public static int getX(int row) {
		int x = Frames.MARGIN + (row - 1) * Frames.IMAGEWIDTH;
		return x;
	}
	public static int getX(int row, int col) {
		int x = Frames.MARGIN + (row - 1) * Frames.IMAGEWIDTH;
		return x;
	}
		
	public static int getY(int col) {
		int y = Frames.MARGIN + (col - 1) * Frames.IMAGEHEIGHT;
		return y;
	}
	public static int getY(int row, int col) {
		int y = Frames.MARGIN + (col - 1) * Frames.IMAGEHEIGHT;
		return y;
	}
//	 public static void main(String[] args) {
//	 for (int i = 0; i < 18; i++) {
//	 System.out.println("images["+i+"] = ImageIO.read(new FileInputStream(\"./images/ \")); ");
//	 }
//	 }
}
