package Exercise4;


public class Parallel extends Composed implements Task {

    public Parallel() {
        super();
    }

    @Override
    public int durationInDays() {
        int maxDuration = 0;
        for (Task nextEl : tasks) {
            int dura = nextEl.durationInDays();
            if (dura > maxDuration) {
                maxDuration = dura;
            }
        }
        duration = maxDuration;
        return maxDuration;
    }
}
