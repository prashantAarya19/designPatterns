package designPatterns.behavioral.observer;

public class Client {
    public static void main(String[] args) {
        WeatherData subject = new WeatherData();
        new CurrentConditionDisplay(subject);
        new StatisticDisplay(subject);
        subject.measurementsChanged(
                80,65,30.4f);
        subject.measurementsChanged(
                82,65,30.4f);
    }
}
