package pattern.behavioral.chainofresponsibility.filter;

import java.util.Collection;

public abstract class Filter {
    private Filter next;

    public Filter link(Filter filter) {
        next = filter;
        return next;
    }

    public abstract boolean filter(Collection<Integer> request);

    public boolean getNext(Collection<Integer> request) {
        if (next == null) {
            return true;
        } else {
            return next.filter(request);
        }
    }
}
