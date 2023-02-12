package service;

import model.GameInfo;
import service.abstraction.IObserver;
import service.utils.ThreadingUtils;

public class Journalists implements IObserver {
    @Override
    public void update(Object object) {
        publishReview((GameInfo) object);
    }

    private void publishReview(GameInfo gameInfo) {
        if (gameInfo == null || gameInfo.description == null) {
            return;
        }
        System.out.println("\u001B[96m\nBREAKING NEWS\n\u001B[94m");
        ThreadingUtils.sleep(1000);
        System.out.println(
                String.format(
                        "New game has been released recently! Some details:\n%s",
                        gameInfo.description
                )
        );
        System.out.print("\u001B[0m");
    }
}