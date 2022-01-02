package Exercise5;

import Exercise5.Exceptions.IsClosedException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

public class ClosedReceiptTest implements IsClosedReceipt{
    Receipt receipt;


    @Override
    @BeforeEach
    public void setup() {
        receipt = new Receipt();
        receipt.closeReceipt();
    }

    @Override
    @Test
    public void addLineTest() {
        assertThrows(IsClosedException.class,
                () -> receipt.addLine("Rifle", 2));

    }

    @Override
    @Test
    public void addTaxesTest() {
        assertThrows(IsClosedException.class,
                () -> receipt.addTaxes(BigDecimal.valueOf(10)));

    }
}
