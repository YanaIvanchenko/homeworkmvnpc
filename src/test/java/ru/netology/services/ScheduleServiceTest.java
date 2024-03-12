package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import ru.netology.services.ScheduleService;

public class ScheduleServiceTest {

    @Test
    public void testMinIncome() {
        ScheduleService service = new ScheduleService();

        int expected = 3;
        int actual = service.calcCount(10_000, 3_000, 20_000);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testMaxIncome() {
        ScheduleService service = new ScheduleService();

        int expected = 2;
        int actual = service.calcCount(100_000, 60_000, 150_000);

        Assertions.assertEquals(expected, actual);

    }


    @ParameterizedTest
    @CsvFileSource(files="src/test/resources/schedule.csv")
    public void testMinIncome(int expected, int income, int expenses, int threshold) {
        ScheduleService service = new ScheduleService();

        //int expected = 3;
        int actual = service.calcCount(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);

    }


}
