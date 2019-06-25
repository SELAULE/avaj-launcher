package weather;

//import weather.Coordinates;

public class WeatherProvider {

    private static String[] weather = new String[] {"RAIN", "FOG", "SUN", "SNOW"};
    private static WeatherProvider weatherProvider = null;

    private WeatherProvider() { }

    public static WeatherProvider getProvider() {

        if (weatherProvider == null)
        {
            weatherProvider = new WeatherProvider();
        }
        return weatherProvider;
    }


    public String getCurrentWeather(Coordinates coordinates) {
        int sum = coordinates.get_height() + coordinates.get_latitude() + coordinates.get_longitude();

        return (weather[sum % 4]);
    }
}