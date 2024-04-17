package lowleveldesign.designproblems.tictactoe2.factory.botplayingstrategyfactory;

import lowleveldesign.designproblems.tictactoe2.model.BotDifficultyLevel;
import lowleveldesign.designproblems.tictactoe2.strategy.botplayingstrategy.BotPlayingStrategy;
import lowleveldesign.designproblems.tictactoe2.strategy.botplayingstrategy.RandomBotPlayingStrategy;

public class BotPlayingStrategyFactory {

    public static BotPlayingStrategy createBotPlayingStrategy(BotDifficultyLevel botDifficultyLevel) {
        switch (botDifficultyLevel) {
            case EASY:
                return new RandomBotPlayingStrategy(); // for now, all cases return same strategy
            case MEDIUM:
                return new RandomBotPlayingStrategy();
            case HARD:
                return new RandomBotPlayingStrategy();
            default:
                return new RandomBotPlayingStrategy();
        }
    }
}
