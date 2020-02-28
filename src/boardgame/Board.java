package boardgame;

public class Board {
	
	private int rows;
	private int columns;
	private Piece[][] pieces;
	 
	// M�todo Construtor 
	public Board(int rows, int columns) {
		this.rows = rows;
		this.columns = columns;
		
		pieces = new Piece[rows][columns];
	}

	// GETTERS & SETTERS
	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public int getColumns() {
		return columns;
	}

	public void setColumns(int columns) {
		this.columns = columns;
	}
	 
	 // M�todo Board.Piece com parametros row & colmumn e sua sobrecarga para determinar a position
	public Piece piece(int row, int column) {
		return pieces[row][column];
	}
	
	public Piece piece(Position position) {
		return pieces[position.getRow()][position.getColumn()];
	}
}
