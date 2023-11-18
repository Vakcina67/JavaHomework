package Seminar_5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    @Test
    void testPut() {
        Account testObject = new Account();
        testObject.put(10);
        Assertions.assertEquals(10, testObject.getAmount());
    }

    @Test
    void testTake() {
        Account testObject = new Account();
        testObject.put(100);
        testObject.take(32.6);
        Assertions.assertEquals(67.4, testObject.getAmount());
    }
}