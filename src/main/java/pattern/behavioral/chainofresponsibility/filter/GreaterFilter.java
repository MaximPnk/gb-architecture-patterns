package pattern.behavioral.chainofresponsibility.filter;

import lombok.AllArgsConstructor;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

@AllArgsConstructor
public class GreaterFilter extends Filter {
    private final int minValue;

    @Override
    public boolean filter(Collection<Integer> request) {
        request = request.stream().filter(n -> n > minValue).collect(Collectors.toCollection(ArrayList::new));
        System.out.println("After greater filter: " + request);
        return request.size() > 0 && getNext(request);
    }
}
