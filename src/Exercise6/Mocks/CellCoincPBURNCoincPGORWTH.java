package Exercise6.Mocks;

/**
 * @project: EP_testing_exercises.
 * @author: mcr99 on 21/01/2022.
 */

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
