package com.amit.chess.entity;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.stream.IntStream;

import javax.swing.JPanel;

import com.amit.chess.entity.pieces.Bishop;
import com.amit.chess.entity.pieces.King;
import com.amit.chess.entity.pieces.Knight;
import com.amit.chess.entity.pieces.Pawn;
import com.amit.chess.entity.pieces.Piece;
import com.amit.chess.entity.pieces.Queen;
import com.amit.chess.entity.pieces.Rook;

public class Board extends JPanel {

	public int tileSize = 85;

	int cols = 8;
	int rows = 8;

	ArrayList<Piece> pieceList = new ArrayList<>();

	public Piece selectedPiece;

	public Input input = new Input(this);

	public Board() {
		this.setPreferredSize(new Dimension(rows * tileSize, cols * tileSize));

		this.addMouseListener(input);
		this.addMouseMotionListener(input);

		addPieces();
	}

	public Piece getPiece(int col, int row) {
		for (Piece piece : pieceList) {
			if (piece.col == col && piece.row == row) {
				return piece;
			}
		}
//		pieceList.stream().filter(piece -> piece.col == col && piece.row == row).findFirst().get();
		return null;
	}

	public void makeMove(Move move) {
		move.piece.col = move.newCol;
		move.piece.row = move.newRow;
		move.piece.xPos = move.newCol * tileSize;
		move.piece.yPos = move.newRow * tileSize;

		capture(move);

	}

	public void capture(Move move) {
		pieceList.remove(move.capture);
	}

	public boolean isValidMove(Move move) {

		if (sameTeam(move.piece, move.capture))
			return false;
		if (!move.piece.isValidMovement(move.newCol, move.newRow))
			return false;

		if (move.piece.moveCollidesWithPiece(move.newCol, move.newRow))
			return false;

		return true;
	}

	public boolean sameTeam(Piece p1, Piece p2) {
		if (p1 == null || p2 == null)
			return false;
		return p1.isWhite == p2.isWhite;
	}

	public void addPieces() {
		// White
		pieceList.add(new Rook(this, 0, 0, false));
		pieceList.add(new Knight(this, 1, 0, false));
		pieceList.add(new Bishop(this, 2, 0, false));
		pieceList.add(new King(this, 3, 0, false));
		pieceList.add(new Queen(this, 4, 0, false));
		pieceList.add(new Bishop(this, 5, 0, false));
		pieceList.add(new Knight(this, 6, 0, false));
		pieceList.add(new Rook(this, 7, 0, false));

		IntStream.range(0, cols).forEach(i -> pieceList.add(new Pawn(this, i, 1, false)));

		// Black
		pieceList.add(new Rook(this, 0, cols - 1, true));
		pieceList.add(new Knight(this, 1, cols - 1, true));
		pieceList.add(new Bishop(this, 2, cols - 1, true));
		pieceList.add(new Queen(this, 3, cols - 1, true));
		pieceList.add(new King(this, 4, cols - 1, true));
		pieceList.add(new Bishop(this, 5, cols - 1, true));
		pieceList.add(new Knight(this, 6, cols - 1, true));
		pieceList.add(new Rook(this, 7, cols - 1, true));

		IntStream.range(0, cols).forEach(i -> pieceList.add(new Pawn(this, i, cols - 2, true)));

	}

	public void paintComponent(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;

		// Paint the board
		for (int r = 0; r < rows; r++)
			for (int c = 0; c < cols; c++) {
				g2d.setColor((c + r) % 2 == 0 ? new Color(230, 200, 180) : new Color(160, 105, 55));
				g2d.fillRect(c * tileSize, r * tileSize, tileSize, tileSize);
			}

		// Paint Highlights
		if (selectedPiece != null)
			for (int r = 0; r < rows; r++)
				for (int c = 0; c < cols; c++) {
					if (isValidMove(new Move(this, selectedPiece, c, r))) {
						g2d.setColor(new Color(70, 180, 60, 190));
						g2d.fillRect(c * tileSize, r * tileSize, tileSize, tileSize);
					}
				}
		// Paint pieces
		for (Piece piece : pieceList) {
			piece.paint(g2d);
		}
	}

}
