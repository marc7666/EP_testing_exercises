package Exercise8;

import Exercise8.Exceptions.DoesNotExistException;
import Exercise8.Exceptions.IsClosedException;
import Exercise8.Exceptions.IsNotClosedException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public interface ReceiptPrinterIntfTest {

    @BeforeEach
    void setup();

    @Test
    void printTest() throws DoesNotExistException, IsNotClosedException, IsClosedException;
}
