package service;

        import model.AchievementInfo;
        import model.GameInfo;
        import service.abstraction.IObserver;
        import service.utils.ThreadingUtils;

public class Gamers implements IObserver {
    @Override
    public void update(Object object) {
        celebrateGameRelease((GameInfo) object);
    }

    private void celebrateGameRelease(GameInfo gameInfo) {
        if (gameInfo == null || gameInfo.name == null) {
            return;
        }
        System.out.println("\u001B[96m\nGamers' celebration:\n\u001B[94m");
        ThreadingUtils.sleep(1000);
        if (gameInfo.name.equals("Fortnite")) {
            System.out.println("it's as good as Fortnite!\n");
        } else {
            System.out.println("it's worse than Fortnite.\n");
        }
        ThreadingUtils.sleep(300);
        for (int i = 0; i < 6; ++i) {
            ThreadingUtils.sleep(350);
            System.out.print(gameInfo.name + "  ");
        }
        ThreadingUtils.sleep(700);
        System.out.println("\n");
        if (gameInfo.achievements != null && !gameInfo.achievements.isEmpty()) {
            AchievementInfo achievementInfo = gameInfo.achievements.get(0);
            if (achievementInfo.name != null && achievementInfo.taskDescription != null) {
                System.out.println(
                        String.format(
                                "i'll certainly receive \"%s\" tonight",
                                achievementInfo.name
                        )
                );
                System.out.println(
                        String.format(
                                "the task is really easy: \"%s\"",
                                achievementInfo.taskDescription
                        )
                );
            }
        }
        System.out.print("\u001B[0m");
    }
}