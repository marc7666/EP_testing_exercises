package Exercise7;

import Exercise7.Mocks.NotCoincKNotCoincProb;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static Exercise7.SIR.State.*;

public class NotCoincKNotProb implements SIRTest {
    SIR sir;
    RandomInt random;

    @Override
    @BeforeEach
    public void setup() {
        sir = new SIR();
        random = new NotCoincKNotCoincProb();
        sir.setRandom(random);
    }

    @Override
    @Test
    public void stepTest() {
        sir.step();
        assertEquals(SUSCPETIBLE, sir.getState());

    }
}
