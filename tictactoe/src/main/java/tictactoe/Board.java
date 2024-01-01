package tictactoe;

import tictactoe.symbol.Symbol;

public class Board {
	private int boardSize;
	private Symbol[][] symbolBoard;

	public Board(int size) {
		this.boardSize = size;
		this.symbolBoard = new Symbol[size][size];

	}

	public boolean move(int i, int j, Player player) {
		boolean isValid = isValidMove(i, j);
		if (isValid) {
			this.symbolBoard[i][j] = player.getSymbol();
		}
		return isValid;
	}

	private boolean isValidMove(int i, int j) {
		if (i < 0 || i >= boardSize || j < 0 || j >= boardSize || symbolBoard[i][j] != null)
			return false;
		return true;
	}

	public void printBoard() {
		for (int row = 0; row < boardSize; row++) {
			System.out.print("\t");
			for (int col = 0; col < boardSize; col++) {
				Symbol symbol = this.symbolBoard[row][col];
				String s = symbol != null ? symbol.toString() : " ";
				if (col != boardSize - 1)
					System.out.print(" " + s + " |");
				else
					System.out.print(" " + s + " ");
			}
			if (row != boardSize - 1)
				System.out.println("\n\t-----------");
			else
				System.out.println("\n");
		}
	}

	public boolean isWin(int[] moves, Player player) {
		int row = moves[0];
		int col = moves[1];
		boolean isHorizontal = isHorizontal(row, player.getSymbol());
		boolean isVertical = isVertical(col, player.getSymbol());
		boolean isDiagonal = isDiagonal(row, col, player.getSymbol());

		return isHorizontal || isVertical || isDiagonal;
	}

	private boolean isDiagonal(int row, int col, Symbol symbol) {
		if (row != col)
			return false;
		for (int r = 0; r < this.boardSize; r++) {
			if (symbolBoard[r][r] != symbol)
				return false;
		}
		return true;
	}

	private boolean isVertical(int col, Symbol symbol) {
		for (int r = 0; r < this.boardSize; r++) {
			if (symbolBoard[r][col] == null || symbolBoard[r][col] != symbol)
				return false;
		}
		return true;
	}

	private boolean isHorizontal(int row, Symbol symbol) {

		for (int c = 0; c < this.boardSize; c++) {
			if (symbolBoard[row][c] == null || symbolBoard[row][c] != symbol)
				return false;
		}
		return true;
	}

	public int getBoardSize() {
		return boardSize;
	}

}
