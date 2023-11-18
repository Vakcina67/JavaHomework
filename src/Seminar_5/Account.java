package Seminar_5;

public class Account {
    private double balance;

    public Account() {
        this.balance = 0;
    }
    public void put (double money) {
        if (money <= 0) {
            System.out.println("Вы не можете положить отрицательную сумму!");
        } else {
            this.balance += money;
            System.out.println("Операция прошла успешно!");
        }
    }
    public void take (double money) {
        if (money <= 0) {
            System.out.println("Вы не можете снять отрицательную сумму!");
        } else {
            this.balance -= money;
            System.out.println("Операция прошла успешно!");
        }
    }
    public double getAmount() { return balance; }
}
