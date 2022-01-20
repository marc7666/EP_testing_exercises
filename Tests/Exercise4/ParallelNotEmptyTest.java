package Exercise4;

/**
 * @project: EP_testing_exercises.
 * @author: mcr99 on 21/01/2022.
 */

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;


public class ParallelNotEmptyTest implements SchedulingTasksInterface {
    Parallel pr;
    Task t;

    @Override
    @BeforeEach
    public void setup() {
        Parallel pr1;
        pr = new Parallel();
        pr1 = new Parallel();
        t = new Simple(new BigDecimal("50.0"), 14);
        pr1.addSubtask(t);
        t = new Simple(new BigDecimal("75.0"), 7);
        pr1.addSubtask(t);
        pr.addSubtask(pr1);
    }

    @Override
    @Test
    public void addSimpleSubtaskTest() {
        Simple s = new Simple(new BigDecimal("75.0"), 7);
        pr.addSubtask(s);
        assertEquals(new BigDecimal("200.0"), pr.costInEuros());
        assertEquals(14, pr.durationInDays());
    }

    @Override
    @Test
    public void addComposedSubtaskTest() {
        Parallel p;
        Sequential sq;
        Task t1, t2;

        p = new Parallel();
        t1 = new Simple(new BigDecimal("75.0"), 7);
        t2 = new Simple(new BigDecimal("30.0"), 2);
        p.addSubtask(t1);
        p.addSubtask(t2);

        pr.addSubtask(p);

        sq = new Sequential();
        t1 = new Simple(new BigDecimal("75.0"), 7);
        t2 = new Simple(new BigDecimal("30.0"), 2);
        sq.addSubtask(t1);
        sq.addSubtask(t2);

        pr.addSubtask(sq);

        assertEquals(new BigDecimal("335.0"), pr.costInEuros());
        assertEquals(14, pr.durationInDays());

    }
}
