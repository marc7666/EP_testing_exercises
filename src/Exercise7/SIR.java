package Exercise7;

/**
 * @project: EP_testing_exercises.
 * @author: mcr99 on 21/01/2022.
 */

public class SIR {
    public static int K = 1;
    public static double INFECTIONPROBABILITY = 0.01;
    private State state;
    public RandomInt random;

    public enum State {
        SUSCPETIBLE,
        INFECTED,
        RECOVERED
    }

    public SIR() {
        this.state = State.SUSCPETIBLE;
    }

    public State getState() {
        return state;
    }


    public void step() {
        double pP = random.nextPP();
        int newK = random.nextK();
        switch (state) {
            case SUSCPETIBLE:
                if (pP == INFECTIONPROBABILITY) {
                    state = State.INFECTED;
                }
                break;
            case INFECTED:
                if (newK == K) {
                    state = State.RECOVERED;
                }
                break;
        }
    }

    public void setRandom(RandomInt random) {
        this.random = random;
    }
}
