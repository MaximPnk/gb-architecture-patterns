package pattern.behavioral.chainofresponsibility.filter;

import lombok.AllArgsConstructor;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

@AllArgsConstructor
public class LessFilter extends Filter {
    private final int maxValue;

    @Override
    public boolean filter(Collection<Integer> request) {
        request = request.stream().filter(n -> n < maxValue).collect(Collectors.toCollection(ArrayList::new));
        System.out.println("After less filter: " + request);
        return request.size() > 0 && getNext(request);
    }
}
