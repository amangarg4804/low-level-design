package lowleveldesign.designproblems.tictactoe2.strategy.botplayingstrategy;

import lowleveldesign.designproblems.tictactoe2.model.*;

public class RandomBotPlayingStrategy implements BotPlayingStrategy{
    @Override
    public Move calculateNextMove(Board board, Player player) {
        // whenever random bot finds empty cell, it puts the symbol there
        for(int row=0; row< board.getSize(); row++) {
            for(int col=0; col< board.getSize(); col++) {
                if(board.getCell(row, col).isEmpty()) {// notice that we don't do a null check.
                    // instead we add a method in Cell class. This is helpful because the definition of Empty could change in the future.
                    // Maybe an empty cell is one with char '_' in future
                    // similarly we have a getCell method. We can use an arraylist of array or any data structure in board class to store cells and the client doesn't have to know about
                    return new Move()
                            .setCell(board.getCell(row, col))
                            .setSymbol(player.getSymbol())
                            .setPlayer(player);
                }
            }
        }
        return null;
    }
}
