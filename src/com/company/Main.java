package com.company;

public class Main {

    public static void main(String[] args) {
        BankAcount bankAcount = new BankAcount();
        bankAcount.deposit(20000);

        while (true){
            try {
                bankAcount.withDraw(6000) ;
            } catch (LimitException e) {
                try {
                    bankAcount.withDraw((int) bankAcount.getAmount());
                } catch (LimitException limitException) {
                    limitException.printStackTrace();
                }
                break;
            }
        }
    }
}
