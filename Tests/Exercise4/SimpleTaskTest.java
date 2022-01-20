package Exercise4;

/**
 * @project: EP_testing_exercises.
 * @author: mcr99 on 21/01/2022.
 */

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;

public class SimpleTaskTest {
    public Simple simple;

    @BeforeEach
    public void setup() {
        BigDecimal cost = new BigDecimal("50.0");
        this.simple = new Simple(cost, 14);
    }

    @Test
    void SimpleMethodsTest() {
        BigDecimal cost = new BigDecimal("50.0");
        assertEquals(cost, simple.costInEuros());
        assertEquals(14, simple.durationInDays());
    }
}
