package Exercise8;

import Exercise8.Exceptions.DoesNotExistException;


public interface ProductsDB {
    Product getProduct(String productID) throws DoesNotExistException;

}
