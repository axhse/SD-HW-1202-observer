package service;

import model.GameInfo;
import service.abstraction.IObservable;
import service.abstraction.IObserver;
import service.utils.ThreadingUtils;

import java.util.ArrayList;

public class GameCenter implements IObservable {
    private ArrayList < IObserver > observers = new ArrayList < IObserver > ();
    private GameInfo lastReleasedGameInfo;

    @Override
    public void notifyObservers() {
        for (IObserver observer: observers) {
            ThreadingUtils.sleep(1000);
            observer.update(lastReleasedGameInfo);
        }
        ThreadingUtils.sleep(1000);
    }

    @Override
    public void registerObserver(IObserver observer) {
        if (!observers.contains(observer)) {
            observers.add(observer);
        }
    }

    @Override
    public void removeObserver(IObserver observer) {
        observers.remove(observer);
    }

    void addGameInfo(GameInfo gameInfo) {
        lastReleasedGameInfo = gameInfo;
    }
}