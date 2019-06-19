package weather;// package	weatherprovider;

import weather.Coordinates;

public class WeatherProvider {

    private static String[] weather;
    private static  WeatherProvider weatherProvider;

    private WeatherProvider() {

        this.weather = new String[] {"RAIN", "FOG", "SUN", "SNOW"};
	}
	
//	public	static	WeatherProvider getProvider() {
//
//		return WeatherProvider;
//	}

//	public String getCurrentWeather(Coordinates coordinates) {
//
//    }
}