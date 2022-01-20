package Exercise3;

/**
 * @project: EP_testing_exercises.
 * @author: mcr99 on 21/01/2022.
 */

import org.junit.jupiter.api.Test;

public interface ClosedReceipt {
    @Test
    void closedAddLineTest();

    @Test
    void closedAddTaxesTest();

    @Test
    void closedGetTotalTest();
}
