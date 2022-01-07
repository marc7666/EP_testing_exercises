package Exercise8;

import Exercise8.Exceptions.DoesNotExistException;

import java.math.BigDecimal;

public interface ProductsDB {
    ProductDTO getPrice(String productID) throws DoesNotExistException;
}
