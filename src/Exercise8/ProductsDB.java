package Exercise8;

import Exercise8.Exceptions.DoesNotExistException;


public interface ProductsDB {
    ProductDTO getProduct(String productID) throws DoesNotExistException;

}
