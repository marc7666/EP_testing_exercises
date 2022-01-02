package Exercise5;

import Exercise5.Exceptions.DoesNotExistException;

import java.math.BigDecimal;

public interface ProductsDB {
    BigDecimal getPrice(String productID) throws DoesNotExistException;
}
