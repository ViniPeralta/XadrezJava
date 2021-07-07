package Chess.pieces;

import BoardLayer.Board;
import Chess.ChessPiece;
import Chess.Color;

public class King extends ChessPiece{
    
    public King(Color color, Board board) {
        super(color, board);
    }
    
    @Override
    public String toString(){
        return "K";
    }
}
