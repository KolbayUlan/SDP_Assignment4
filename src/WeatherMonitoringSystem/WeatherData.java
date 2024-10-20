package WeatherMonitoringSystem;

public class WeatherData {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();

        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay();
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay();
        ForecastDisplay forecastDisplay = new ForecastDisplay();

        weatherStation.addDisplay(currentDisplay);
        weatherStation.addDisplay(statisticsDisplay);
        weatherStation.addDisplay(forecastDisplay);

        weatherStation.setWeatherData(30f, 65f, 1010f);
        weatherStation.setWeatherData(35f, 70f, 1005f);
        weatherStation.setWeatherData(38f, 60f, 1008f);
    }
}

