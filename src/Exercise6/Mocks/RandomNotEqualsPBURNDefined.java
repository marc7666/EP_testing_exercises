package Exercise6.Mocks;

import Exercise6.RandomIntf;

import java.util.Random;

import static Exercise6.Cell.*;

public class RandomNotEqualsPBURNDefined implements RandomIntf {
    @Override
    public double nextPBURN() {
        return 0.00007;
    }

    @Override
    public double nextPGROWTH() {
        return PGROWTH;
    }
}
