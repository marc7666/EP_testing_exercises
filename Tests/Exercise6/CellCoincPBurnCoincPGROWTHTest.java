package Exercise6;

/**
 * @project: EP_testing_exercises.
 * @author: mcr99 on 21/01/2022.
 */

import Exercise6.Mocks.CellCoincPBURNCoincPGORWTH;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static Exercise6.Cell.State.*;
import static org.junit.jupiter.api.Assertions.*;


public class CellCoincPBurnCoincPGROWTHTest implements CellTestInt {
    private Cell cell;
    private RandomIntf random;

    @Override
    @BeforeEach
    public void setup() {
        cell = new Cell();
        random = new CellCoincPBURNCoincPGORWTH();
        cell.setRandom(random);
    }

    @Override
    @Test
    public void stepTest() {
        cell.step(false);
        assertEquals(TREE, cell.getState());
        cell.step(false);
        assertEquals(BURNING, cell.getState());
        cell.step(false);
        assertEquals(EMPTY, cell.getState());
        cell.step(false);
        assertEquals(TREE, cell.getState());
        cell.step(true);
        assertEquals(BURNING, cell.getState());

    }
}
