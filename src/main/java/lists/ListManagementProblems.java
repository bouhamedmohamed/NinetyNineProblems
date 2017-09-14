package lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ListManagementProblems {

    private final String EMPTY_STRING = "";
    private final int ONE = 1;
    private final int TAIL_BUT_ONE_MIN_SIZE = 2;
    private final int FIRST_INDEX = 0;

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

    public String elementAt(List elements, int position) {
        if (elements.isEmpty())
            return EMPTY_STRING;
        else {
            if (!matchPositionInList(position, elements))
                throw new ArrayIndexOutOfBoundsException();

            return (String) elements.get(position - ONE);
        }
    }

    private boolean matchPositionInList(int position, List elements) {
        if (position > elements.size() || position < ONE)
            return false;
        return true;

    }

    public int findNumberOfElement(List elements) {
        return elements.size();
    }

    public List reverse(List elements) {
        return (List) elements.stream()
                .sorted(Collections.reverseOrder())
                .collect(Collectors.toList());
    }

    public boolean palandrom(List<String> elements) {
        if (elements.size() <= ONE)
            return true;
        if (isFirstEqualLast(elements))
            return palandrom(getNewElementsWithoutFirstAndLast(elements));
        return false;
    }

    private List<String> getNewElementsWithoutFirstAndLast(List<String> elements) {
        final int lastIndexToAdd = elements.size() - TAIL_BUT_ONE_MIN_SIZE;
        return elements.subList(ONE, lastIndexToAdd);
    }

    private boolean isFirstEqualLast(List<String> elements) {
        final int lastIndex = elements.size() - ONE;
        return elements.get(FIRST_INDEX).equals(elements.get(lastIndex));
    }

    public List flatten(List... lists) {
        List flattenList = new ArrayList();
        for (List listToAdd : lists) {

            flattenList = addElement(listToAdd, flattenList);
        }
        return flattenList;
    }

    private List addElement(List listToAdd, List flattenList) {
        for (Object element : listToAdd) {
            if (element instanceof List)
                return addElement((List) element, flattenList);
            else
                flattenList.add(element);
        }
        return flattenList;
    }

    public List compress(List<String> elements) {
        return elements.stream().distinct().collect(Collectors.toList());
    }
}
