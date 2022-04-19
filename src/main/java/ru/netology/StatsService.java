package ru.netology;

public class StatsService {

    public int calculateSum(int[] sales) {
        int sum = 0;
        for (int i : sales) {
            sum += i;
        }
        return sum;
    }

    public int calcAvg(int[] sales) {
        return calculateSum(sales) / sales.length;
    }

    public int maxSales(int[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (int sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale >= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public int minSales(int[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (int sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public int belowTheAverage(int[] sales) {
        int number = 0;
        for (int sale : sales) {
            if (sale < calcAvg(sales)) {
                number = number + 1;
            }
        }
        return number;
    }

    public int aboveTheAverage(int[] sales) {
        int number = 0;
        for (int sale : sales) {
            if (sale > calcAvg(sales)) {
                number = number + 1;
            }
        }
        return number;
    }
}
