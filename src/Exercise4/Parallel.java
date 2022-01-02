package Exercise4;

import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;

public class Parallel extends Composed implements Task{

    public Parallel() {
        super();
    }

    @Override
    public int durationInDays() {
        int maxDuration = 0;
        for (Task nextEl : tasks) {
            if (nextEl.durationInDays() > maxDuration) {
                maxDuration = nextEl.durationInDays();
            }
        }
        duration = maxDuration;
        return maxDuration;
    }
}
