package Exercise4;

import java.math.BigDecimal;
import java.util.List;

public class Sequential extends Composed implements Task{

    public Sequential(List<Task> tasks, BigDecimal cost, int duration) {
        super(tasks, cost, duration);
    }

    @Override
    public int durationInDays() {
        return 0;
    }
}
