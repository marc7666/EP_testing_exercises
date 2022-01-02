package Exercise4;


public class Sequential extends Composed implements Task {

    public Sequential() {
        super();
    }

    @Override
    public int durationInDays() {
        for (Task tasks : tasks) {
            duration += tasks.durationInDays();
        }
        return duration;
    }
}
