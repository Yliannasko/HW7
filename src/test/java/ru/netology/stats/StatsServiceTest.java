package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void mustFindLastMonth() {
        StatsService service = new StatsService();

        long[] minMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMinMonth = 9;
        long actualMinMonth = service.minSales(minMonth);

        Assertions.assertEquals(expectedMinMonth, actualMinMonth);
    }

    @Test
    public void sumAllSales() { //сумма всех продаж
        StatsService service = new StatsService();
        long[] allSum = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18;
        long actual = service.sum(allSum);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void averageSumAll() { //ср сумма продаж в месяц
        StatsService service = new StatsService();

        long[] averageSum = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = (8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18) / 12;
        long actual = service.getAverage(averageSum);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void monthMaxSales() { // номер месяца с макс суммой
        StatsService service = new StatsService();

        long[] maxMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMaxMonth = 8;
        long actualMaxMonth = service.minSales(maxMonth);

        Assertions.assertEquals(expectedMaxMonth, actualMaxMonth);
    }

    @Test
    public void monthMinSales() {
        StatsService service = new StatsService();

        long[] minMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMinMonth = 9;
        long actualMinMonth = service.minSales(minMonth);

        Assertions.assertEquals(expectedMinMonth, actualMinMonth);
    }

    @Test
    public void numberMonthAboveAverage() {
        StatsService service = new StatsService();
        long[] counter = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 7;
        long actual = service.minSales(counter);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void numberMonthBelowAverage() {
        StatsService service = new StatsService();
        long[] counter = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 5;
        long actual = service.minSales(counter);

        Assertions.assertEquals(expected, actual);
    }
}

