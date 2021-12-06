package Exercici1;

import Exercici1.Exceptions.AlreadyDefinedException;
import Exercici1.Exceptions.NotDefinedException;
import org.junit.jupiter.api.Test;

public interface NotEmptyDictionary {

    @Test
    void getExistentWord() throws NotDefinedException;

    @Test
    void defineExistentWordWithDefinition() throws AlreadyDefinedException, NotDefinedException;

    @Test
    void defineExistentWord() throws AlreadyDefinedException, NotDefinedException;
}
