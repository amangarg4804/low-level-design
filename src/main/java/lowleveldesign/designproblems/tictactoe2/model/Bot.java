package lowleveldesign.designproblems.tictactoe2.model;

import lowleveldesign.designproblems.tictactoe2.factory.botplayingstrategyfactory.BotPlayingStrategyFactory;
import lowleveldesign.designproblems.tictactoe2.strategy.botplayingstrategy.BotPlayingStrategy;

public class Bot extends Player {

    private BotDifficultyLevel botDifficultyLevel;
    private BotPlayingStrategy botPlayingStrategy;

    public Bot(Symbol symbol, BotDifficultyLevel botDifficultyLevel) {
        super(symbol, PlayerType.BOT);
        this.botDifficultyLevel = botDifficultyLevel;
        this.botPlayingStrategy =  BotPlayingStrategyFactory.createBotPlayingStrategy(botDifficultyLevel);
    }

    @Override
    public Move calculateMove(Board board) {
        return botPlayingStrategy.calculateNextMove(board, this);
    }
}
