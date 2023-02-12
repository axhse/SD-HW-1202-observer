package service.gamebuilders;

import model.AchievementInfo;
import model.GameInfo;
import model.GameTechnicalInfo;

import java.util.ArrayList;

public class FortniteBuilder implements IGameInfoBuilder {
    @Override
    public GameInfo build() {
        GameInfo gameInfo = new GameInfo();
        gameInfo.name = "Fortnite";
        gameInfo.description = "The best way to spend your weekends.";
        AchievementInfo achievementInfo = new AchievementInfo();
        achievementInfo.name = "Running wizard";
        achievementInfo.taskDescription = "Win a game.";
        gameInfo.achievements = new ArrayList < AchievementInfo > ();
        gameInfo.achievements.add(achievementInfo);
        GameTechnicalInfo technicalInfo = new GameTechnicalInfo();
        technicalInfo.isSupportedOnPlaystation4 = true;
        technicalInfo.isSupportedOnWindows10 = true;
        technicalInfo.windowsHddSize = 30;
        technicalInfo.windowsRequiredCpu = 8;
        gameInfo.technicalInfo = technicalInfo;
        return gameInfo;
    }
}