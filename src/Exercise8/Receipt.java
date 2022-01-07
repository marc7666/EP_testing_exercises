package Exercise8;


import Exercise8.Exceptions.DoesNotExistException;
import Exercise8.Exceptions.IsClosedException;
import Exercise8.Exceptions.IsNotClosedException;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

public class Receipt {
    private ProductsDB prodDB;
    private BigDecimal total;
    private boolean isClosed;
    private List<ReceiptLine> products;
    private PrintReceiptIntf printer;
    private BigDecimal taxes;

    public Receipt() {
        this.isClosed = false;
        this.total = new BigDecimal("0.00");
        this.taxes = new BigDecimal("0.00");
        this.products = new ArrayList<>();
    }

    public void setProdDB(ProductsDB prodDB) {
        this.prodDB = prodDB;
    }

    public void addLine(String productID, int numUnits) throws IsClosedException, DoesNotExistException {
        BigDecimal price;
        ReceiptLine rcline;

        if (isClosed)
            throw new IsClosedException("Recibo ya cerrado");
        else {
            price = prodDB.getPrice(productID).getPrice();
            rcline = new ReceiptLine(numUnits, productID);
            products.add(rcline);
            total = total.add(price.multiply(BigDecimal.valueOf(rcline.getUnits())));
        }
    }

    public void addTaxes(BigDecimal percent) throws IsClosedException {
        if (isClosed) {
            throw new IsClosedException("Receipt closed");
        } else {
            BigDecimal cent = new BigDecimal("100.0");
            total = total.add(total.multiply(percent).divide(cent, 2, RoundingMode.CEILING));
            // .divide(divisor, num of decimals, rounding mode -> CEILING = Rounds to positive infinity);
            isClosed = true;
        }

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
        String iD;
        ProductDTO dto;
        if (!isClosed) {
            throw new IsNotClosedException("Receipt not closed!");
        }
        printer.init();
        for (ReceiptLine line : products) {
            iD = line.getProductID();
            dto = prodDB.getPrice(iD);
            printer.addProduct(dto.getDescription(), line.getUnits(), dto.getPrice());
        }
        printer.addTaxes(taxes);
        printer.print(total);
    }

}
