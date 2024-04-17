package lowleveldesign.designproblems.tictactoe2.model;

public class Board {
    Cell[][] board;
    private int size;


    public Board(int size) {
        this.size = size;
        board = new Cell[size][size];
        for(int row =0; row < size; row++) {
            for(int col =0; col < size; col++) {
                board[row][col] = new Cell(row, col);
            }
        }
    }
    public Cell getCell(int row, int col) {
        return board[row][col];
    }

    public int getSize() {
        return size;
    }

    public void print() {
        for(int row =0; row < size; row++) {
            for(int col =0; col < size; col++) {
                if(board[row][col].getSymbol()!=null) {
                    System.out.print(board[row][col].getSymbol().getCharacter() + " ");
                } else {
                    System.out.print("_ " + " ");
                }
            }
            System.out.println();
        }
    }

    public void insert(Cell cell, Symbol symbol) {
        cell.setSymbol(symbol);
    }
}
