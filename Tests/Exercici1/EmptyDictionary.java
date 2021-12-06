package Exercici1;

import Exercici1.Exceptions.AlreadyDefinedException;
import Exercici1.Exceptions.NotDefinedException;
import org.junit.jupiter.api.Test;

public interface EmptyDictionary {
    @Test
    void defineNewWord() throws AlreadyDefinedException, NotDefinedException;

    @Test
    void getTheWord();
}
