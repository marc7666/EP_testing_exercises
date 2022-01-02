package Exercise5;


import Exercise5.Exceptions.*;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

public class Receipt {
    private ProductsDB prodDB;
    private BigDecimal total;
    private boolean isClosed;
    private List<ReceiptLine> products;

    public Receipt() {
        this.isClosed = false;
        this.total = new BigDecimal("0.00");
        this.products = new ArrayList<>();
    }

    public void setProdDB(ProductsDB prodDB) {
        this.prodDB = prodDB;
    }

    public void addLine(String productID, int numUnits) throws IsClosedException, DoesNotExistException {
        if (isClosed) {
            throw new IsClosedException("Receipt closed");
        } else{
            ReceiptLine line = new ReceiptLine(numUnits, productID);
            BigDecimal price = prodDB.getPrice(productID);
            products.add(line);
            total = total.add(price.multiply(BigDecimal.valueOf(line.getUnits())));
        }

    }

    public void addTaxes(BigDecimal percent) throws IsClosedException {
        if (isClosed){
            throw new IsClosedException("Receipt closed");
        }else{
            BigDecimal cent = new BigDecimal("100.0");
            total = total.add(total.multiply(percent).divide(cent, 2, RoundingMode.CEILING));
            // .divide(divisor, num of decimals, rounding mode -> CEILING = Rounds to positive infinity);
            isClosed = true;
        }

    }

    public BigDecimal getTotal() {
        return total;
    }

    protected void closeReceipt(){
        isClosed = true;
    }
}
