package Level1.E2_E3;

import org.junit.Test;

import static org.junit.Assert.*;

public class TestTask {
    @Test
    public void testCheckBattery() {
        assertEquals("LOW BATTERY: cannot star the car", Task.checkBattery(Level.LOW));
        assertEquals("MEDIUM BATTERY: can only star only eco mode", Task.checkBattery(Level.MEDIUM));
        assertEquals("HIGH BATTERY: can start in power mode", Task.checkBattery(Level.HIGH));
    }
}