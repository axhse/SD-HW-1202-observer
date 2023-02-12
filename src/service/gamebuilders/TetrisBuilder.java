package service.gamebuilders;

import model.AchievementInfo;
import model.GameInfo;
import model.GameTechnicalInfo;

import java.util.ArrayList;

public class TetrisBuilder implements IGameInfoBuilder {
    @Override
    public GameInfo build() {
        GameInfo gameInfo = new GameInfo();
        gameInfo.name = "TetrisUltimate";
        gameInfo.description = "The best way to spend your life.";
        AchievementInfo achievementInfo = new AchievementInfo();
        achievementInfo.name = "World greatest nerd";
        achievementInfo.taskDescription = "Spend 0.001 seconds in game.";
        gameInfo.achievements = new ArrayList < AchievementInfo > ();
        gameInfo.achievements.add(achievementInfo);
        GameTechnicalInfo technicalInfo = new GameTechnicalInfo();
        technicalInfo.isSupportedOnPlaystation4 = true;
        technicalInfo.isSupportedOnWindows10 = true;
        technicalInfo.windowsHddSize = 0.6;
        technicalInfo.windowsRequiredCpu = 2;
        gameInfo.technicalInfo = technicalInfo;
        return gameInfo;
    }
}