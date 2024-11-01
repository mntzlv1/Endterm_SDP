// WeatherStation.java
// Class representing the weather station that notifies observers.


import java.util.ArrayList;
import java.util.List;

class WeatherStation implements WeatherSubject {
    private List<WeatherObserver> observers;
    private float temperature;
    private float humidity;

    public WeatherStation() { // Constructor
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(WeatherObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(WeatherObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (WeatherObserver observer : observers) {
            observer.update(temperature, humidity);
        }
    }

    public void setWeatherData(float temperature, float humidity) { // Set weather data
        this.temperature = temperature; // Update temperature
        this.humidity = humidity; // Update humidity
        notifyObservers();
    }
}
