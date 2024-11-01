
// WeatherSubject.java
// Interface for the weather station subject.


import java.util.List;
import java.util.ArrayList;

interface WeatherSubject {
    void registerObserver(WeatherObserver observer); // Method to register an observer
    void removeObserver(WeatherObserver observer); // Method to remove an observer
    void notifyObservers(); // Method to notify all observers
}
