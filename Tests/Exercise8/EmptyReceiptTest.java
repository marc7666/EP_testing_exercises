package Exercise8;

import Exercise8.Exceptions.DoesNotExistException;
import Exercise8.Exceptions.IsClosedException;
import Exercise8.Exceptions.IsNotClosedException;
import Exercise8.Stub_Mock.MockReceiptPrinter;
import Exercise8.Stub_Mock.StubGetProduct;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

public class EmptyReceiptTest implements ReceiptPrinterIntfTest {
    Receipt r;
    String output;
    ProductsDB pDB;
    ReceiptPrinter rP;

    @Override
    @BeforeEach
    public void setup() {
        r = new Receipt();
        rP = new MockReceiptPrinter();
        output = "";
        pDB = new StubGetProduct();
        r.setProdDB(pDB);
        r.setrP(rP);
    }

    @Override
    @Test
    public void printTest() throws DoesNotExistException, IsNotClosedException, IsClosedException {
        r.addLine("Mouse", 10);
        BigDecimal perc = new BigDecimal("15");
        r.addTaxes(perc);
        r.printReceipt();
        output += "Acme S.A." + "\n";
        output += "Description:" + "\t" + pDB.getProduct("Mouse").getDescription();
        output += "\t" + "Quantity:" + "\t" + 10;
        output += "\t" + "Price:" + "\t" + pDB.getProduct("Mouse").getPrice() + "\n";
        output += "TAXES" + "\t" + r.getTaxes().toString() + "\n";
        output += "----------------------------------------" + "\n";
        output += "TOTAL" + "\t" + r.getTotal().toString() + "\n";
        output += "----------------------------------------" + "\n";
        assertEquals(output, rP.getOutput());

    }
}
