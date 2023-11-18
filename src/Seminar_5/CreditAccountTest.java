package Seminar_5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreditAccountTest {

    @Test
    void testTake() {
        CreditAccount testObject = new CreditAccount();
        testObject.put(100);
        testObject.take(20);
        Assertions.assertEquals(79.8, testObject.getAmount());
    }
}