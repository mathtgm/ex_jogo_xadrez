package application;

import chess.ChessMatch;

public class Program {

	public static void main(String[] args) {
		ChessMatch chessMach = new ChessMatch();
		UI.printBoard(chessMach.getPieces());
	}

}
