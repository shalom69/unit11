package ru.netology.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashbackHackServiceTest {
    @Test
    public void ShouldReturnZero() {

        CashbackHackService service = new CashbackHackService();
        int expected = 0;
        int amount = 1000;
        int actual = service.remain(amount);

        assertEquals(actual,expected);
    }

    @Test
    public void ShouldReturnHundred() {
        CashbackHackService service = new CashbackHackService();
        int expected = 100;
        int amount = 900;
        int actual = service.remain(amount);

        assertEquals(expected,actual);
    }

}