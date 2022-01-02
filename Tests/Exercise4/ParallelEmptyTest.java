package Exercise4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;

public class ParallelEmptyTest {
    Parallel pr;


    @BeforeEach
    public void setup() {
        pr = new Parallel();
    }


    @Test
    public void addSimpleSubtaskTest() {
        Simple s = new Simple(new BigDecimal("122.0"), 46);
        pr.addSubtask(s);
        assertEquals(new BigDecimal("122.0"), pr.costInEuros());
        assertEquals(46, pr.durationInDays());
        Simple s2 = new Simple(new BigDecimal("175.0"), 123);
        pr.addSubtask(s2);
        assertEquals(new BigDecimal("297.0"), pr.costInEuros());
        assertEquals(123, pr.durationInDays());

    }
}