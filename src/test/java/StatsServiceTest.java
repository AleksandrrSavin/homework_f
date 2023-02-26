import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class StatsServiceTest {

    @Test
    void shouldCalculateMinSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonth = 9;
        int actualMonth = service.minSales(sales);

        Assertions.assertEquals(expectedMonth, actualMonth);

    }

    @Test
    void shouldCalculateMaxSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonth = 8;
        int actualMonth = service.maxSales(sales);

        Assertions.assertEquals(expectedMonth, actualMonth);

    }

    @Test
    void shouldCalculateAmountSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonth = 180;
        int actualMonth = service.amountSales(sales);

        Assertions.assertEquals(expectedMonth, actualMonth);

    }


    @Test
    void shouldCalculateAverageValueOfSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedAverage = 15;
        int actualAverage = service.averageValueOfSales(sales);

        Assertions.assertEquals(expectedAverage, actualAverage);

    }

    @Test
    void shouldCalculateNumberOfMonthsIsBelowAverage() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonths = 5;
        int actualMonths = service.numberOfMonthsIsBelowAverage(sales);

        Assertions.assertEquals(expectedMonths, actualMonths);
    }

    @Test
    void shouldCalculateNumberOfMonthsIsMoreAverage() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonths = 5;
        int actualMonths = service.numberOfMonthsIsMoreAverage(sales);

        Assertions.assertEquals(expectedMonths, actualMonths);
    }
}