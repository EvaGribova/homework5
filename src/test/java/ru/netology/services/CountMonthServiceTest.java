package ru.netology.services;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;



  //  @ParameterizedTest
    //@CsvSource()
    //public void testCountMonthfirst(int expected, int income, int expenses, int threshold) {
      //  CountMonthService service = new CountMonthService();

        //int actual = service.calculate(income, expenses, threshold);

        //Assertions.assertEquals(expected, actual);
    //}

//}

public class CountMonthServiceTest{

    @Test
    public void testCountMonthFirst() {
        CountMonthService service = new CountMonthService();

        int income = 10_000;
        int expenses = 3_000;
        int threshold = 20_000;
        int expected = 3;

        int actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testCountMonthSecond() {
        CountMonthService service = new CountMonthService();

        int income = 100_000;
        int expenses = 60_000;
        int threshold = 150_000;
        int expected = 2;

        int actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/count.month.csv")
    public void testCountMonthThird(int expected, int income, int expenses, int threshold) {
        CountMonthService service = new CountMonthService();

        int actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }


}


