package Exercise1;

/**
 * @project: EP_testing_exercises.
 * @author: mcr99 on 21/01/2022.
 */

import Exercise1.Exceptions.DefinedException;
import Exercise1.Exceptions.NotDefinedException;
import org.junit.jupiter.api.Test;

public interface EmptyDictionary {
    @Test
    void defineNewWord() throws DefinedException, NotDefinedException;

    @Test
    void getTheWord();
}
