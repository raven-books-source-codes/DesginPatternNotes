package desginpattern.observer;

/**
 * @author Raven
 * @version 1.0
 * @date 2020/4/11 10:53
 */
public interface Subject {
    void registerObserver(Observer observer);
    void remoteObserver(Observer observer);
    void notifyObservers();
}
