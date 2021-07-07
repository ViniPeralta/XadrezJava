package Chess.pieces;

import BoardLayer.Board;
import Chess.ChessPiece;
import Chess.Color;

public class Rook extends ChessPiece{
    
    public Rook(Color color, Board board) {
        super(color, board);
    }
    
    @Override
    public String toString(){
        return "R";
    }
}
