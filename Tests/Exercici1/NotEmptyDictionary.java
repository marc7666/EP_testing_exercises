package Exercici1;

import Exercici1.Exceptions.WordWithDefinitionException;
import Exercici1.Exceptions.WordWithoutDefinitionException;
import org.junit.jupiter.api.Test;

public interface NotEmptyDictionary {

    @Test
    void getExistentWord() throws WordWithoutDefinitionException;

    @Test
    void defineExistentWordWithDefinition() throws WordWithDefinitionException, WordWithoutDefinitionException;

    @Test
    void defineExistentWord() throws WordWithDefinitionException, WordWithoutDefinitionException;
}
