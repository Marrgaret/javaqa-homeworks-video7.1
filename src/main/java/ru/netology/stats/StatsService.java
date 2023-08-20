package ru.netology.stats;

public class StatsService {
    public long sum(long[] sales) {
        long totalSale = 0;
        for (long sale : sales) {
            totalSale += sale;

        }
        return totalSale;
    }

    public long average(long[] sales) {
        return sum(sales) / sales.length;
    }

    public int maxmumMonth(long[] sales) {
        int montMaximumSale = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[montMaximumSale]) {
                montMaximumSale = i;
            }

        }
        return montMaximumSale + 1;
    }

    public int minmumMonth(long[] sales) {
        int montMinimumSale = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[montMinimumSale]) {
                montMinimumSale = i;
            }

        }
        return montMinimumSale + 1;
    }

    public int monthBellowAverage(long[] sales) {
        int counter = 0;
        long averageSale = average(sales);
        for (long sale : sales) {
            if (sale < averageSale) {
                counter++;
            }
        }
        return counter;
    }

    public int monthAboveAverage(long[] sales) {
        int counter = 0;
        long averageSale = average(sales);
        for (long sale : sales) {
            if (sale > averageSale) {
                counter++;
            }
        }
        return counter;
    }
}
