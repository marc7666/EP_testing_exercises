package Exercise4;

/**
 * @project: EP_testing_exercises.
 * @author: mcr99 on 21/01/2022.
 */


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
