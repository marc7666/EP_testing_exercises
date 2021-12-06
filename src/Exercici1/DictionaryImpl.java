package Exercici1;

import Exercici1.Exceptions.DefinedException;
import Exercici1.Exceptions.NotDefinedException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DictionaryImpl implements Dictionary {

    private HashMap<String, List<String>> dictionary;

    public DictionaryImpl() {
        dictionary = new HashMap<>();
    }

    @Override
    public void defineWord(String word, String definition) throws DefinedException {
        List<String> definitions;
        if (dictionary.containsKey(word)) {
            definitions = dictionary.get(word);
            if (definitions.contains(definition)) {
                throw new DefinedException("Existing definition");
            } else {
                definitions.remove(0); //Removing the null value
                definitions.add(definition);
                dictionary.put(word, definitions);
            }
        } else {
            definitions = new ArrayList<>();
            definitions.add(definition);
            dictionary.put(word, definitions);
        }
    }

    @Override
    public List<String> getDefinitions(String word) throws NotDefinedException {
        if (dictionary.containsKey(word)) {
            return dictionary.get(word);
        } else {
            throw new NotDefinedException("Word not included in the dictionary");
        }
    }
}
