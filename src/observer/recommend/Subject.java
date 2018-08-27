package observer.recommend;

import java.util.List;

abstract class Subject {
     List<Observer> observers;

    Subject(List<Observer> observers) {
        this.observers=observers;
    }

    void attach(Observer observer) {
        observers.add(observer);
    }

    void detach(Observer observer) {
        observers.remove(observer);
    }

    void notifyObserver() {
        for (Observer observer: observers) {
            observer.update();
        }
    }

}
