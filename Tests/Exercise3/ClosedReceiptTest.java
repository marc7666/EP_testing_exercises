package Exercise3;

import Exercise3.Exceptions.IsClosedException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

public class ClosedReceiptTest implements ClosedReceipt{
    private Receipt receipt;

    @BeforeEach
    void setup(){
        receipt = new Receipt();
        receipt.setClosed(true);
    }

    @Override
    @Test
    public void closedAddLineTest() {
        assertThrows(IsClosedException.class,
                () -> receipt.addLine(BigDecimal.valueOf(12.00), 122));
    }

    @Override
    @Test
    public void closedAddTaxesTest() {
        assertThrows(IsClosedException.class,
                () -> receipt.addTexes(BigDecimal.valueOf(21.00)));
    }
}
