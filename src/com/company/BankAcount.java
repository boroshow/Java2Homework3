package com.company;

public class BankAcount {
    private double amount;

    double getAmount(){
        System.out.println("Ваш баланс : " + amount);
        return amount;
    }

    void deposit(double sum){
        amount = amount + sum;
    }

    void withDraw(int sum)throws LimitException{
        if (sum > amount){
            throw new LimitException("Запрашеваемая сумма больше баланса",amount);
        } else{
            amount = amount - sum;
            System.out.println("Было снято : " + sum + " ;" + " Осталось : " + amount);
        }
    }
    /*Nurgazy Chargynov, [5 июля 2021 г., 20:53:06]:
...a)  Написать класс проверяемого исключения LimitException, с конструктором LimitException(String message, double remainingAmount) и методом getRemainingAmount().
b)  Написать класс BankAccount с 1 полем double amount - остаток на счете и методами getAmount() - возвращает текущий остаток на счете, deposit(double sum) - положить деньги на счет, withDraw(int sum) - снимает указанную сумму со счета.
c)  Также метод withDraw() может сгенерировать исключение в том случае если запрашиваемая сумма на снятие больше чем остаток денег на счете.
d)  Написать Main класс где бы создавался счет клиента. Положить 20 000 сом на счет.
e)  Затем попытаться снять через бесконечный цикл, каждую итерацию по 6000 сом, при этом отлавливать исключение LimitException и при возникновении такого исключения снимать только ту сумму, которая осталась на счете и завершать бесконечный цикл

...*/
}
