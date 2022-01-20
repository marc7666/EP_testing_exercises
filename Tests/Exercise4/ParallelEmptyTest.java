package Exercise4;

/**
 * @project: EP_testing_exercises.
 * @author: mcr99 on 21/01/2022.
 */

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;

public class ParallelEmptyTest implements SchedulingTasksInterface {
    Parallel pr;

    @Override
    @BeforeEach
    public void setup() {
        pr = new Parallel();
    }


    @Override
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

    @Override
    @Test
    public void addComposedSubtaskTest() {
        Sequential s;
        Task t1, t2;
        s = new Sequential();
        t1 = new Simple(new BigDecimal("75.0"), 7);
        t2 = new Simple(new BigDecimal("30.0"), 2);
        s.addSubtask(t1);
        s.addSubtask(t2);
        pr.addSubtask(s);
        assertEquals(new BigDecimal("105.0"), pr.costInEuros());
        assertEquals(9, pr.durationInDays());
    }
}