package Exercise4;

/**
 * @project: EP_testing_exercises.
 * @author: mcr99 on 21/01/2022.
 */

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;


public class SequentialEmptyTest implements SchedulingTasksInterface {
    Sequential seq;

    @Override
    @BeforeEach
    public void setup() {
        seq = new Sequential();
    }

    @Override
    @Test
    public void addSimpleSubtaskTest() {
        Simple s = new Simple(new BigDecimal("12.0"), 56);
        seq.addSubtask(s);
        assertEquals(new BigDecimal("12.0"), seq.costInEuros());

    }

    @Override
    @Test
    public void addComposedSubtaskTest() {
        Parallel pr;
        Task t1, t2;

        pr = new Parallel();
        t1 = new Simple(new BigDecimal("75.0"), 45);
        t2 = new Simple(new BigDecimal("100.0"), 13);
        pr.addSubtask(t1);
        pr.addSubtask(t2);
        seq.addSubtask(pr);
        assertEquals(new BigDecimal("175.0"), seq.costInEuros());
        assertEquals(45, seq.durationInDays());

    }
}
