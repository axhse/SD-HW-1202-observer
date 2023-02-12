package service.abstraction;

public interface IObservable {
    void notifyObservers();
    void registerObserver(IObserver observer);
    void removeObserver(IObserver observer);
}