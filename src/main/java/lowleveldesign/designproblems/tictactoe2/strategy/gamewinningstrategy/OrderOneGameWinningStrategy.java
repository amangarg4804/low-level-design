package lowleveldesign.designproblems.tictactoe2.strategy.gamewinningstrategy;

import lowleveldesign.designproblems.tictactoe2.model.Board;
import lowleveldesign.designproblems.tictactoe2.model.Cell;
import lowleveldesign.designproblems.tictactoe2.model.Player;
import lowleveldesign.designproblems.tictactoe2.model.Symbol;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrderOneGameWinningStrategy implements GameWinningStrategy{

    List<Map<Character, Integer>> rows = new ArrayList<>();
    List<Map<Character, Integer>> columns = new ArrayList<>();
    List<Map<Character, Integer>> leftTopToBottomRightDiagonal = new ArrayList<>();



    @Override
    public boolean isGameWon(Board board, Player player, Cell cell) {
        if(rows.isEmpty()) {
         initialize(board);
        }
        int row = cell.getRow();
        int col = cell.getCol();
        rows.get(row).put(cell.getSymbol().getCharacter(), rows.get(row).getOrDefault(cell.getSymbol().getCharacter(), 0) +1);
        columns.get(col).put(cell.getSymbol().getCharacter(), columns.get(col).getOrDefault(cell.getSymbol().getCharacter(), 0) +1);
        System.out.println("Rows: ");
        System.out.println(rows);
        System.out.println("Columns: ");
        System.out.println(columns);
        if(rows.get(row).get(cell.getSymbol().getCharacter()) == board.getSize()) {
            return true;
        }
        if(columns.get(col).get(cell.getSymbol().getCharacter()) == board.getSize()) {
            return true;
        }
        return false;
    }

    private void initialize(Board board) {
        int size = board.getSize();
        for(int i = 0; i < size; i++) {
            rows.add(new HashMap<>());
            columns.add(new HashMap<>());
        }

    }

}
