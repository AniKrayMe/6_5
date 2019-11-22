package com.company;

public class TemperatureConverter {
    private int celsius;
    private int kelvin;
    private int fahrenheit;

    //region Getter and Setter

    public int getCelsius() {
        return celsius;
    }

    public void setCelsius(int celsius) {
        this.celsius = celsius;
    }

    public int getKelvin() {
        return kelvin;
    }

    public void setKelvin(int kelvin) {
        this.kelvin = kelvin;
    }

    public int getFahrenheit() {
        return fahrenheit;
    }

    public void setFahrenheit(int fahrenheit) {
        this.fahrenheit = fahrenheit;
    }
    //endregion

    //region Conversing
    public void convertFahrenheitToCelsius(){
        double result = (this.fahrenheit-32 )*5/9;
        System.out.println(result);
    }
    public void convertFahrenheitToKelvin(){
        double result = (this.fahrenheit - 32)*5/9+273.15;
        System.out.println(result);
    }
    public void convertCelsiusToFahrenheit(){
        double result = (this.celsius*9/5)+32;
        System.out.println(result);
    }
    public void convertCelsiusToKelvin(){
        double result = this.celsius+273.15;
        System.out.println(result);
    }
    public void convertKelvinToFahrenheit(){
        double result = (this.kelvin-273.15)-9/5 +32;
        System.out.println(result);
    }
    public void convertKelvinToCelsius(){
        double result = this.kelvin - 273.15;
        System.out.println(result);
    }
    //endregion

    //region Constructor

    public TemperatureConverter(int celsius, int kelvin, int fahrenheit) {
        this.celsius = celsius;
        this.kelvin = kelvin;
        this.fahrenheit = fahrenheit;
    }

    public TemperatureConverter() {
    }
    //endregion

}
