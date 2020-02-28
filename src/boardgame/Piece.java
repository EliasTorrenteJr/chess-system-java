package boardgame;

public class Piece {

	protected Position position;
	private Board board;

	// Métodos Construtores
	public Piece(Board board) {
		this.board = board;
		position = null;
	}

	protected Board getBoard() {
		return board;
	}
	
	
}
