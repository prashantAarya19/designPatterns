package designPatterns.behavioral.observer;

public class StatisticDisplay implements Observer, DisplayElement{
    private float prevTemperature;
    private float currentTemperature;

    private final Subject subject;

    public StatisticDisplay(Subject subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }
    @Override
    public void display() {
        System.out.print("Temperature Statistic => ");
        if(prevTemperature > 0.0f)
        System.out.print("Prev temperature : "+prevTemperature+" ");
        System.out.print("Current temperature : "+currentTemperature+"\n");
    }

    @Override
    public void update(Subject subject) {
        if(subject instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) subject;
            this.prevTemperature = currentTemperature;
            this.currentTemperature = weatherData.getTemperature();
            display();
        }
    }

    @Override
    public void remove() {
        subject.removeObserver(this);
    }
}
