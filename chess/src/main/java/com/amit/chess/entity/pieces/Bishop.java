package com.amit.chess.entity.pieces;

import java.awt.image.BufferedImage;

import com.amit.chess.entity.Board;

public class Bishop extends Piece {

	public Bishop(Board board, int col, int row, boolean isWhite) {
		super(board);
		this.col = col;
		this.row = row;
		this.xPos = col * board.tileSize;
		this.yPos = row * board.tileSize;
		this.isWhite = isWhite;

		this.name = "Bishop";

		this.sprite = sheet.getSubimage(2 * sheetScale, isWhite ? 0 : sheetScale, sheetScale, sheetScale)
				.getScaledInstance(board.tileSize, board.tileSize, BufferedImage.SCALE_SMOOTH);
	}

	public boolean isValidMovement(int col, int row) {
		return (Math.abs(col - this.col) == Math.abs(row - this.row));
	}

	public boolean moveCollidesWithPiece(int col, int row) {

		// Up left
		if (this.col > col && this.row > row)
			for (int i = 1; i < Math.abs(this.col - col); i++)
				if (board.getPiece(this.col - i, this.row - i) != null)
					return true;
		
		//Up right
		if (this.col < col && this.row > row)
			for (int i = 1; i < Math.abs(this.col - col); i++)
				if (board.getPiece(this.col + i, this.row - i) != null)
					return true;

		// down left
		if (this.col > col && this.row < row)
			for (int i = 1; i < Math.abs(this.col - col); i++)
				if (board.getPiece(this.col - i, this.row + i) != null)
					return true;
		
		//down right
		if (this.col < col && this.row < row)
			for (int i = 1; i < Math.abs(this.col - col); i++)
				if (board.getPiece(this.col + i, this.row + i) != null)
					return true;

		return false;
	}

}
