package Exercise6;

import Exercise6.Mocks.RandomNotEqualsBothDefined;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static Exercise6.Cell.State.*;
import static org.junit.jupiter.api.Assertions.*;

public class CellNotCoincAnyOne implements CellTestInt{
    Cell cell;
    RandomIntf ranadom;

    @Override
    @BeforeEach
    public void setup() {
        cell = new Cell();
        ranadom = new RandomNotEqualsBothDefined();
        cell.setRandom(ranadom);
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
