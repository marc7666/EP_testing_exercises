package Exercise5;

/**
 * @project: EP_testing_exercises.
 * @author: mcr99 on 21/01/2022.
 */

import Exercise5.Exceptions.DoesNotExistException;

import java.math.BigDecimal;

public interface ProductsDB {
    BigDecimal getPrice(String productID) throws DoesNotExistException;
}
