package boardgame;

public class Piece {

	protected Position position;
	private Board board;

	// M�todos Construtores
	public Piece(Board board) {
		this.board = board;
		position = null;
	}

	protected Board getBoard() {
		return board;
	}
	
	
}
