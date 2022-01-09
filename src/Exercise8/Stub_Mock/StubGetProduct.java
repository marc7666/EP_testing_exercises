package Exercise8.Stub_Mock;

import Exercise8.Exceptions.DoesNotExistException;
import Exercise8.Product;
import Exercise8.ProductsDB;

import java.math.BigDecimal;

public class StubGetProduct implements ProductsDB {
    private Product p1;
    private Product p2;

    public StubGetProduct() {
        this.p1 = new Product("Peripheral input element", "Mouse", new BigDecimal("60.00"));
        this.p2 = new Product("Peripheral output element", "Display", new BigDecimal("160.00"));
    }

    @Override
    public Product getProduct(String productID) throws DoesNotExistException {
        if (productID.equals("Mouse")) {
            return p1;
        } else if (productID.equals("Display")) {
            return p2;
        } else {
            throw new DoesNotExistException("This product doesn't exist in the DB");
        }
    }

}
