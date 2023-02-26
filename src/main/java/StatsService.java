public class StatsService {
    public int minSales(long[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }

        return maxMonth + 1;
    }

    public int amountSales(long[] sales) {
        int amount = 0;

        for (long sale : sales) {
            amount += sale;
        }

        return amount;
    }

    public int averageValueOfSales(long[] sales) {
        int amount = 0;

        for (long sale : sales) {
            amount += sale;
        }

        return amount / sales.length;

    }

    public int numberOfMonthsIsBelowAverage(long[] sales) {
        int average = averageValueOfSales(sales);
        int monthsBelow = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < average) {
                monthsBelow++;
            }

        }
        return monthsBelow;
    }

    public int numberOfMonthsIsMoreAverage(long[] sales) {
        int average = averageValueOfSales(sales);
        int monthsMore = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > average) {
                monthsMore++;
            }

        }
        return monthsMore;
    }
}
