package Exercise4;

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
