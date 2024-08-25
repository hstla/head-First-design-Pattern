package chapter02.weather.step01;

public interface Observer {
    public void update(float temp, float humidity, float pressure);
}
