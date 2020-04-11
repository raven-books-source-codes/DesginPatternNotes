package desginpattern.observer;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Raven
 * @version 1.0
 * @date 2020/4/11 10:52
 */
public class WeatherData implements Subject {
    private double temperature;
    private double humidity;
    private List<Observer> observers = new LinkedList<>();


    public WeatherData(double temperature, double humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
    }

    @Override
    public String toString() {
        return "WeatherData{" +
                "temperature=" + temperature +
                ", humidity=" + humidity +
                '}';
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getHumidity() {
        return humidity;
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;
    }

    public void setData(double temperature,double humidity){
        this.temperature = temperature;
        this.humidity = humidity;
        notifyObservers();
    }


    @Override
    public void registerObserver(Observer observer) {
            if(!observers.contains(observer)){
                observers.add(observer);
            }
    }

    @Override
    public void remoteObserver(Observer observer) {
        if(observers.contains(observer)){
            observers.remove(observer);
        }
    }

    @Override
    public void notifyObservers() {
        observers.forEach(v -> v.update(this));
    }
}
