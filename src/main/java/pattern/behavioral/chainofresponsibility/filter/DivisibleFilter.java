package pattern.behavioral.chainofresponsibility.filter;

import lombok.AllArgsConstructor;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

@AllArgsConstructor
public class DivisibleFilter extends Filter {
    private final int divisor;

    @Override
    public boolean filter(Collection<Integer> request) {
        request = request.stream().filter(n -> n % divisor == 0).collect(Collectors.toCollection(ArrayList::new));
        System.out.println("After divisible filter: " + request);
        return request.size() > 0 && getNext(request);
    }
}
