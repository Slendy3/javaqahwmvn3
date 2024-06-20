package ru.netology.stats;

public class StatsService {

    public int getAllSum(int[] sales) {
        int sum = 0;
        for (int arrayData : sales) {
            sum = sum + arrayData;
        }
        return sum;
    }

    public int getAverageSum(int[] sales) {
        int sum = getAllSum(sales);
        int average = sum / sales.length;
        return average;
    }

    public int getMaxSales(int[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int getMinSales(int[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int getNumberOfMonthsBelowAverageSales(int[] sales) {
        int average = getAverageSum(sales);
        int monthsBelowAverage = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < average) {
                monthsBelowAverage++;
            }
        }
        return monthsBelowAverage;
    }

    public int getNumberOfMonthsAboveAverageSales(int[] sales) {
        int average = getAverageSum(sales);
        int monthsAboveAverage = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > average) {
                monthsAboveAverage++;
            }
        }
        return monthsAboveAverage;
    }
}
