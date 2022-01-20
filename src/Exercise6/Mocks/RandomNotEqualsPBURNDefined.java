package Exercise6.Mocks;

/**
 * @project: EP_testing_exercises.
 * @author: mcr99 on 21/01/2022.
 */

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
