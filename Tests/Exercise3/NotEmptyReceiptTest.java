package Exercise3;

import Exercise3.Exceptions.IsClosedException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;

public class NotEmptyReceiptTest implements NotEmptyReceiptInterface {
    private Receipt receipt;

    @BeforeEach
    void setup() {
        receipt = new Receipt();
    }

    @Override
    @Test
    public void addLineTest() throws IsClosedException {
        BigDecimal pricePerUnit = new BigDecimal("12.25");
        receipt.addLine(pricePerUnit, 3);
        BigDecimal total = new BigDecimal("36.75");
        assertEquals(total, receipt.getTotal());
    }

    void adding() throws IsClosedException {
        BigDecimal pricePerUnit = new BigDecimal("12.25");
        receipt.addLine(pricePerUnit, 3);
        BigDecimal total = new BigDecimal("36.75");
        assertEquals(total, receipt.getTotal());
    }

    @Override
    @Test
    public void addTaxesTest() throws IsClosedException {
        adding();
        BigDecimal percent = new BigDecimal("21.00");
        receipt.addTexes(percent);
        BigDecimal total = new BigDecimal("44.47");
        assertEquals(total, receipt.getTotal());
    }

    void addingTaxes() throws IsClosedException {
        adding();
        BigDecimal percent = new BigDecimal("21.00");
        receipt.addTexes(percent);
    }


    @Override
    @Test
    public void getTotalTest() throws IsClosedException {
        assertEquals(BigDecimal.valueOf(0, 2), receipt.getTotal());
        addingTaxes();
        BigDecimal total = new BigDecimal("44.47");
        assertEquals(total, receipt.getTotal());

    }
}
