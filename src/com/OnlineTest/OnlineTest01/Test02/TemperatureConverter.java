package OnlineTest.OnlineTest01.Test02;

public class TemperatureConverter {
    protected double temperature;

    public TemperatureConverter() {
        this.temperature = 0;
    }

    public double getTemperature() {
        return temperature;
    }

    public double celsiusToFahrenheit(double temperature){
        this.temperature = temperature;

        return (temperature * 9/5) + 32;
    }
    public double FahrenheitToCelsius(double temperature){
        this.temperature = temperature;

        return (temperature - 32) * 5/9;
    }
}

