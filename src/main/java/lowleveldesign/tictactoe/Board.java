package lowleveldesign.tictactoe;

public class Board {
    String[][] grid;
    int boardSize;
    int remaining;

    public Board(int boardSize) {
        this.boardSize = boardSize;
        this.grid = new String[boardSize][boardSize];
        remaining = boardSize * boardSize;
        for(int row =0; row < boardSize; row++) {
            for(int col =0; col < boardSize; col++) {
                grid[row][col] = "_";
            }
        }
    }

    // box is marked as following:
    //A1    A2    A3
    //B1    B2    B3
    //C1    C2    C3
    public void insert(String box, String character) {
        int row = box.charAt(0) -'A';
        int col = box.charAt(1) -'1';
        grid[row][col] = character;
        remaining--;
    }

    public void printBoard() {
        for(int row =0; row < boardSize; row++) {
            for(int col =0; col < boardSize; col++) {
                System.out.print(grid[row][col] + " ");
            }
            System.out.println();
        }
    }
}
