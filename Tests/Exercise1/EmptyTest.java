package Exercise1;

/**
 * @project: EP_testing_exercises.
 * @author: mcr99 on 21/01/2022.
 */

import Exercise1.Exceptions.DefinedException;
import Exercise1.Exceptions.NotDefinedException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

public class EmptyTest implements EmptyDictionary {
    private DictionaryImpl dictionary;

    @BeforeEach
    void setup() {
        dictionary = new DictionaryImpl();

    }

    @Override
    @Test
    public void defineNewWord() throws DefinedException, NotDefinedException {
        List<String> aux = List.of("Armed fighting between two or more countries or groups");
        dictionary.defineWord("War", "Armed fighting between two or more countries or groups");
        assertEquals(aux, dictionary.getDefinitions("War"));

    }

    @Override
    @Test
    public void getTheWord(){
        assertThrows(NotDefinedException.class,
                () -> dictionary.getDefinitions("War"));
    }
}
