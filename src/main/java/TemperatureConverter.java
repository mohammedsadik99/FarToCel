public class TemperatureConverter {

    public static float farToCel(float far) {
        return (far - 32) * 5 / 9;
    }

    public static float celToFar(float cel) {
        return cel * 9 / 5 + 32;
    }

    public static float kelvinToCel(float kel) {
        return kel - 273.15f;
    }

    public static float kelvinToFar(float kel) {
        return (kel - 273.15f) * (9.0f / 5.0f) + 32;
    }
}
