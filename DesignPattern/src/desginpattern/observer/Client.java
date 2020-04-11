package desginpattern.observer;

/**
 * @author Raven
 * @version 1.0
 * @date 2020/4/11 11:00
 */
public class Client {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData(30,10.0);
        Observer baidu = new Baidu();
        Observer sinda = new Sina();
        weatherData.registerObserver(baidu);
        weatherData.registerObserver(sinda);
        // when data changes
        weatherData.setData(31,15);
        // remove baidu
        weatherData.remoteObserver(baidu);
        // when data changes again
        weatherData.setData(30,12);
    }
}
