package Exercise8;

import Exercise8.Exceptions.IsClosedException;

import java.math.BigDecimal;

public interface PrintReceiptIntf {
    void init();

    void addProduct(String description, int quantity, BigDecimal price);

    void addTaxes(BigDecimal taxes);

    void print(BigDecimal total);

    String getOutput();
}
