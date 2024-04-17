package lowleveldesign.designproblems.tictactoe2;

import lowleveldesign.designproblems.tictactoe2.model.*;
import lowleveldesign.designproblems.tictactoe2.strategy.gamewinningstrategy.OrderOneGameWinningStrategy;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class GameSimulator {
    public static void main(String[] args) {
        List<Player> players = Arrays.asList(new HumanPlayer(new Symbol('X')),
                       new Bot(new Symbol('O'), BotDifficultyLevel.EASY));
        GameController gameController = new GameController();
        Game game = gameController.createGame(3,players, Collections.singletonList(new OrderOneGameWinningStrategy()));
        while (GameStatus.IN_PROGRESS.equals(game.getGameStatus())) {
            gameController.display(game);
            gameController.makeMove(game);
        }

    }
}
