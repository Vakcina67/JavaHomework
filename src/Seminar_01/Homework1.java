package Seminar_01;

public class Homework1 {
    public static void main(String[] args) {
        Account mymoney = new Account(150);
        mymoney.put(30);
        mymoney.put(35);
        mymoney.take(55);
        System.out.println(mymoney.getAmount());

        CreditAccount mymoney2 = new CreditAccount(150);
        mymoney2.put(30);
        mymoney2.put(35);
        mymoney2.take(55);
        System.out.println(mymoney2.getAmount());
        //System.out.println(mymoney.balance);
    }
}
