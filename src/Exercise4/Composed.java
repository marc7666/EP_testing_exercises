package Exercise4;

import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;

public abstract class Composed implements Task {
    public List<Task> tasks;
    public BigDecimal cost;
    public int duration;

    public Composed(List<Task> tasks, BigDecimal cost, int duration) {
        this.tasks = tasks;
        this.cost = cost;
        this.duration = duration;
    }

    public void addSubtask(Task subtask) {
        tasks.add(subtask);
        cost = new BigDecimal("0.0");
        duration = 0;
        cost = cost.add(subtask.costInEuros());
    }

    @Override
    public BigDecimal costInEuros() {
        return cost;
    }
}
