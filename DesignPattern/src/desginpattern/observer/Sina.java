package desginpattern.observer;

/**
 * @author Raven
 * @version 1.0
 * @date 2020/4/11 11:01
 */
public class Sina implements Observer{

    public void display(WeatherData weatherData){
        System.out.println("sina:");
        System.out.println(weatherData);
    }

    @Override
    public void update(Subject subject) {
        if(subject instanceof WeatherData){
            display((WeatherData) subject);
        }
    }
}
