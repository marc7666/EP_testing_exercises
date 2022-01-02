package Exercise5;

import org.junit.jupiter.api.Test;

public interface IsClosedReceipt {

    void setup();

    @Test
    void addLineTest();

    @Test
    void addTaxesTest();
}
