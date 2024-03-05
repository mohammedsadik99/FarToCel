public class App {
    public static void main(String[] args) {
        float kelvinTemp = 300.1f;
        float celsiusTemp = TemperatureConverter.kelvinToCel(kelvinTemp);
        float fahrenheitTemp = TemperatureConverter.kelvinToFar(kelvinTemp);
        System.out.println(kelvinTemp + " Kelvin is equal to " + celsiusTemp + " Celsius.");
        System.out.println(kelvinTemp + " Kelvin is equal to " + fahrenheitTemp + " Fahrenheit.");
    }
}
