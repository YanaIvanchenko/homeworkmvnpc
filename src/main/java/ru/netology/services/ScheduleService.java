package ru.netology.services;

public class ScheduleService {
    public int calcCount(int income, int expenses, int threshold) {
        int count = 0;
        int money = 0;

        for (int month = 1; month <= 12; month++) {
            System.out.println(month + " месяц. Денег " + money);
            if (money < threshold) { // работаем
                money = money + income - expenses;
                System.out.println("Придется работать. Заработал " + income + ". Потратил " + expenses + ".");

            } else {
                money = money - expenses;
                int remainder = money * 2 / 3;
                money = money - remainder;
                System.out.println("Буду отдыхать. Потратил " + expenses + ", затем еще " + remainder + ".");
                count++;
            }
        }
        return count;
    }
}