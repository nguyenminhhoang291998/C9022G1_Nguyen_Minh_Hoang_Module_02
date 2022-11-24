package restro.exception;

import java.util.Comparator;

public class ComparatorGhost implements Comparator<Ghost> {

    @Override
    public int compare(Ghost o1, Ghost o2) {
        return o2.getName().compareTo(o1.getName());
    }
}
