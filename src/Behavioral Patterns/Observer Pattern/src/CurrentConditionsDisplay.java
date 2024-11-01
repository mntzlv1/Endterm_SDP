// CurrentConditionsDisplay.java
// Class representing a display that shows current weather conditions.
class CurrentConditionsDisplay implements WeatherObserver {
    private float temperature; // Current temperature
    private float humidity; // Current humidity
    private WeatherSubject weatherStation;

    public CurrentConditionsDisplay(WeatherSubject weatherStation) { // Constructor
        this.weatherStation = weatherStation;
        weatherStation.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    public void display() { // Display current conditions
        System.out.println("Current conditions: " + temperature + "°C and " + humidity + "% humidity");
    }
}
