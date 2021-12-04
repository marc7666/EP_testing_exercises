package Exercici2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class EmptyListMergeSorted {
    List<Integer> list1;
    List<Integer> list2;
    Merger merge;

    @BeforeEach
    void setup() {
        merge = new Merger();
        list1 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        list2 = new ArrayList<>();
    }

    @Test
    void emptyListTest() {

        Throwable exception = assertThrows(IllegalArgumentException.class,
                () -> merge.mergeSorted(list1, list2));
        assertEquals("Empty list", exception.getMessage());
    }

    @Test
    void emptyList2() {
        list1 = new ArrayList<>();
        list2 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);

        Throwable exception = assertThrows(IllegalArgumentException.class,
                () -> merge.mergeSorted(list1, list2));
        assertEquals("Empty list", exception.getMessage());
    }
}
