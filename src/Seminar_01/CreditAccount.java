package Seminar_01;

public class CreditAccount extends Account {
    public CreditAccount(double balance) {
        super(balance);
    }

    @Override
    public void take(double money) {
        super.take(money*1.01);
    }
}
