package com.kodilla.patterns2.observer.homework;

public interface Observable {
    void registerObserver(Mentor mentor);
    void notifyObservers();
    void removeObserver(Mentor mentor);

}
