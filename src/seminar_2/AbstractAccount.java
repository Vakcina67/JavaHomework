package seminar_2;

public abstract class AbstractAccount implements Account {
    private double balance;
    AbstractAccount(double balance) {
        this.balance = balance;
    }
    public double getAmount() {
        return balance;
    }
    public void put (double amount) {
        if (amount <= 0) {
            System.out.println("Нельзя положить отрицательную сумму!");
        } else {
            balance+=amount;
            System.out.println("Операция прошла успешно!");
        }
    }

    public void take (double amount) {
        if (amount <= 0) {
            System.out.println("Нельзя снять отрицательную сумму!");
        } else if (amount > balance) {
            System.out.println("На вашем счету недостаточно средств!");
        } else {
            balance-=amount;
            System.out.println("Операция прошла успешно!");
        }
    }

}
