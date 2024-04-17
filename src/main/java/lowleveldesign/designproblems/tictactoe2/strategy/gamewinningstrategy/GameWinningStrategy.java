package lowleveldesign.designproblems.tictactoe2.strategy.gamewinningstrategy;

import lowleveldesign.designproblems.tictactoe2.model.Board;
import lowleveldesign.designproblems.tictactoe2.model.Cell;
import lowleveldesign.designproblems.tictactoe2.model.Move;
import lowleveldesign.designproblems.tictactoe2.model.Player;

public interface GameWinningStrategy {
    public boolean isGameWon(Board board, Player player, Cell cell);// Could have used Move
}
