package Exercise5;

import Exercise5.Exceptions.IsClosedException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

public class ClosedReceiptTest implements ReceiptTestInterface {
    Receipt receipt;
    ProductsDB pDB;


    @Override
    @BeforeEach
    public void setup() {
        receipt = new Receipt();
        receipt.setProdDB(pDB);
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

    @Override
    @Test
    public void NotExistsInStub() {

    }
}
