package ru.netology.service;

import org.junit.Test;
import org.junit.Assert;

public class CashbackHackServiceTest {

    public CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldFindRemain() {
        int amount = 900;
        int expected = 100;
        int actual = service.remain(amount);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldFindRemainIfAmountEqualsBoundary() {
        int amount = 1000;
        int expected = 0;
        int actual = service.remain(amount);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldFindRemainIfAmountAboveBoundary() {
        int amount = 1100;
        int expected = 900;
        int actual = service.remain(amount);
        Assert.assertEquals(actual, expected);
    }
}
