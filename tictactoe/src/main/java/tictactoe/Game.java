package tictactoe;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

import tictactoe.symbol.Symbol;

public class Game {

	Queue<Player> playerQueue;
	Board board;
	boolean isMatchOn;
	int boardSize;

	public Game(int boardSize) {
		this.boardSize = boardSize;
		resetGame();
	}

	public void startGame() {
		addPlayers();
//		dummyPlayer();
		board.printBoard();
		isMatchOn = true;
		int movesCount = 0;
		while (isMatchOn) {
			Player currPlayer = playerQueue.peek();
			int[] moves = playerMovePrompt(currPlayer);
			boolean isMoved = board.move(moves[0], moves[1], currPlayer);
			if (isMoved) {
				movesCount++;
				playerQueue.add(playerQueue.poll());
				board.printBoard();
				if(isWin(moves, currPlayer)) {
					System.out.println("Congratulations " + currPlayer.getName() + " you have won the game. ");
					restartGamePrompt();
				}
				if(movesCount == (board.getBoardSize() * board.getBoardSize() )) {
					System.out.println("The match is Draw");
					restartGamePrompt();
				}
			} else {
				System.out.println("Invalid move. Provide valid moves");
			}
		}
	}

	private void restartGamePrompt() {
		try {
			Thread.sleep(2000);
			Scanner sc = new Scanner(System.in);
			System.out.println("Do you want to restart the game? \n Y/N");
			String response = sc.nextLine();
			if(response.equalsIgnoreCase("Y") || response.equalsIgnoreCase("YES")) {
				resetGame();
				startGame();
			} else {
				isMatchOn = false;
				System.out.println("Thanks!! Exiting the game......");
			}
		} catch (InterruptedException e) {
			System.out.println("Error while restarting the game");
			e.printStackTrace();
		}
		
	}

	private void resetGame() {
		playerQueue = new LinkedList<>();
		board = new Board(boardSize);
	}

	private boolean isWin(int[] moves, Player player) {
		boolean isWinner = this.board.isWinner(moves, player);
		return isWinner;
	}

	private int[] playerMovePrompt(Player player) {
		int[] moveArr = new int[2];
		Scanner sc = null;
		try {
			sc = new Scanner(System.in);
			System.out.println(player.getSymbol() + " -- " + player.getName() + " Please enter your move: ");

			System.out.println("Row: ");
			while (!sc.hasNextInt()) {
				System.out.println("Invalid input. Please enter an integer for row: ");
				sc.next(); // Consume the invalid input
			}
			moveArr[0] = sc.nextInt() - 1;

			System.out.println("Column: ");
			while (!sc.hasNextInt()) {
				System.out.println("Invalid input. Please enter an integer for column: ");
				sc.next(); // Consume the invalid input
			}
			moveArr[1] = sc.nextInt() - 1;

		} catch (Exception e) {
			System.out.println("Invalid input: " + e.getMessage());
			e.printStackTrace();
		} finally {
//			if (sc != null) {
//				sc.close();
//			}
		}
		return moveArr;
	}

	private void addPlayers() {

		try  {
			Scanner scanner = new Scanner(System.in);

			// Player 1
			System.out.println("Enter the name of 1st player: ");
			String player1Name = scanner.nextLine();
			Player player1 = new Player(player1Name, Symbol.X);

			// player 2
			System.out.println("Enter the name of 2nd player: ");
			String player2Name = scanner.nextLine();
			Player player2 = new Player(player2Name, Symbol.O);
			
			playerQueue.add(player1);
			playerQueue.add(player2);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private void dummyPlayer() {
		// Player 1
		Player player1 = new Player("Amit", Symbol.X);

		// player 2
		Player player2 = new Player("Sumit", Symbol.O);

		playerQueue.add(player1);
		playerQueue.add(player2);
	}

}
