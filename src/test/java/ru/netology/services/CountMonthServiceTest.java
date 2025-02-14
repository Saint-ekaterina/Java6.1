package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class CountMonthServiceTest {


    @Test
    public void testCashCountMonthServiceRich() {
        CountMonthService service = new CountMonthService();
        int expected = 2;
        int income = 100_000; // доход от работы
        int expenses = 60_000; // обязательные месячные траты
        int threshold = 150_000; // есть возможность отдохнуть

        int actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testCashCountMonthService() {
        CountMonthService service = new CountMonthService();
        int expected = 3;
        int income = 10_000; // доход от работы
        int expenses = 3_000; // обязательные месячные траты
        int threshold = 20_000; // есть возможность отдохнуть
        int actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }
}
