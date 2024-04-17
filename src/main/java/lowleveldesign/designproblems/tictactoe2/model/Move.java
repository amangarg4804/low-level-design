package lowleveldesign.designproblems.tictactoe2.model;

public class Move {
    private Symbol symbol;
    private Cell cell;

    private Player player;

    public Symbol getSymbol() {
        return symbol;
    }

    public Move setSymbol(Symbol symbol) {
        this.symbol = symbol;
        return this;
    }

    public Cell getCell() {
        return cell;
    }

    public Move setCell(Cell cell) {
        this.cell = cell;
        return this;
    }

    public Player getPlayer() {
        return player;
    }

    public Move setPlayer(Player player) {
        this.player = player;
        return this;
    }
}
