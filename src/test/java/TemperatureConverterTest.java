import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TemperatureConverterTest {

    @Test
    public void testFarToCel() {
        float fahrenheit = 100;
        float expectedCelsius = 37.77778f;
        float actualCelsius = TemperatureConverter.farToCel(fahrenheit);
        assertEquals(expectedCelsius, actualCelsius, 0.0001);
    }

    @Test
    public void testKelvinToCel() {
        float kelvin = 273.15f;
        float expectedCelsius = 0;
        float actualCelsius = TemperatureConverter.kelvinToCel(kelvin);
        assertEquals(expectedCelsius, actualCelsius, 0.0001);
    }
}
