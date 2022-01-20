package Exercise8;

/**
 * @project: EP_testing_exercises.
 * @author: mcr99 on 21/01/2022.
 */

import Exercise8.Exceptions.DoesNotExistException;


public interface ProductsDB {
    ProductDTO getProduct(String productID) throws DoesNotExistException;

}
