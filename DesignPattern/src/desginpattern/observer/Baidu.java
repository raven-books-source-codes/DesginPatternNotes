package desginpattern.observer;

/**
 * @author Raven
 * @version 1.0
 * @date 2020/4/11 10:59
 */
public class Baidu implements Observer {

    private void display(WeatherData weatherData){
        System.out.println("baidu:");
        System.out.println(weatherData);
    }

    @Override
    public void update(Subject subject) {
        if(subject instanceof WeatherData){
            display((WeatherData) subject);
        }
    }
}
