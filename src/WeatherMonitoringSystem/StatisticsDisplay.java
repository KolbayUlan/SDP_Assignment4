package WeatherMonitoringSystem;

public class StatisticsDisplay implements WeatherDisplay {
    private float maxTemperature = Float.MIN_VALUE;
    private float minTemperature = Float.MAX_VALUE;
    private float sumTemperature = 0;
    private int numReadings = 0;

    @Override
    public void update(float temperature, float humidity, float pressure) {
        numReadings++;
        sumTemperature += temperature;
        maxTemperature = Math.max(maxTemperature, temperature);
        minTemperature = Math.min(minTemperature, temperature);
        display();
    }

    public void display() {
        System.out.println("Avg/Max/Min temperature = " + (sumTemperature / numReadings) + "/" + maxTemperature + "/" + minTemperature);
    }
}

