package Exercise5;

/**
 * @project: EP_testing_exercises.
 * @author: mcr99 on 21/01/2022.
 */

import Exercise5.Exceptions.DoesNotExistException;
import Exercise5.Exceptions.IsClosedException;
import Exercise5.Stub.StubGetPrice;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

public class NotClosedEmptyReceiptTest implements ReceiptTestInterface {
    Receipt r;
    ProductsDB pDB;


    @Override
    @BeforeEach
    public void setup() {
        r = new Receipt();
        pDB = new StubGetPrice();
        r.setProdDB(pDB);
    }

    @Override
    @Test
    public void addLineTest() throws DoesNotExistException, IsClosedException {
        assertFalse(r.isClosed());
        r.addLine("Rifle", 2);
        assertEquals(new BigDecimal("9794.24"), r.getTotal());
    }

    @Override
    @Test
    public void addTaxesTest() throws IsClosedException {
        assertFalse(r.isClosed());
        BigDecimal perc = new BigDecimal("21.00");
        r.addTaxes(perc);
        assertEquals(new BigDecimal("0.00"), r.getTotal());
    }

    @Override
    @Test
    public void NotExistsInStub() {
        assertThrows(DoesNotExistException.class,
                () -> r.addLine("Sword", 1));
    }

    @Test
    void isClosedAfteraddTexesTest() throws IsClosedException {
        BigDecimal perc = new BigDecimal("21.00");
        r.addTaxes(perc);
        assertTrue(r.isClosed());
    }
}
