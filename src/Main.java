public class               Main {
    public static void main(String[] args) {

        System.out.println("//Task 1");
        int monthMoney = 15000;
        int totalMoney = 0;
        int i = 1;
        while (totalMoney <= 2_459_000) {
            totalMoney = totalMoney + monthMoney;
            totalMoney = totalMoney;
            System.out.println("месяц " + i++ + " , сумма накоплений равна " + totalMoney);
        }

        System.out.println("//Task 2");
        int g = 0;
        while (g < 10) {
            g += 1;
            System.out.print(g + " ");
        }
        System.out.println(" ");
        for (i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }

        System.out.println("//Task 3");
        int yCountryPopulation = 12000000;
        int year = 0;
        int peopleDyingPerYear = 8;
        int peopleBornPerYear = 17;
        while (year < 10) {
            year++;
            yCountryPopulation = yCountryPopulation;
            yCountryPopulation = yCountryPopulation + peopleBornPerYear - peopleDyingPerYear;
            System.out.println(" через " + year + " год численность населения будет " + yCountryPopulation);
        }

        System.out.println("HW2//Task 1");
        int month = 0;
        int sumMoney = 0;
        int newMonthMoney = 15000;
        while (sumMoney < 12000000) {
            sumMoney = sumMoney + (newMonthMoney / 100 * 7);
            sumMoney = sumMoney + newMonthMoney;
            month++;
            System.out.println("За " + month + " Месяц накопил " + sumMoney);
        }
        System.out.println("HW2//Task 2");
        int newSumMoney = 0;
        int newMonth = 1;
        for (; newSumMoney < 12000000; newMonth++) {
            newSumMoney = newSumMoney + (newMonthMoney / 100 * 7);
            newSumMoney = newSumMoney + newMonthMoney;
            if (newMonth % 6 == 0) {
                System.out.println("За " + newMonth + " Месяц накопил " + newSumMoney);
            }
        }
        System.out.println("HW2//Task 3");
        int vasMonthMoney = 15000;
        int bankPercentPerMonth = vasMonthMoney / 100 * 7;
        int moneySum = 0;
        int vasMonth = 0;
        while (vasMonth < 108) {
            vasMonth++;
            moneySum = moneySum + bankPercentPerMonth;
            moneySum = moneySum + vasMonthMoney;
            if (vasMonth % 6 == 0) {
                System.out.println("За " + vasMonth + " месяц он накопит " + moneySum);
            }
        }
        System.out.println("HW2//Task 4");
        for (int fridayNum = 3; fridayNum <= 31; fridayNum += 7) {
            System.out.println("сегодня пятница " + fridayNum + " число");
        }

        System.out.println("HW3//Task 1");
        int Year = 1822;
        while (Year <= 2122) {
            Year++;
            if (Year % 79 == 0) {
                System.out.println(Year);
            }

            System.out.println("HW3//Task 2");
            int first = 2;
            for (int second = 0; second <= 10; second++) {
                int third = first * second;
                System.out.println(first + " * " + second + " = " + third);
            }


        }
    }
}