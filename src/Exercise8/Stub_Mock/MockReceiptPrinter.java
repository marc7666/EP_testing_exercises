package Exercise8.Stub_Mock;

import Exercise8.ReceiptPrinter;

/**
 * @project: EP_testing_exercises.
 * @author: mcr99 on 21/01/2022.
 */

import java.math.BigDecimal;

public class MockReceiptPrinter implements ReceiptPrinter {
    private String output;

    public MockReceiptPrinter() {
        this.output = "";
    }

    @Override
    public void init() {
        output += "Acme S.A." + "\n";
        System.out.println("Acme S.A.\n");
    }

    @Override
    public void addProduct(String description, int quantity, BigDecimal price) {
        String x = "Description:" + "\t" + description + "\t" + "Quantity:" + "\t" + quantity + "\t" + "Price:" + "\t" + price.toString() + "\n";
        output += x;
        System.out.println(x);
    }

    @Override
    public void addTaxes(BigDecimal taxes) {
        String x = "TAXES" + "\t" + taxes.toString() + "\n";
        output += x;
        System.out.println(x);

    }

    @Override
    public void print(BigDecimal total) {
        String lines = "----------------------------------------" + "\n";
        String x = "TOTAL" + "\t" + total.toString() + "\n";
        output += lines;
        output += x;
        output += lines;
        System.out.println(lines + x + lines);

    }

    @Override
    public String getOutput() {
        return output;
    }
}
