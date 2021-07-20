package Application;

import java.util.Scanner;

import Chess.ChessMatch;
import Chess.ChessPiece;
import Chess.ChessPosition;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ChessMatch match = new ChessMatch();

        while (true) {
            UI.printBoard(match.getPieces());
            System.out.println("");
            System.out.println("Posicao da peca: ");
            ChessPosition source = UI.readChessPosition(sc);
            System.out.println("");
            System.out.println("Posicao destino: ");
            ChessPosition target = UI.readChessPosition(sc);
            
            ChessPiece capturedPiece = match.performChessMove(source, target);
        }
    }
}
