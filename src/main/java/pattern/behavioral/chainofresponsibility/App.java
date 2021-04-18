package pattern.behavioral.chainofresponsibility;

import pattern.behavioral.chainofresponsibility.filter.DivisibleFilter;
import pattern.behavioral.chainofresponsibility.filter.Filter;
import pattern.behavioral.chainofresponsibility.filter.GreaterFilter;
import pattern.behavioral.chainofresponsibility.filter.LessFilter;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class App {

    public static void main(String[] args) {
        Filter greaterFilter = new GreaterFilter(18);
        Filter lessFilter = new LessFilter(30);
        Filter divisibleFilter = new DivisibleFilter(3);
        divisibleFilter.link(greaterFilter).link(lessFilter).link(null);

        List<Integer> list = IntStream.range(1, 40).boxed().collect(Collectors.toList());
        System.out.println("Before check: " + list);
        divisibleFilter.filter(list);
    }

}
