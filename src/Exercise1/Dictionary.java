package Exercise1;

import Exercise1.Exceptions.DefinedException;
import Exercise1.Exceptions.NotDefinedException;

import java.util.List;

public interface Dictionary {
    void defineWord(String word, String definition) throws DefinedException;
    List<String> getDefinitions(String word)
        throws NotDefinedException;

}
