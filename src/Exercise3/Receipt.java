package Exercise3;

/**
 * @project: EP_testing_exercises.
 * @author: mcr99 on 21/01/2022.
 */


import Exercise3.Exceptions.IsClosedException;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashMap;

public class Receipt implements ReceiptInterface {

    private HashMap<Integer, BigDecimal> receiptLine;
    private BigDecimal total;
    private boolean isClosed;

    public Receipt() {
        this.receiptLine = new HashMap<>();
        this.total = new BigDecimal("0.00");
        this.isClosed = false;
    }

    @Override
    public void addLine(BigDecimal pricePerUnit, int numUnits) throws IsClosedException {
        if (isClosed) {
            throw new IsClosedException("Receipt closed");
        } else {
            receiptLine.put(numUnits, pricePerUnit);
            BigDecimal unitaryPrice = receiptLine.get(numUnits);
            total = total.add(unitaryPrice.multiply(BigDecimal.valueOf(numUnits)));
        }

    }

    @Override
    public void addTexes(BigDecimal percent) throws IsClosedException {
        if (isClosed) {
            throw new IsClosedException("Receipt closed");
        } else {
            BigDecimal cent = new BigDecimal("100.00");
            total = total.add(total.multiply(percent).divide(cent, 2, RoundingMode.CEILING));
            isClosed = true;
        }
    }

    @Override
    public BigDecimal getTotal() {
        return total;
    }

    protected void setClosed(boolean state) {
        this.isClosed = state;
    }

}
