package seminar_2;

public class Homework_02 {
    public static void main(String[] args) {
        FixedAmountAccount fixedmoney = new FixedAmountAccount(200);
        System.out.println(fixedmoney.getAmount());
        fixedmoney.put(50);
        fixedmoney.take(212.45);
        System.out.println(fixedmoney.getAmount());

        CreditAccount mymoney = new CreditAccount(300);
        System.out.println(mymoney.getAmount());
        mymoney.take(340);
        mymoney.take(-59);
        mymoney.take(150);
        mymoney.put(-69);
        mymoney.put(150);
        System.out.println(mymoney.getAmount());
    }
}
