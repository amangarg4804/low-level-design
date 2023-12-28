package lowleveldesign.tictactoe;

import java.util.List;
import java.util.Scanner;

//https://github.com/amangarg4804/low-level-design-problem/blob/main/problems/01-tic-tac-toe.md
public class GameTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose Player 1 name: ");
        String player1Name = sc.next();

        String player1Char=null;
        while (player1Char==null || player1Char.length()!=1) {
            System.out.println("Choose Player 1 character: ");
            player1Char = sc.next();
            if (player1Char.length() != 1) {
                System.out.println("Please enter exactly one character.");
            }
        }

        Player player1 = new PlayerBuilder()
                .setName(player1Name)
                .setCharacter(player1Char)
                .build();
        System.out.println("Choose Player 2 name: ");
        String player2Name = sc.next();
        String player2Char;
        do {
            System.out.println("Choose Player 2 character:");
            player2Char = sc.next();
            if (player2Char.length() != 1) {
                System.out.println("Please enter exactly one character.");
            }
        } while (player2Char.length() != 1);
        Player player2 = new PlayerBuilder()
                .setName(player2Name)
                .setCharacter(player2Char)
                .build();
        System.out.println("Choose board size: ");
        int boardSize = sc.nextInt();
        Board board = new Board(boardSize);
        Game game = new Game(List.of(player1, player2), board);
        game.play(sc);
    }
}
