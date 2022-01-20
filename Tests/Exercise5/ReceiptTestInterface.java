package Exercise5;

/**
 * @project: EP_testing_exercises.
 * @author: mcr99 on 21/01/2022.
 */

import Exercise5.Exceptions.DoesNotExistException;
import Exercise5.Exceptions.IsClosedException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public interface ReceiptTestInterface {

    @BeforeEach
    void setup() throws DoesNotExistException, IsClosedException;

    @Test
    void addLineTest() throws DoesNotExistException, IsClosedException;

    @Test
    void addTaxesTest() throws IsClosedException;

    @Test
    void NotExistsInStub();
}
