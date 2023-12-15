package com.amit.chess.entity.pieces;

import java.awt.image.BufferedImage;

import com.amit.chess.entity.Board;

public class Rook extends Piece {

	public Rook(Board board, int col, int row, boolean isWhite) {
		super(board);
		this.col = col;
		this.row = row;
		this.xPos = col * board.tileSize;
		this.yPos = row * board.tileSize;
		this.isWhite = isWhite;

		this.name = "Knight";

		this.sprite = sheet.getSubimage(4 * sheetScale, isWhite ? 0 : sheetScale, sheetScale, sheetScale)
				.getScaledInstance(board.tileSize, board.tileSize, BufferedImage.SCALE_SMOOTH);
	}

}
