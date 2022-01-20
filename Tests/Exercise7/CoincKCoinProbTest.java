package Exercise7;

/**
 * @project: EP_testing_exercises.
 * @author: mcr99 on 21/01/2022.
 */

import Exercise7.Mocks.CoincKCoincProb;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static Exercise7.SIR.State.*;

public class CoincKCoinProbTest implements SIRTest {
    SIR sir;
    RandomInt random;

    @Override
    @BeforeEach
    public void setup() {
        sir = new SIR();
        random = new CoincKCoincProb();
       sir.setRandom(random);
    }

    @Override
    @Test
    public void stepTest() {
        sir.step();
        assertEquals(INFECTED, sir.getState());
        sir.step();
        assertEquals(RECOVERED, sir.getState());

    }
}
