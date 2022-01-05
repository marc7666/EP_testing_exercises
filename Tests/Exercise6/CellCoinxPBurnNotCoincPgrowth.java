package Exercise6;

import Exercise6.Mocks.RandomNotEqualsPGROWTHDefined;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static Exercise6.Cell.State.*;
import static org.junit.jupiter.api.Assertions.*;

public class CellCoinxPBurnNotCoincPgrowth implements CellTestInt {
    RandomIntf random;
    Cell cell;

    @Override
    @BeforeEach
    public void setup() {
        cell = new Cell();
        random = new RandomNotEqualsPGROWTHDefined();
        cell.setRandom(random);
    }

    @Override
    @Test
    public void stepTest() {
        cell.step(false);
        assertEquals(EMPTY, cell.getState());
        cell.step(true);
        assertEquals(EMPTY, cell.getState());

    }
}
