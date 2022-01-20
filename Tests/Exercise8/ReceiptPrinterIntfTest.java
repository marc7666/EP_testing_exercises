package Exercise8;

/**
 * @project: EP_testing_exercises.
 * @author: mcr99 on 21/01/2022.
 */

import Exercise8.Exceptions.DoesNotExistException;
import Exercise8.Exceptions.IsClosedException;
import Exercise8.Exceptions.IsNotClosedException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public interface ReceiptPrinterIntfTest {

    @BeforeEach
    void setup() throws DoesNotExistException, IsClosedException;

    @Test
    void printTest() throws DoesNotExistException, IsNotClosedException, IsClosedException;
}
