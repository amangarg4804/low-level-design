package lowleveldesign.tictactoe;

import java.util.List;
import java.util.Scanner;

public class GameTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose Player 1 name: ");
        String player1Name = sc.next();
        System.out.println("Choose Player 1 character: ");
        String player1Char = sc.next();
        Player player1 = new Player()
                .setName(player1Name)
                .setCharacter(player1Char);
        System.out.println("Choose Player 2 name: ");
        String player2Name = sc.next();
        System.out.println("Choose Player 2 character: ");
        String player2Char = sc.next();
        Player player2 = new Player()
                .setName(player2Name)
                .setCharacter(player2Char);
        System.out.println("Choose board size: ");
        int boardSize = sc.nextInt();
        Board board = new Board(boardSize);
        Game game = new Game(List.of(player1, player2), board);
        game.play(sc);
        // TODO: 1. Builder pattern
        // TODO: validation for single character
        // TODO: Validation for choosing grid
    }
}
