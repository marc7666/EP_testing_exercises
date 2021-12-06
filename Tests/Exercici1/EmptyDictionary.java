package Exercici1;

import Exercici1.Exceptions.WordWithDefinitionException;
import Exercici1.Exceptions.WordWithoutDefinitionException;
import org.junit.jupiter.api.Test;

public interface EmptyDictionary {
    @Test
    void defineNewWord() throws WordWithDefinitionException, WordWithoutDefinitionException;

    @Test
    void getTheWord();
}
