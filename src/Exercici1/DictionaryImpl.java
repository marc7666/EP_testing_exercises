package Exercici1;

import Exercici1.Exceptions.WordWithDefinitionException;
import Exercici1.Exceptions.WordWithoutDefinitionException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DictionaryImpl implements Dictionary {

    private HashMap<String, List<String>> dictionary;

    public DictionaryImpl() {
        dictionary = new HashMap<>();
    }

    @Override
    public void defineWord(String word, String definition) throws WordWithDefinitionException {
        List<String> definitions;
        if (dictionary.containsKey(word)) {
            definitions = dictionary.get(word);
            if (definitions.contains(definition)) {
                throw new WordWithDefinitionException("Existing definition");
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
    public List<String> getDefinitions(String word) throws WordWithoutDefinitionException {
        if (dictionary.containsKey(word)) {
            return dictionary.get(word);
        } else {
            throw new WordWithoutDefinitionException("Word not included in the dictionary");
        }
    }
}
