package Exercise1;

import Exercise1.Exceptions.DefinedException;
import Exercise1.Exceptions.NotDefinedException;
import org.junit.jupiter.api.Test;

public interface NotEmptyDictionary {

    @Test
    void getExistentWord() throws NotDefinedException;

    @Test
    void defineExistentWordWithDefinition() throws DefinedException, NotDefinedException;

    @Test
    void defineExistentWord() throws DefinedException, NotDefinedException;
}
