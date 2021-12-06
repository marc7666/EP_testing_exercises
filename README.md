# Problem statements

## Easy problems ('independent' classes)

### Problem 1:

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

### Problem 2:

Consider the class _Merger_ that contains a method to shuffle two integers lists sorted increasingly and without repeated numbers, in a single list sorted as well and that has not repeated numbers.


```java
public class Merger
 public List<Integer> mergeSorted(
 List<Integer> list1,
 List<Integer> list2)
 throws IllegalArgumentException...
```

The exception is thrown when any of the arguments does not meet the precondition of being ordered increasing and not having repeating elements. 

Define unit tests to check the correct operation of this class. 

### Problem 3:

The _Receipt_ class is available that has the following methods:

```java
public class Receipt
 public void addLine(BigDecimal pricePerUnit,
 int numUnits)
 throws IsClosedException
 public void addTaxes(BigDecimal percent)
 throws IsClosedException
 public BigDecimal getTotal()...
}
```

The specifications are the following:

- _addLine_ adds a line to the receipt and it has two arguments: _numUnits_ (number of units) and _pricePerUnit_ (unitary price).
- _addTaxes_ adds to the receipt the taxes corresponding to a percentatge _percent_ and closes the receipt.
- _getTotal_ returns the total of the receipt and it can be called in any moment.

Define one or more classes of test for the class _Receipt_.
