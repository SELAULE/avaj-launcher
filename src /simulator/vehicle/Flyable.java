package simulator.vehicle;

import weather.WeatherTower;

public  interface Flyable {
    public  void    updateConditions();
    public  void    registerTower(WeatherTower WeatherTower);
}