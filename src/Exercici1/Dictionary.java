package Exercici1;

import Exercici1.Exceptions.AlreadyDefinedException;
import Exercici1.Exceptions.NotDefinedException;

import java.util.List;

public interface Dictionary {
    void defineWord(String word, String definition) throws AlreadyDefinedException;
    List<String> getDefinitions(String word)
        throws NotDefinedException;

}
