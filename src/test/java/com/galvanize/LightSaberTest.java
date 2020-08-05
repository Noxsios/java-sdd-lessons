package com.galvanize;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class LightSaberTest {
    @Test
    public void testGetCharge(){
        // setup
        LightSaber luke = new LightSaber(123);
        // exe
        float actual = luke.getCharge();
        // assertion
        assertEquals(100.0f,actual);
    }
    @Test
    public void testSetCharge(){
        LightSaber luke = new LightSaber(123);
        luke.setCharge(105.0f);
        float actual = luke.getCharge();
        assertEquals(105.0f,actual);
    }
    @Test
    public void testGetColor() {
        LightSaber luke = new LightSaber(123);
        String actual = luke.getColor();
        assertEquals("green",actual);
    }
    @Test
    public void testSetColor(){
        LightSaber luke = new LightSaber(123);
        String newColor = "blue";
        luke.setColor(newColor);
        assertEquals(newColor,luke.getColor());
    }
    @Test
    public void testGetSerialNumber() {
        LightSaber luke = new LightSaber(123);
        long expected = 123;
        assertEquals(expected, luke.getJediSerialNumber());
    }
    @Test
    public void testUse() {
        LightSaber luke = new LightSaber(123);
        luke.use(6);
        float expected = 99.0f;
        assertEquals(expected,luke.getCharge());
    }
    @Test
    public void testMinutes(){
        LightSaber luke = new LightSaber(123);
        float initialMinutes = luke.getRemainingMinutes();
        luke.use(6);
        float expected = initialMinutes - 6;
        assertEquals(expected,luke.getRemainingMinutes());
    }
    @Test
    public void testRecharge() {
        LightSaber luke = new LightSaber(123);
        float initialCharge = luke.getCharge();
        luke.use(6);
        luke.recharge();
        assertEquals(initialCharge,luke.getCharge());
    }
}
