package lists;

import java.util.List;

public class ListManagementProblems {

    private final String EMPTY_STRING = "";
    private final int ONE = 1;
    private final int TAIL_BUT_ONE_MIN_SIZE = 2;

    public String my_last(List elements) {
        if (elements.isEmpty())
            return EMPTY_STRING;
        final int lastElementIndex = elements.size() - ONE;
        return (String) elements.get(lastElementIndex);

    }

    public String my_last_but_one(List elements) {
        if (elements.size() < TAIL_BUT_ONE_MIN_SIZE)
            return EMPTY_STRING;
        final int lastElementByOneIndex = elements.size() - TAIL_BUT_ONE_MIN_SIZE;
        return (String) elements.get(lastElementByOneIndex);
    }

    public String elementAt(List<List> lists, int i) {
        return "";
    }
}
