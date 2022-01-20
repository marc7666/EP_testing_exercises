package Exercise6.Mocks;

/**
 * @project: EP_testing_exercises.
 * @author: mcr99 on 21/01/2022.
 */

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
