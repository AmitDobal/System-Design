package tictactoe;

import tictactoe.symbol.Symbol;

public class Player {
	private String name;
	private Symbol symbol;

	public Player(String name, Symbol symbol) {
		this.symbol = symbol;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public Symbol getSymbol() {
		return symbol;
	}

	@Override
	public String toString() {
		return "Player [name=" + name + ", symbol=" + symbol + "]";
	}
	
	

}
