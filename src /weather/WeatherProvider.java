package weather;

//import weather.Coordinates;

public class WeatherProvider {

    private static String[] weather;
    private static  WeatherProvider weatherProvider;

    private WeatherProvider() {

        this.weather = new String[] {"RAIN", "FOG", "SUN", "SNOW"};
	}
	
	public	static	WeatherProvider getProvider() {

        WeatherProvider weatherProvider = new WeatherProvider();

        return weatherProvider;
	}

	public String getCurrentWeather(Coordinates coordinates) {
        int sum = coordinates.get_height() + coordinates.get_latitude() + coordinates.get_longitude();

        return (weather[sum % 4]);
    }
}