package ru.netology.services;
public class CountMonthService {

    public int calculate(int income, int expenses, int threshold){
        int freeMonth = 0;
        int money = 0;
        for (int month = 1; month <= 12; month++){
            if (money >= threshold){
                freeMonth++;
                money = (money - expenses) / 3;
            } else {
                money = money + income - expenses;
            }
        }
        return freeMonth;
    }


}