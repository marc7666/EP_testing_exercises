package Exercise7.Mocks;

/**
 * @project: EP_testing_exercises.
 * @author: mcr99 on 21/01/2022.
 */

import Exercise7.RandomInt;

import static Exercise7.SIR.*;

public class NotCoincKCoincProb implements RandomInt {
    @Override
    public double nextPP() {
        return INFECTIONPROBABILITY;
    }

    @Override
    public int nextK() {
        return 3;
    }
}
