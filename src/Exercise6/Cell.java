package Exercise6;

import javax.swing.plaf.nimbus.State;
import java.util.Random;

public class Cell {
    public static double PBURN = 0.00006;
    public static double PGROWTH = 0.01;
    private State state;
    public RandomIntf random;

    public enum State {
        EMPTY,
        TREE,
        BURNING
    }

    public Cell() {
        this.state = State.EMPTY;
    }

    public State getState() {
        return this.state;
    }

    public void step(boolean hasBurningNeighbour) {
        double pF = random.nextPBURN();
        double pP = random.nextPGROWTH();
        switch (state) {
            case TREE:
                if (pF == PBURN || hasBurningNeighbour) {
                    state = State.BURNING;
                }
                break;
            case EMPTY:
                if (pP == PGROWTH) {
                    state = State.TREE;
                }
                break;
            case BURNING:
                state = State.EMPTY;
                break;
        }
    }

    public void setRandom(RandomIntf random) {
        this.random = random;
    }
}
