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


public class NotClosedNotEmptyReceiptTest implements ReceiptTestInterface {
    Receipt r;
    ProductsDB pDB;

    @Override
    @BeforeEach
    public void setup() throws DoesNotExistException, IsClosedException {
        r = new Receipt();
        pDB = new StubGetPrice();
        r.setProdDB(pDB);
        r.addLine("Shotgun", 1);
        r.addLine("Rifle", 1);
    }

    @Override
    @Test
    public void addLineTest() throws DoesNotExistException, IsClosedException {
        r.addLine("Revolver", 1);
        assertEquals(new BigDecimal("8457.48"), r.getTotal());
        assertFalse(r.isClosed());
    }

    @Override
    @Test
    public void addTaxesTest() throws IsClosedException {
        BigDecimal perc = new BigDecimal("21.00");
        r.addTaxes(perc);
        assertEquals(new BigDecimal("7813.56"), r.getTotal());
        assertTrue(r.isClosed());
    }

    @Override
    @Test
    public void NotExistsInStub() {
        assertThrows(DoesNotExistException.class,
                () -> r.addLine("Sword", 12));

    }
}
