package lowleveldesign.designproblems.tictactoe2.model;

public class Cell {
    private int row;
    private int col;
    private Symbol symbol;

    public Cell(int row, int col) {
        this.row = row;
        this.col = col;
    }

    public void clearCell() {
//        this.symbol = new Symbol(' ');
        this.symbol = null;
    }


    public int getRow() {
        return row;
    }

    public Cell setRow(int row) {
        this.row = row;
        return this;
    }

    public int getCol() {
        return col;
    }

    public Cell setCol(int col) {
        this.col = col;
        return this;
    }

    public Symbol getSymbol() {
        return symbol;
    }

    public Cell setSymbol(Symbol symbol) {
        this.symbol = symbol;
        return this;
    }

    public boolean isEmpty() {
        return symbol == null;
    }
}
