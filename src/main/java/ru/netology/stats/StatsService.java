package ru.netology.stats;

public class StatsService {

    public long getAllSum(long[] sales) {
        long sum = 0;
        for (long arrayData : sales) {
            sum = sum + arrayData;
        }
        return sum;
    }

    public long getAverageSum(long[] sales) {
        long sum = getAllSum(sales);
        long average = sum / sales.length;
        return average;
    }

    public int getMaxSales(long[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int getMinSales(long[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int getNumberOfMonthsBelowAverageSales(long[] sales) {
        long average = getAverageSum(sales);
        int monthsBelowAverage = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < average) {
                monthsBelowAverage++;
            }
        }
        return monthsBelowAverage;
    }

    public int getNumberOfMonthsAboveAverageSales(long[] sales) {
        long average = getAverageSum(sales);
        int monthsAboveAverage = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > average) {
                monthsAboveAverage++;
            }
        }
        return monthsAboveAverage;
    }
}
