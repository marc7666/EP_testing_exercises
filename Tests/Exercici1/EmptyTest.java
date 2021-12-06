package Exercici1;

import Exercici1.Exceptions.WordWithDefinitionException;
import Exercici1.Exceptions.WordWithoutDefinitionException;
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
    public void defineNewWord() throws WordWithDefinitionException, WordWithoutDefinitionException {
        List<String> aux = List.of("Armed fighting between two or more countries or groups");
        dictionary.defineWord("War", "Armed fighting between two or more countries or groups");
        assertEquals(aux, dictionary.getDefinitions("War"));

    }

    @Override
    @Test
    public void getTheWord(){
        assertThrows(WordWithoutDefinitionException.class,
                () -> dictionary.getDefinitions("War"));
    }
}
