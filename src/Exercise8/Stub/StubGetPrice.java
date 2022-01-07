package Exercise8.Stub;

import Exercise8.Exceptions.DoesNotExistException;
import Exercise8.ProductDTO;
import Exercise8.ProductsDB;

import java.math.BigDecimal;

public class StubGetPrice implements ProductsDB {
    ProductDTO prod1;
    ProductDTO prod2;

    public StubGetPrice() {
        prod1 = new ProductDTO("Shotgun", "Long weapon", new BigDecimal("1500.0"));
        prod2 = new ProductDTO("Revolver", "Sort weapon", new BigDecimal("1000.0"));
    }

    @Override
    public ProductDTO getPrice(String productID) throws DoesNotExistException {
        if (productID.equals("Shotgun")) {
            return prod1;
        } else if (productID.equals("Revolver")) {
            return prod2;
        } else {
            throw new DoesNotExistException("Product does not existis");
        }
    }
}
