package Exercise5;

/**
 * @project: EP_testing_exercises.
 * @author: mcr99 on 21/01/2022.
 */

public class ReceiptLine {
    private int units;
    private String productID;

    public ReceiptLine(int units, String productID) {
        this.units = units;
        this.productID = productID;
    }

    public int getUnits() {
        return units;
    }

    public String getProductID() {
        return productID;
    }
}
