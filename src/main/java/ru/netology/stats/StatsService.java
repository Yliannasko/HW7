package ru.netology.stats;

public class StatsService {
    public int minSales(long[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public long sum(long[] sales) { // сумма всех продаж
        long allSum = 0;
        for (int i = 0; i < sales.length; i++) {
            allSum += sales[i];
        }

        return allSum;
    }


    public long getAverage(long[] sales) { //средняя сумма всех продаж в месяц// long allSum = 0;
        // for (int i = 0; i < sales.length; i++) {
        //     allSum += sales[i];
        // }
        long getAverageSale = sum(sales) / 12;
        return getAverageSale;
    }

    public int getMonthMaxSales(long[] sales) { //номер месяца с максимальной суммой
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int getMonthMinSales(long[] sales) { //номер месяца с мin суммой
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int numberMonthAboveAverage(long[] sales) { //кол-во месяцев с продажами выше среднего
        int maxMonthAbove = 0;
        // for (int i = 0; i < sales.length; i++) {
        //     if (sales[i] > getAverage(sales)) {
        for (long sale : sales) {
            if (sale > getAverage(sales)) {
                maxMonthAbove++;
            }
        }
        return maxMonthAbove;
    }

    public int numberMonthBelowAverage(long[] sales) { //кол-во месяцев где продажи ниже среднего
        int minMonthBelow = 0;
        //for (int i = 0; i < sales.length; i++) {
        //    if (sales[i] < getAverage(sales)) {
        for (long sale : sales) {
            if (sale < getAverage(sales)) {
                minMonthBelow++;
            }
        }
        return minMonthBelow;
    }

}




