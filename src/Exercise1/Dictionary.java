package Exercise1;

/**
 * @project: EP_testing_exercises.
 * @author: mcr99 on 21/01/2022.
 */

import Exercise1.Exceptions.DefinedException;
import Exercise1.Exceptions.NotDefinedException;

import java.util.List;

public interface Dictionary {
    void defineWord(String word, String definition) throws DefinedException;
    List<String> getDefinitions(String word)
        throws NotDefinedException;

}
