package Exercise6.Mocks;

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
