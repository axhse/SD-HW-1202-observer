package service;

import model.GameInfo;
import service.utils.ThreadingUtils;
import service.gamebuilders.*;

public class GameFactory {
    private GameCenter gameCenter;

    public GameFactory(GameCenter gameCenter) {
        this.gameCenter = gameCenter;
    }

    public void developGame(IGameInfoBuilder builder) {
        GameInfo gameInfo = builder.build();

        System.out.print("\u001B[95m");
        System.out.println(String.format("\nDeveloping %s...", gameInfo.name));
        ThreadingUtils.sleep(1500);
        System.out.println(String.format("Released: %s", gameInfo.name));
        System.out.print("\u001B[0m");

        gameCenter.addGameInfo(gameInfo);
        gameCenter.notifyObservers();
    }
}