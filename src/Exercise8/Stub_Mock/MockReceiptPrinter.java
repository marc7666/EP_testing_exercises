package Exercise8.Stub_Mock;

import java.math.BigDecimal;

public class MockReceiptPrinter {
    private String output;

    public MockReceiptPrinter() {
        this.output = "";
    }

    public void init() {
        output += "Acme S.A." + "\n";
        System.out.println("Acme S.A.\n");
    }

    public void addProduct(String description, int quantity, BigDecimal price) {
        String x = "Description:" + "\t" + description + "\t" + "Quantity:" + "\t" + quantity + "\t" + "Price:" + "\t" + price.toString() + "\n";
        output += x;
        System.out.println(x);
    }

    public void addTaxes(BigDecimal taxes) {
        String x = "TAXES" + "\t" + taxes.toString() + "\n";
        output += x;
        System.out.println(x);

    }

    public void print(BigDecimal total) {
        String lines = "----------------------------------------" + "\n";
        String x = "TOTAL" + "\t" + total.toString() + "\n";
        output += lines;
        output += x;
        output += lines;
        System.out.println(lines + x + lines);

    }

    public String getOutput() {
        return output;
    }
}
