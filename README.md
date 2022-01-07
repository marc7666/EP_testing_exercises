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

### Problem 4:

The following classes are available that are used in a task planning system: 

```java
interface Task {
 BigDecimal costInEuros();
 int durationInDays();
 }
 
 public class Simple implements Task ...
    public Simple(BigDecimal euros, int days)
    public BigDecimal costInEuros()
    public int durationInDays()

 public abstract class Composed implements Task...
    public void addSubtask(Task subtask)
    public BigDecimal costInEuros()

 public class Sequential extends Composed implements Task ...
    public int durationInDays()

 public class Parallel extends Composed implements Task ...
    public int durationInDays()
```

Specifications are as follows:
- The cost and duration of a simple task are those indicated in the constructor.
- The addSubtask method adds a _subtask_ to a compound task.
- In a compound task, the cost is the sum of the costs of the subtasks (to be obtained using the _costInEuros_ method).
- In a sequential task, the duration is the sum of the durations of the subtasks (to be obtained using the _durationInDays_ method).
- In a parallel task, the duration is the maximum of the subtask durations (_durationInDays_ method).
Define unit tests to check the correct operation of these classes. 

## Problems using doubles

### Problem 5

Problem 3 presented a Receipt class that was unrealistic since, normally, the information on prices and description of the products would reside in a database, which is accessed by the product identifier. 

Therefore, the new version will have the form: 

```java
public class Receipt
 private ProductsDB = new ProductsDB();
 public void addLine(String productID, int numUnits) throws IsClosedException, DoesNotExistException
 public void addTaxes(BigDecimal percent) throws IsClosedException
```

What we want is to be able to test this version of the _Receipt_ class independently of the database (you can reference it _ProductDB_). Modify and / or add what is necessary to be able to test the Receipt class independently and develop a set of tests that test its functionality.
The operation in which we are interested in the database is:
```java
public BigDecimal getPrice (String productID) throws DoesNotExistException;
```
Now the new version of _addLine_ also throws _DoesNotExistException_ when it is passed a product identifier that does not exist in the DB.

Define unit tests for the _Receipt_ class defined here. 

### Problem 6

The FFM (Forest-Fire Model) simulates the evolution of a fire in a certain area 1. The FFM model consists of a grid of cells that can have three possible states:
* empty
* occupied by a tree
* Burning

The evolution of the system over time is determined by four rules running concurrently:
1. A burning cell becomes an empty space
2. A tree will burn if at least one neighboring tree is burning 
3. A tree starts to burn with probability f, even if it does not have no neighbor on fire
4. A tree sprouts in an empty space with probability p

We will focus on the Cell class, which will represent each of cells in the grid. Each cell knows the state in which it is finds and is responsible for managing transitions. 

* The class will store two constants (static members) of type double, which will be the probabilities of spontaneous combustion and the birth of a tree. 
* The constructor of this class will have no parameters, since the cells will be initially empty.
* The class will offer a method to know the state in which it is find a cell: 

```java
State getState()
```

* In addition, we will have a method that will make the cell change state according to the rules. This method will receive an additional parameter to indicate if any neighboring cells are burning: 

```java
public void step(boolean hasBurningNeighbour)
```

The class, internally, uses an instance of the java.util.Random class to generate random numbers for both probabilities. You will have to substitute it (substitute class) to be able to do the pertinent tests. To make the tests easier, you can decide how you would like the object that will be used to make the random decisions to be used (basically decide an interface with the methods that you would like it to have to generate both probabilities). These methods will serve both to implement the functionality in the application and to be substituted in the class that does double in the tests. 

### Problem 7

Another model similar to the previous one is used to simulate the spread of a disease (yes, you can also use it to model a zombie apocalypse, setting the probability of recovery to 0). The model, known as SIR (Susceptible-Infected-Recovered) is as follows: 

* Each individual can be in three possible states: S, I, R 
* Susceptible individuals can become infected spontaneously with probability p 
* Once infected, it takes K days to recover 
* The disease generates immunization, so an individual recovered no longer becomes infected again

Based on the class structure in Problem 6, define tests to check that the state of the individuals evolves in the correct way. The method in question will be: 

```java
public void step()
```
