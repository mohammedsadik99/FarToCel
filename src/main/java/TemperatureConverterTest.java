import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TemperatureConverterTest {

    @Test
    public void testKelvinToCel() {
        float kelvin = 273.15f;
        float expectedCelsius = 0;
        float actualCelsius = TemperatureConverter.kelvinToCel(kelvin);
        assertEquals(expectedCelsius, actualCelsius, 0.0001);
    }
}
