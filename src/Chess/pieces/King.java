package Chess.pieces;

import Boardgame.Board;
import Boardgame.Position;
import Chess.ChessPiece;
import Chess.Color;

public class King extends ChessPiece {

    public King(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString(){
        return "K";
    }

    private boolean caMove(Position position){
        ChessPiece p = (ChessPiece)getBoard().piece(position);
        return p == null || p.getColor()!= getColor();
    }

    @Override
    public boolean[][] possibleMoves() {
        boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];

        //above
        Position p = new Position(0,0);
        p.setValues(position.getRow() - 1, position.getColumn());
        if (getBoard().positionExists(p) && caMove(p)){
            mat[p.getRow()][p.getColumn()] = true;

        }
        //bellow
        p.setValues(position.getRow() + 1, position.getColumn());
        if (getBoard().positionExists(p) && caMove(p)){
            mat[p.getRow()][p.getColumn()] = true;
        }
        //left
        p.setValues(position.getRow(), position.getColumn() - 1);
        if (getBoard().positionExists(p) && caMove(p)){
            mat[p.getRow()][p.getColumn()] = true;
        }
        //right
        p.setValues(position.getRow(), position.getColumn() + 1);
        if (getBoard().positionExists(p) && caMove(p)){
            mat[p.getRow()][p.getColumn()] = true;
        }
        //upperLeft
        p.setValues(position.getRow() - 1, position.getColumn() - 1);
        if (getBoard().positionExists(p) && caMove(p)){
            mat[p.getRow()][p.getColumn()] = true;
        }
        //UpperRight
        p.setValues(position.getRow() - 1, position.getColumn() + 1);
        if (getBoard().positionExists(p) && caMove(p)){
            mat[p.getRow()][p.getColumn()] = true;
        }
        //LowerLeft
        p.setValues(position.getRow() + 1, position.getColumn() - 1);
        if (getBoard().positionExists(p) && caMove(p)){
            mat[p.getRow()][p.getColumn()] = true;
        }
        //LowerRight
        p.setValues(position.getRow() + 1, position.getColumn() + 1);
        if (getBoard().positionExists(p) && caMove(p)){
            mat[p.getRow()][p.getColumn()] = true;
        }

        return mat;
    }
}
