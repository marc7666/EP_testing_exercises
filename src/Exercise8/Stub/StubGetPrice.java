package Exercise8.Stub;

import Exercise8.Exceptions.DoesNotExistException;
import Exercise8.ProductsDB;

import java.math.BigDecimal;

public class StubGetPrice implements ProductsDB {

    @Override
    public BigDecimal getPrice(String productID) throws DoesNotExistException {
        if (productID.equals("Shotgun")) {
            return new BigDecimal("1560.36");
        } else if (productID.equals("Rifle")) {
            return new BigDecimal("4897.12");
        } else if (productID.equals("Revolver")) {
            return new BigDecimal("2000.0");
        } else {
            throw new DoesNotExistException("This ID is not in the DB");
        }
    }
}
