package Exercise7.Mocks;

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
