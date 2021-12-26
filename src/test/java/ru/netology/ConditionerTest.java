package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ConditionerTest {
    @Test
    public void shouldRememberNewTemperature() {
        Conditioner cond = new Conditioner();

        cond.setCurrentTemperature(28);
        cond.setToMaxTemp();
        cond.setIncrease30p();

        int expected = 39;
        int actual = cond.getCurrentTemperature();

        assertEquals(expected, actual);
    }
}