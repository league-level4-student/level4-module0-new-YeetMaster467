package _04_Snake;

public class Location {
	
	private int x;
	private int y;
	
	Location (int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public boolean equals (Location l) {
		if (l.x == x && l.y == y) {
			return true;
		} else {
			return false;
		}
	}
	
	public int getX () {
		return x;
	}
	
	public int getY () {
		return y;
	}
	
	public void setX (int x) {
		this.x = x;
	}
	
	public void setY (int y) {
		this.y = y;
	}
	
}
