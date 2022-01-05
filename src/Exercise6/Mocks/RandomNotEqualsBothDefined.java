package Exercise6.Mocks;

import Exercise6.RandomIntf;

public class RandomNotEqualsBothDefined implements RandomIntf {
    @Override
    public double nextPBURN() {
        return 0.00009;
    }

    @Override
    public double nextPGROWTH() {
        return 0.03;
    }
}
