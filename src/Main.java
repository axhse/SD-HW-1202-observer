import service.*;
import service.gamebuilders.FortniteBuilder;
import service.gamebuilders.TetrisBuilder;

public class Main {
    public static void main(String[] args) {
        GameCenter gameCenter = new GameCenter();
        Journalists journalists = new Journalists();
        gameCenter.registerObserver(new Gamers());
        gameCenter.registerObserver(journalists);
        gameCenter.registerObserver(new Developers());
        GameFactory gameFactory = new GameFactory(gameCenter);
        gameFactory.developGame(new FortniteBuilder());
        // No press anymore.
        gameCenter.removeObserver(journalists);
        gameFactory.developGame(new TetrisBuilder());
    }
}
