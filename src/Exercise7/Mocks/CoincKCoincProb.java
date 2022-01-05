package Exercise7.Mocks;

import Exercise7.RandomInt;

import static Exercise7.SIR.*;

public class CoincKCoincProb implements RandomInt {

    @Override
    public double nextPP() {
        return INFECTIONPROBABILITY;
    }

    @Override
    public int nextK() {
        return K;
    }
}
