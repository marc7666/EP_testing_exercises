package Exercise4;

/**
 * @project: EP_testing_exercises.
 * @author: mcr99 on 21/01/2022.
 */

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public abstract class Composed implements Task {
    public List<Task> tasks;
    public BigDecimal cost;
    public int duration;

    public Composed() {
        this.tasks = new ArrayList<>();
        this.cost = new BigDecimal("0.0");
        this.duration = 0;
    }

    public void addSubtask(Task subtask) {
        tasks.add(subtask);
        cost = cost.add(subtask.costInEuros());
    }

    @Override
    public BigDecimal costInEuros() {
        return cost;
    }
}
