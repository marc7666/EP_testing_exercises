package Exercici1;

import Exercici1.Exceptions.DefinedException;
import Exercici1.Exceptions.NotDefinedException;
import org.junit.jupiter.api.Test;

public interface EmptyDictionary {
    @Test
    void defineNewWord() throws DefinedException, NotDefinedException;

    @Test
    void getTheWord();
}
