package lists;

import java.util.List;

public class ListManagementProblems {

    private final String EMPTY_STRING = "";
    private final int ONE = 1;

    public String my_last(List elements) {
        if (elements.isEmpty())
            return EMPTY_STRING;
        else {
            final int lastElementIndex = elements.size() - ONE;
            return (String) elements.get(lastElementIndex);
        }
    }

    public String my_last_but_one(List emptyList) {
        return "";
    }
}
