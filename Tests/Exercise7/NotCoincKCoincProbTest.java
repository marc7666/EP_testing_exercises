package Exercise7;

/**
 * @project: EP_testing_exercises.
 * @author: mcr99 on 21/01/2022.
 */

import Exercise7.Mocks.NotCoincKCoincProb;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static Exercise7.SIR.State.*;

public class NotCoincKCoincProbTest implements SIRTest{
    SIR sir;
    RandomInt random;


    @Override
    @BeforeEach
    public void setup() {
        sir = new SIR();
        random = new NotCoincKCoincProb();
        sir.setRandom(random);
    }

    @Override
    @Test
    public void stepTest() {
        sir.step();
        assertEquals(INFECTED, sir.getState());
        sir.step();
        assertEquals(INFECTED, sir.getState());
    }
}
