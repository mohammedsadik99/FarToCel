public class TemperatureConverter {

    public static float farToCel(float far){
        return (far - 32) * 5 / 9;
    }

    public static float kelvinToCel(float kel){
        return (float) (kel - 273.15);
    }

    public static void main(String[] args) {
        // Test farToCel function
        float fahrenheit = 100;
        float expectedCelsius = 37.77778f;
        float actualCelsius = farToCel(fahrenheit);
        System.out.println("Fahrenheit to Celsius:");
        System.out.println("Expected: " + expectedCelsius);
        System.out.println("Actual: " + actualCelsius);

        // Test kelvinToCel function
        float kelvin = 273.15f;
        float expectedCelsiusFromKelvin = 0;
        float actualCelsiusFromKelvin = kelvinToCel(kelvin);
        System.out.println("\nKelvin to Celsius:");
        System.out.println("Expected: " + expectedCelsiusFromKelvin);
        System.out.println("Actual: " + actualCelsiusFromKelvin);
    }
}
