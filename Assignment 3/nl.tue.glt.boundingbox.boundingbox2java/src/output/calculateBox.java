package output;

import java.util.ArrayList;

class Move {
	int direction, length;
	public Move (int direction, int length) {
		this.direction = direction;
		this.length = length;
	}
}

class MoveUp extends Move { public MoveUp (int length) { super(0, length); } }
class MoveDown extends Move { public MoveDown (int length) { super(1, length); } }
class MoveLeft extends Move { public MoveLeft (int length) { super(2, length); } }
class MoveRight extends Move { public MoveRight (int length) { super(3, length); } }

class calculateBox {
	private static ArrayList<Move> moves;
	public static void main(String[] args) {
		moves = new ArrayList<>();
		moves.add(new MoveUp(80));
		moves.add(new MoveDown(5));
		moves.add(new MoveLeft(32));
		calculatePoints(moves);
	}
	
	public static void calculatePoints(ArrayList<Move> moves) {
		int xCurr = 0, yCurr = 0;
		int xMin = 0, xMax = 0;
		int yMin = 0, yMax = 0;
		for (Move m : moves) {
			switch (m.direction) {
				case 0:  // Up
					yCurr += m.length;
					break;		
				case 1:  // Down	
					yCurr -= m.length;
					break;	
				case 2:  // Left	
					xCurr -= m.length;
					break;	
				case 3:  // Right
					xCurr += m.length;
					break;			
			}
			if (xCurr > xMax)
				xMax = xCurr;
			if (xCurr < xMin)
				xMin = xCurr;
			if (yCurr > yMax)
				yMax = yCurr;
			if (yCurr < yMin)
				yMin = yCurr;
		}
		System.out.println("Lower left corner: (" + xMin + ", " + yMin +")");
		System.out.println("Upper right corner: (" + xMax + ", " + yMax +")");
	}
}