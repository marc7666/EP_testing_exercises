package Exercise3;

import Exercise3.Exceptions.IsClosedException;

import java.math.BigDecimal;

public interface ReceiptInterface {
    void addLine(BigDecimal pricePerUnit, int numUnits) throws IsClosedException;

    void addTexes(BigDecimal percent) throws IsClosedException;

    BigDecimal getTotal();


}
