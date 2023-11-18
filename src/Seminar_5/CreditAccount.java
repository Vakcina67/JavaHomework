package Seminar_5;

public class CreditAccount extends Account {
    public CreditAccount() {
        super();
    }

    @Override
    public void take(double money) {
        super.take(money*1.01);
    }
}
