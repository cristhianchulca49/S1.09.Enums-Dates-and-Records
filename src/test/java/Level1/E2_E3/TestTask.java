package Level1.E2_E3;

import org.junit.Test;

import static org.junit.Assert.*;

public class TestTask {
    @Test
    public void testCheckBattery() {
        assertEquals("LOW BATTERY: cannot star the car", Task.checkBattery(Level.LOW));
        assertEquals("MEDIUM BATTERY: starting eco mode", Task.checkBattery(Level.MEDIUM));
        assertEquals("HIGH BATTERY: starting car", Task.checkBattery(Level.HIGH));
    }
}