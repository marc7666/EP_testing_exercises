package Exercise2;

import acm.program.CommandLineProgram;

import java.util.ArrayList;
import java.util.List;

public class Merger extends CommandLineProgram {
    public List<Integer> mergeSorted(List<Integer> list1, List<Integer> list2) {
        if (list1.isEmpty() || list2.isEmpty()) {
            throw new IllegalArgumentException("Empty list");
        }
        List<Integer> returnValue = new ArrayList<>();
        returnValue.addAll(list1);
        returnValue.addAll(list2);
        return returnValue;
    }

    public static void main(String[] args) {
        Merger obj = new Merger();
        obj.run();
    }

    @Override
    public void run() {
        List<Integer> list1 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<Integer> list2 = List.of(10, 11, 12, 13, 14, 15, 16, 17, 18, 19);
        System.out.println(mergeSorted(list1, list2));
    }
}
