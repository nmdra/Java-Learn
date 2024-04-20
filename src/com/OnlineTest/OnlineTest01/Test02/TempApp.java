package OnlineTest.OnlineTest01.Test02;

import java.util.Scanner;

public class TempApp {
    public static void main(String[] args) {
        TemperatureConverter convertCel = new TemperatureConverter();
        TemperatureConverter convertFar = new TemperatureConverter();
        double Cel, Far;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter The temperature in celsius: ");
        Far = convertCel.celsiusToFahrenheit(sc.nextDouble());

        System.out.print("Enter The Temperature in fahrenheit: ");
        Cel = convertFar.FahrenheitToCelsius(sc.nextDouble());

        System.out.println(convertCel.getTemperature() +
                " Celsius is equal to " + Far + " Fahrenheit" );

        System.out.println(convertFar.getTemperature() +
                " Celsius is equal to " + Cel + " Fahrenheit" );
    }
}
