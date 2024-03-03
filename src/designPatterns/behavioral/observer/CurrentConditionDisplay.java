package designPatterns.behavioral.observer;

public class CurrentConditionDisplay implements Observer, DisplayElement
{
    private float temperature;
    private float humidity;

    private float pressure;
    private final Subject weatherData;

    public CurrentConditionDisplay(Subject weatherData)
    {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(Subject subject)
    {
        if (subject instanceof WeatherData)
        {
            WeatherData weatherData = (WeatherData) subject;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            this.pressure = weatherData.getPressure();
            display();
        }
    }

    @Override
    public void remove() {
        weatherData.removeObserver(this);
    }

    public void display()
    {
        System.out.println("Current conditions: " + temperature
                + "F degrees and " + humidity + "% humidity"+ " pressure " + pressure);
    }
}
