package Exercise4;


public class Parallel extends Composed implements Task {

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
