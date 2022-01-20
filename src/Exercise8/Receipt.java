package Exercise8;

/**
 * @project: EP_testing_exercises.
 * @author: mcr99 on 21/01/2022.
 */

import Exercise8.Exceptions.*;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

public class Receipt {
    private ProductsDB prodDB;
    private BigDecimal total;
    private boolean isClosed;
    private List<ReceiptLine> products;
    private ReceiptPrinter rP;
    private BigDecimal taxes;

    public Receipt() {
        this.isClosed = false;
        this.total = new BigDecimal("0.00");
        this.taxes = new BigDecimal("0.00");
        this.products = new ArrayList<>();
    }

    public void setrP(ReceiptPrinter rP) {
        this.rP = rP;
    }

    public void setProdDB(ProductsDB prodDB) {
        this.prodDB = prodDB;
    }

    public void addLine(String productID, int numUnits) throws IsClosedException, DoesNotExistException {
        if (isClosed) {
            throw new IsClosedException("Receipt closed");
        } else {
            ReceiptLine line = new ReceiptLine(numUnits, productID);
            ProductDTO price = prodDB.getProduct(productID);
            products.add(line);
            total = total.add(price.getPrice().multiply(BigDecimal.valueOf(line.getUnits())));
        }

    }

    public void addTaxes(BigDecimal percent) throws IsClosedException {
        if (isClosed) {
            throw new IsClosedException("Receipt closed");
        } else {
            BigDecimal cent = new BigDecimal("100.0");
            total = total.add(total.multiply(percent).divide(cent, 2, RoundingMode.CEILING));
            // .divide(divisor, num of decimals, rounding mode -> CEILING = Rounds to positive infinity);
            total = total.add(taxes);
            isClosed = true;
        }

    }

    public BigDecimal getTaxes() {
        return taxes;
    }

    public BigDecimal getTotal() {
        return total;
    }

    protected void closeReceipt() {
        isClosed = true;
    }

    public boolean isClosed() {
        return isClosed;
    }

    public void printReceipt() throws DoesNotExistException, IsNotClosedException {
        if (!isClosed) {
            throw new IsNotClosedException("The receipt hasn't been closed");
        } else {
            rP.init();
            for (ReceiptLine line : products) {
                String id = line.getProductID();
                int units = line.getUnits();
                ProductDTO prod = prodDB.getProduct(id);
                rP.addProduct(prod.getDescription(), units, prod.getPrice());
            }
            rP.addTaxes(taxes);
            rP.print(total);
        }

    }


}
