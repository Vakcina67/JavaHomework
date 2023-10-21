package seminar_2;

public class FixedAmountAccount extends AbstractAccount{
    FixedAmountAccount(double balance) {
        super(balance);
    }

    @Override
    public void take(double amount) {
        System.out.println("Баланс не может быть изменен!");
    }

    @Override
    public void put(double amount) {
        System.out.println("Баланс не может быть изменен!");
    }
}
