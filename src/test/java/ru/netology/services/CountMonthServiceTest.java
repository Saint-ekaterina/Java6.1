package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class CountMonthServiceTest {

    @ParameterizedTest
    @CsvFileSource(files="src/test/resources/month.csv")
    public void RestCalculated (int expected, int income, int expense, int threshold) {
        CountMonthService service = new CountMonthService();

        int actual = service.calculate(income, expense, threshold);

        Assertions.assertEquals(expected, actual);
    }

}
