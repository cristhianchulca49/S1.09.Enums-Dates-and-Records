package Level1.E3;

import org.junit.Test;

import static org.junit.Assert.*;

public class TestCarServices {
    @Test
    public void testCheckBattery() {
        int percentLow = 33;
        int percentMedium = 50;
        int percentHigh = 100;

        assertEquals("LOW BATTERY: cannot start the car", CarServices.checkBattery(percentLow));
        assertEquals("MEDIUM BATTERY: can only start in eco mode", CarServices.checkBattery(percentMedium));
        assertEquals("HIGH BATTERY: can start in power mode", CarServices.checkBattery(percentHigh));
    }

    @Test
    public void testStartCar() {
        int percentLow = 33;
        int percentMedium = 50;
        int percentHigh = 100;

        assertFalse(CarServices.startCar(percentLow));
        assertTrue(CarServices.startCar(percentMedium));
        assertTrue(CarServices.startCar(percentHigh));
    }
}
