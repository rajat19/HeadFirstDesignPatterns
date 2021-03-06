package com.hfdp.behavioural.observer.display;

import com.hfdp.behavioural.observer.DisplayElement;
import com.hfdp.behavioural.observer.Observer;
import com.hfdp.behavioural.observer.WeatherData;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;

    public CurrentConditionsDisplay(WeatherData weatherData) {
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.printf("Current Conditions: %f F degrees and %f cent humidity\n", temperature, humidity);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }
}
