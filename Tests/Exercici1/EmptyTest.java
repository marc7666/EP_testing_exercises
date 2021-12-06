package Exercici1;

import org.junit.jupiter.api.BeforeEach;

public class EmptyTest implements EmptyDictionary {
    private DictionaryImpl dictionary;

    @BeforeEach
    void setup(){
        dictionary = new DictionaryImpl();

    }

    @Override
    public void defineNewWord() {

    }

    @Override
    public void getTheWord() {

    }
}
