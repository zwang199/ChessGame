package Main.Pieces;

import Main.Board;
import Main.Piece;

public class Rook extends Piece {

    @Override
    public boolean checkMove(Board grid, int fromX, int fromY, int toX, int toY) {
        boolean moved = (fromX != toX) || (fromY != toY);
        boolean isLine = (fromX == toX) || (fromY == toY);
        boolean hasMine = grid.getCell(toX, toY).getOwner() == grid.getCell(fromX, fromY).getOwner();
        return  moved & isLine & (!hasMine);
    }
}
