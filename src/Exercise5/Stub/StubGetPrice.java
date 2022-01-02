package Exercise5.Stub;

import Exercise5.Exceptions.DoesNotExistException;
import Exercise5.ProductsDB;

import java.math.BigDecimal;

public class StubGetPrice implements ProductsDB {

    @Override
    public BigDecimal getPrice(String productID) throws DoesNotExistException {
        return null;
    }
}
