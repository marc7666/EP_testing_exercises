package Exercise7.Mocks;

/**
 * @project: EP_testing_exercises.
 * @author: mcr99 on 21/01/2022.
 */

import Exercise7.RandomInt;

public class NotCoincKNotCoincProb implements RandomInt {
    @Override
    public double nextPP() {
        return 0.02;
    }

    @Override
    public int nextK() {
        return 4;
    }
}
