# Problem statements

## Problem 1:

We will use the class _Dictionary_ to implement a dictionary where each word (dictionary entry) could have more than one meanings or definitions.

Thus, we will consider the following definitions:

First of all the interface that will contain the methods that the class will implement:

```java
public interface Dictionary {
    void defineWord(String word, String definition) throws WordWithDefinitionException;
    List<String> getDefinitions(String word)
        throws WordWithoutDefinitionException;

}
```

Second, the class:

```java
public class DictionaryImpl implements Dictionary {
 ...
}
```

with the following specification:

  - _defineWord_ adds a definition to the existing ones of a word, or adds it as a new entrance, if this doesn't exists in the dictionary yet.
  
  - _getDefinitions_ obtains the list of definitions associated to a word. In case the word doesn't exist in the dictionary the method will throw the exception _NotDefinedException_.
  
  Task:
  
  Define one or more testing classses for the class _DictionaryImpl_, taking into account all of the possible test cases, in order to prepare a sufficiently exhaustive set of unitary tests.
  
  What other exception should be defined?
