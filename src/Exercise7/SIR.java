package Exercise7;

public class SIR {
    public static int K = 1;
    public static double INFECTIONPROBABILITY = 0.01;
    public State state = State.SUSCPETIBLE;
    RandomInt random;

    public enum State {
        SUSCPETIBLE,
        INFECTED,
        RECOVERED
    }

    public SIR(int k) {
        K = k;
    }

    public State getState() {
        return state;
    }

    public void setK(int k) {
        K = k;
    }

    public static void setpP(double newProbability) {
        SIR.INFECTIONPROBABILITY = newProbability;
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
}
