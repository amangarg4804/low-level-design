package lowleveldesign.designproblems.tictactoe2.model;

import lowleveldesign.designproblems.tictactoe2.strategy.gamewinningstrategy.GameWinningStrategy;

import java.util.List;

public class GameController {
    public Game createGame(int boardSize, List<Player> players, List<GameWinningStrategy> strategies) {
      return Game.builder().
                addPlayers(players)
                .addGameWinningStrategies(strategies)
                .withBoardSize(boardSize)
              .build();
    }

    public void makeMove(Game game) {
        game.makeMove();
    }
    public void undoMove(Game game) {
        game.undo();
    }
    public Player getWinner(Game game) {
        return game.getWinner();
    }
    public GameStatus getGameStatus(Game game) {
        return game.getGameStatus();
    }

    public void display(Game game) {
        game.display();
    }
}

