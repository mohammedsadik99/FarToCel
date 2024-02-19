public class TemperatureConverter {

    public static float farToCel(float far) {
        return (far - 32) * 5 / 9;
    }

    public static float kelvinToCel(float kel) {
        return (float) (kel - 273.15);
    }
}
