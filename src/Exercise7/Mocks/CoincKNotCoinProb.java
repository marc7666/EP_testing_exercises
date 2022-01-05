package Exercise7.Mocks;

import Exercise7.RandomInt;

import static Exercise7.SIR.*;

public class CoincKNotCoinProb implements RandomInt {
    @Override
    public double nextPP() {
        return 0.02;
    }

    @Override
    public int nextK() {
        return K;
    }
}
