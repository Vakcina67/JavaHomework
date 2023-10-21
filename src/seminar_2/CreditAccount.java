package seminar_2;

public class CreditAccount extends AbstractAccount {
    CreditAccount(double balance) {
        super(balance);
    }

    @Override
    public void take(double amount) {
        super.take(amount * 1.01);
    }
}
