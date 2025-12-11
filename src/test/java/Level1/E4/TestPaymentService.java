package Level1.E4;

import org.junit.Test;

import static org.junit.Assert.*;

public class TestPaymentService {
    @Test
    public void testValidatePaymentMethod() {
        String userInput = "credit card";
        assertEquals(PaymentMethod.CREDIT_CARD, PaymentMethod.validatePaymentMethod(userInput));
    }

    @Test
    public void testValidatePaymentMethodException() {
        String userInput = "money";
        assertThrows(IllegalArgumentException.class, () -> PaymentMethod.validatePaymentMethod(userInput));
    }
}
