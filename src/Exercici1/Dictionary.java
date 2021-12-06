package Exercici1;

import Exercici1.Exceptions.WordWithDefinitionException;
import Exercici1.Exceptions.WordWithoutDefinitionException;

import java.util.List;

public interface Dictionary {
    void defineWord(String word, String definition) throws WordWithDefinitionException;
    List<String> getDefinitions(String word)
        throws WordWithoutDefinitionException;

}
