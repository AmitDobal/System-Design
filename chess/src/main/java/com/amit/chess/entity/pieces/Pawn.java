package com.amit.chess.entity.pieces;

import java.awt.image.BufferedImage;

import com.amit.chess.entity.Board;

public class Pawn extends Piece {

	public Pawn(Board board, int col, int row, boolean isWhite) {
		super(board);
		this.col = col;
		this.row = row;
		this.xPos = col * board.tileSize;
		this.yPos = row * board.tileSize;
		this.isWhite = isWhite;

		this.name = "Pawn";

		this.sprite = sheet.getSubimage(5 * sheetScale, isWhite ? 0 : sheetScale, sheetScale, sheetScale)
				.getScaledInstance(board.tileSize, board.tileSize, BufferedImage.SCALE_SMOOTH);
	}

	public boolean isValidMovement(int col, int row) {
		return ( Math.abs(this.row - row) == 1 ||  Math.abs(this.row - row) == 2) && this.col == col; 
	}

	public boolean moveCollidesWithPiece(int col, int row) {

		// Left
		if (this.col > col)
			for (int c = this.col - 1; c > col; c--)
				if (board.getPiece(c, this.row) != null)
					return true;

		// Right
		if (this.col < col)
			for (int c = this.col + 1; c < col; c++)
				if (board.getPiece(c, this.row) != null)
					return true;
		
		// Up
		if (this.row > row)
			for (int r = this.row - 1; r > row; r--)
				if (board.getPiece(this.col, r) != null)
					return true;

		// Down
		if (this.row < row)
			for (int r = this.row + 1; r < row; r++)
				if (board.getPiece(this.col, r) != null)
					return true;

		return false;
	}

}
