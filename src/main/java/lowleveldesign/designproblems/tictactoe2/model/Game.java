package lowleveldesign.designproblems.tictactoe2.model;

import lowleveldesign.designproblems.tictactoe2.exception.EmptyMovesUndoOperationException;
import lowleveldesign.designproblems.tictactoe2.exception.MultipleBotsException;
import lowleveldesign.designproblems.tictactoe2.strategy.gamewinningstrategy.GameWinningStrategy;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Game {
    List<Player> players;
    List<Move> moves;
    Board board;
    List<GameWinningStrategy> gameWinningStrategies;
    private int lastMovedPlayerIndex;
    private GameStatus gameStatus;
    private Player winner;

    private Game() {
        this.players = new ArrayList<>();
        this.moves = new ArrayList<>();
        this.gameWinningStrategies = new ArrayList<>();
        this.lastMovedPlayerIndex = 0;
        this.gameStatus = GameStatus.IN_PROGRESS;
    }
    public void makeMove() {
        this.lastMovedPlayerIndex +=1;
        this.lastMovedPlayerIndex %= this.players.size();
        Player player = this.players.get(this.lastMovedPlayerIndex);
        Move move = player.calculateMove(this.board);
        this.moves.add(move);
        this.board.insert(move.getCell(), move.getSymbol());
        for(GameWinningStrategy strategy : gameWinningStrategies) {
            if(strategy.isGameWon(this.board, player, move.getCell())) {
                System.out.println("Player : " + player.getSymbol().getCharacter() + " won the game!");
                this.winner = player;
                this.gameStatus = GameStatus.ENDED;
                break;
            }
        }
        // game draw if all cells are filled.
        if(moves.size() == board.getSize() * board.getSize()) {
            System.out.println("Game ended in draw!");
            this.gameStatus = GameStatus.DRAW;
        }
    }

    public void undo() {
        if(moves.isEmpty()) {
            throw new EmptyMovesUndoOperationException("No moves yet. Nothing to undo");
        }
        Move move = moves.get(moves.size() - 1);
        move.getCell().clearCell();
        // lastMovedPlayerIndex-1  could be less than 0
        // let's say player count is 2
        // 0 1
        // if it is player 0's turn and we undo previous move
        // then lastMovedPlayerIndex should be 1
        // if it is player 1's turn and we undo previous move
        // then lastMovedPlayerIndex should be 0
        // How to calculate lastMovedPlayerIndex?
        lastMovedPlayerIndex = (lastMovedPlayerIndex - 1 + players.size()) % players.size();
        this.moves.remove(moves.size() - 1);
    }

    public static GameBuilder builder() {
        return new GameBuilder();
    }

    public void display() {
        board.print();
    }

    public static class GameBuilder {
        List<Player> players = new ArrayList<>();
//        List<Move> moves = new ArrayList<>(); should not take from client
        //Board board;// we won't take the Board from Client, we will take the size only
        private int size;
        // and create the board ourself
        List<GameWinningStrategy> gameWinningStrategies = new ArrayList<>();

//        private int lastMovedPlayerIndex; We won't take from client
//        private GameStatus gameStatus; should not take from client
//        private Player winner;// should not take from client

        public GameBuilder addPlayer(Player player) { // provide an add method so client can add players one by one
            this.players.add(player);
            return this;
        }
        public GameBuilder addPlayers(List<Player> players) { // provide an add method so client can add players one by one
            this.players.addAll(players);
            return this;
        }


        public GameBuilder addGameWinningStrategy(GameWinningStrategy gameWinningStrategy) {
            this.gameWinningStrategies.add(gameWinningStrategy);
            return this;
        }
        public GameBuilder addGameWinningStrategies(List<GameWinningStrategy> gameWinningStrategies) {
            this.gameWinningStrategies.addAll(gameWinningStrategies);
            return this;
        }

        public GameBuilder withBoardSize(int size) {
            this.size = size;
            return this;
        }
        public Game build() {
            validateSingleBot();
            // add more validations for player list size < 2 etc.
            Game game = new Game();
            game.players = this.players;
            game.board = new Board(this.size);
            game.gameWinningStrategies.addAll(this.gameWinningStrategies);
            return game;
        }

        private void validateSingleBot() {
            if(players.stream().filter(player -> player.getPlayerType().equals(PlayerType.BOT))
                    .collect(Collectors.toList()).size() > 1) {
                throw new MultipleBotsException("Multiple bots not allowed in a game");
            }
        }
    }

    public GameStatus getGameStatus() {
        return gameStatus;
    }

    public Player getWinner() {
        return winner;
    }
}
