package Level1.E2;

import org.junit.Test;


import static org.junit.Assert.assertEquals;

public class TestTask {
    @Test
    public void testCheckBattery() {
        assertEquals("LOW BATTERY: cannot start the car", Task.checkBattery(Level.LOW));
        assertEquals("MEDIUM BATTERY: can only start in eco mode", Task.checkBattery(Level.MEDIUM));
        assertEquals("HIGH BATTERY: can start in power mode", Task.checkBattery(Level.HIGH));
    }
}