package Exercise8;

/**
 * @project: EP_testing_exercises.
 * @author: mcr99 on 21/01/2022.
 */

import java.math.BigDecimal;

public interface ReceiptPrinter {
    void init();

    void addProduct(String description, int quantity, BigDecimal price);

    void addTaxes(BigDecimal taxes);

    void print(BigDecimal total);

    String getOutput();
}
