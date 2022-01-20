package Exercise6.Mocks;

/**
 * @project: EP_testing_exercises.
 * @author: mcr99 on 21/01/2022.
 */

import Exercise6.RandomIntf;

import java.util.Random;

public class RandomGen implements RandomIntf {
    Random random;

    @Override
    public double nextPBURN() {
        return random.nextDouble();
    }

    @Override
    public double nextPGROWTH() {
        return random.nextDouble();
    }
}
