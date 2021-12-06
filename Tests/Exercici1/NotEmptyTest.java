package Exercici1;

import Exercici1.Exceptions.AlreadyDefinedException;
import Exercici1.Exceptions.NotDefinedException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class NotEmptyTest implements NotEmptyDictionary {
    private DictionaryImpl dictionary;

    @BeforeEach
    void setup() throws AlreadyDefinedException {
        dictionary = new DictionaryImpl();
        dictionary.defineWord("Car", "A road vehicle with an engine, four wheels, and seats for a small number of people");
    }

    @Override
    @Test
    public void getExistentWord() throws NotDefinedException {
        List<String> aux = List.of("A road vehicle with an engine, four wheels, and seats for a small number of people");
        assertEquals(aux, dictionary.getDefinitions("Car"));
    }

    @Override
    @Test
    public void defineExistentWord() {
        assertThrows(AlreadyDefinedException.class,
                () -> dictionary.defineWord("Car", "A road vehicle with an engine, four wheels, and seats for a small number of people"));
    }
}
