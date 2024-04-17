package lowleveldesign.designproblems.tictactoe2.model;

public abstract class Player {
    private String name;
    private Symbol symbol;
    private PlayerType playerType;

    public Player(Symbol symbol, PlayerType playerType) { // has to be called by child classes in their constructor
        this.symbol = symbol;
        this.playerType = playerType;
    }
    public abstract Move calculateMove(Board board);

    public PlayerType getPlayerType() {
        return playerType;
    }

    public String getName() {
        return name;
    }

    public Symbol getSymbol() {
        return symbol;
    }

}
