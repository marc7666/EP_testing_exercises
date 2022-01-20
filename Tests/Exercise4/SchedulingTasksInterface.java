package Exercise4;

/**
 * @project: EP_testing_exercises.
 * @author: mcr99 on 21/01/2022.
 */

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public interface SchedulingTasksInterface {
    @BeforeEach
    void setup();

    @Test
    void addSimpleSubtaskTest();

    @Test
    void addComposedSubtaskTest();
}
