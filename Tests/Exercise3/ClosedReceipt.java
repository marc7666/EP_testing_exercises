package Exercise3;

import org.junit.jupiter.api.Test;

public interface ClosedReceipt {
    @Test
    void closedAddLineTest();

    @Test
    void closedAddTaxesTest();

    @Test
    void closedGetTotalTest();
}
