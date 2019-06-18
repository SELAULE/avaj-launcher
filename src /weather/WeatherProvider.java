// package	weatherprovider;

public class WeatherProvider {

    private static String[] weather;

    private WeatherProvider() {
        this.weather = new String[] {"RAIN", "FOG", "SUN", "SNOW"};
	}
	
	public	static	WeatherProvider getProvider() {

		return WeatherProvider;
	}
}