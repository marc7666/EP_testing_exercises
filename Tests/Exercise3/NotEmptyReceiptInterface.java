package Exercise3;

/**
 * @project: EP_testing_exercises.
 * @author: mcr99 on 21/01/2022.
 */

import Exercise3.Exceptions.IsClosedException;
import org.junit.jupiter.api.Test;

public interface NotEmptyReceiptInterface {
    @Test
    void addLineTest() throws IsClosedException;

    @Test
    void addTaxesTest() throws IsClosedException;

    @Test
    void getTotalTest() throws IsClosedException;
}
