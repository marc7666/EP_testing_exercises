package Exercici1;

import Exercici1.Exceptions.WordWithDefinitionException;
import Exercici1.Exceptions.WordWithoutDefinitionException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class NotEmptyTest implements NotEmptyDictionary {
    private DictionaryImpl dictionary;

    @BeforeEach
    void setup() throws WordWithDefinitionException {
        dictionary = new DictionaryImpl();
        dictionary.defineWord("Car", "A road vehicle with an engine, four wheels, and seats for a small number of people");
        dictionary.defineWord("Friend", "null");
    }

    @Override
    @Test
    public void getExistentWord() throws WordWithoutDefinitionException {
        List<String> aux = List.of("A road vehicle with an engine, four wheels, and seats for a small number of people");
        assertEquals(aux, dictionary.getDefinitions("Car"));
    }

    @Override
    @Test
    public void defineExistentWordWithDefinition() {
        assertThrows(WordWithDefinitionException.class,
                () -> dictionary.defineWord("Car", "A road vehicle with an engine, four wheels, and seats for a small number of people"));

    }

    @Override
    @Test
    public void defineExistentWord() throws WordWithDefinitionException, WordWithoutDefinitionException {
        dictionary.defineWord("Friend", "A person who you know well and who you like a lot, but who is usually not a member of your family");
        List<String> aux = List.of("A person who you know well and who you like a lot, but who is usually not a member of your family");
        assertEquals(aux, dictionary.getDefinitions("Friend"));
    }


}
