package com.company;

public class Main {

    public static void main(String[] args) {
        TemperatureConverter temperatureConverter = new TemperatureConverter(20,280,95);
        temperatureConverter.convertCelsiusToFahrenheit();
        temperatureConverter.convertCelsiusToKelvin();
        temperatureConverter.convertFahrenheitToCelsius();
        temperatureConverter.convertFahrenheitToKelvin();
        temperatureConverter.convertKelvinToCelsius();
        temperatureConverter.convertKelvinToFahrenheit();

    }
}
