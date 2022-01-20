package Exercise4;

/**
 * @project: EP_testing_exercises.
 * @author: mcr99 on 21/01/2022.
 */

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

public class SequentialNotEmpty implements SchedulingTasksInterface {
    Sequential seq;
    Task task;

    @Override
    @BeforeEach
    public void setup() {
        seq = new Sequential();
        task = new Simple(new BigDecimal("50.0"), 14);
        seq.addSubtask(task);
        task = new Simple(new BigDecimal("60.0"), 10);
        seq.addSubtask(task);
    }

    @Override
    @Test
    public void addSimpleSubtaskTest() {
        task = new Simple(new BigDecimal("75.0"), 7);
        seq.addSubtask(task);
        assertEquals(31, seq.durationInDays());
        assertEquals(new BigDecimal("185.0"), seq.costInEuros());

    }

    @Override
    @Test
    public void addComposedSubtaskTest() {
        Parallel pr;
        Task t1, t2;

        pr = new Parallel();
        t1 = new Simple(new BigDecimal("50.0"), 5);
        t2 = new Simple(new BigDecimal("20.0"), 40);
        pr.addSubtask(t1);
        pr.addSubtask(t2);
        seq.addSubtask(pr);
        assertEquals(new BigDecimal("180.0"), seq.costInEuros());
        assertEquals(64, seq.durationInDays());
    }
}
