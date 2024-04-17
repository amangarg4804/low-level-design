package lowleveldesign.designproblems.tictactoe2.strategy.botplayingstrategy;

import lowleveldesign.designproblems.tictactoe2.model.Board;
import lowleveldesign.designproblems.tictactoe2.model.Move;
import lowleveldesign.designproblems.tictactoe2.model.Player;

public interface BotPlayingStrategy {
    Move calculateNextMove(Board board, Player player);
}
