package Exercise6.Mocks;

import Exercise6.RandomIntf;

import static Exercise6.Cell.*;

public class CellCoincPBURNCoincPGORWTH implements RandomIntf {

    @Override
    public double nextPBURN() {
        return PBURN;
    }

    @Override
    public double nextPGROWTH() {
        return PGROWTH;
    }
}
