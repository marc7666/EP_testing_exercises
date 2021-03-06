package Exercise2;

/**
 * @project: EP_testing_exercises.
 * @author: mcr99 on 21/01/2022.
 */

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NotEmptyList {
    List<Integer> list1;
    List<Integer> list2;
    Merger merge;

    @BeforeEach
    void setup() {
        merge = new Merger();
        list1 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        list2 = List.of(10, 11, 12, 13, 14, 15, 16, 17, 18, 19);
    }

    @Test
    void mergeSortedTest() {
        List<Integer> result = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19);
        assertEquals(result, merge.mergeSorted(list1, list2));
    }

}