package lowleveldesign.tictactoe;

import java.util.List;
import java.util.Scanner;

public class Game {
    private final Board board;
    private final List<Player> players;
    private int currentTurn = 0; //by default, it is 0th player's turn

    private GameState gameState = GameState.IN_PROGRESS;

    public Game(List<Player> players, Board board) { // game can't be initialized without initializing Players and Board
        this.players = players;
        this.board = board;
    }


    public void play(Scanner sc) {
        while (gameState == GameState.IN_PROGRESS) {
            Player player = players.get(currentTurn);
            System.out.println("Player " +  player.getName() + "'s turn: ");
            String box = sc.next();
            if(!board.insert(box, player.getCharacter())) {
                continue;
            }
            board.printBoard();
            if(isWinner(player)) {
                gameState = GameState.END_WINNER;
                System.out.println("Player " + player.getName() + " wins!");

            }
            if(board.remaining==0) {
                gameState = GameState.END_DRAW;
                System.out.println("Game ended in draw!");
            }
            currentTurn = (currentTurn+1)% players.size();
        }
    }

    private boolean isWinner(Player player) {
        int diagonalTopLeftToBottomRightMatch = 0; // this diagonal has indices like (0,0), (1,1), (2,2)
        int diagonalTopRightToBottomLeftMatch = 0; // this diagonal has indices like (0,2), (1,1), (2,0), Row is increasing by 1, column is decreasing by 1

        for(int i = 0; i < board.boardSize; i++) {
            int rowMatch = 0;
            int colMatch = 0;
            for (int j = 0; j < board.boardSize; j++) { // this loop is for matching rows and columns
                if (player.getCharacter().equals(board.grid[i][j])) {
                    rowMatch++;
                }
                if (player.getCharacter().equals(board.grid[j][i])) {
                    colMatch++;
                }
            }
            if (rowMatch == board.boardSize || colMatch == board.boardSize) {
                return true;
            }
            if(player.getCharacter().equals(board.grid[i][i])) {
                diagonalTopLeftToBottomRightMatch++;
            }

            if(player.getCharacter().equals(board.grid[i][board.boardSize-i-1])) {
                diagonalTopRightToBottomLeftMatch++;
            }
         }
        if(diagonalTopLeftToBottomRightMatch==board.boardSize || diagonalTopRightToBottomLeftMatch == board.boardSize) {
            return true;
        }
        return false;
    }
}
