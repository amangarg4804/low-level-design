package lowleveldesign.designproblems.tictactoe2.model;

import java.util.Scanner;

public class HumanPlayer extends Player {
    public HumanPlayer(Symbol symbol) {
        super(symbol, PlayerType.HUMAN);
    }

    @Override
    public Move calculateMove(Board board) {
        System.out.println("Enter row number starting with 1");
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        System.out.println("Enter col number starting with 1");
        int col = sc.nextInt();
        Move move = new Move()
                .setPlayer(this)
                .setCell(board.getCell(row-1,col-1))
                .setSymbol(this.getSymbol());
        return move;
    }
}
