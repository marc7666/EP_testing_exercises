package Exercise8.Stub_Mock;

/**
 * @project: EP_testing_exercises.
 * @author: mcr99 on 21/01/2022.
 */

import Exercise8.Exceptions.DoesNotExistException;
import Exercise8.ProductDTO;
import Exercise8.ProductsDB;

import java.math.BigDecimal;

public class StubGetProduct implements ProductsDB {
    private ProductDTO p1;
    private ProductDTO p2;

    public StubGetProduct() {
        this.p1 = new ProductDTO("Peripheral input element", "Mouse", new BigDecimal("60.00"));
        this.p2 = new ProductDTO("Peripheral output element", "Display", new BigDecimal("160.00"));
    }

    @Override
    public ProductDTO getProduct(String productID) throws DoesNotExistException {
        if (productID.equals("Mouse")) {
            return p1;
        } else if (productID.equals("Display")) {
            return p2;
        } else {
            throw new DoesNotExistException("This product doesn't exist in the DB");
        }
    }

}
