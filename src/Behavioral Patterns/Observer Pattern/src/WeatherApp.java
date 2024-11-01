// WeatherApp.java
// Main class to simulate the weather station and display.
import java.util.Scanner;

public class WeatherApp {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation(); // Create a weather station
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherStation);

        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("1. Update weather data");
            System.out.println("2. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter temperature (°C): ");
                    float temperature = scanner.nextFloat();
                    System.out.print("Enter humidity (%): ");
                    float humidity = scanner.nextFloat();
                    weatherStation.setWeatherData(temperature, humidity);
                    break;
                case 2:
                    running = false;
                    System.out.println("Exiting..."); // Exit message
                    break;
                default:
                    System.out.println("Invalid option. Please try again."); // Handle invalid input
                    break;
            }
        }
        scanner.close();
    }
}
