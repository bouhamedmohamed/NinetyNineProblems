package lists;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Collections;
import java.util.List;

import static java.util.Arrays.asList;

public class ListTests {


    private ListManagementProblems listManagementProblems;

    @Before
    public void setUp() throws Exception {
        listManagementProblems = new ListManagementProblems();
    }

    @Test
    public void should_return_empty_string_in_case_empty_list() {
        Assert.assertEquals("", listManagementProblems.my_last(Collections.EMPTY_LIST));
    }

    @Test
    public void should_return_tail_element_in_case_non_empty_list() {
        Assert.assertEquals("b", listManagementProblems.my_last(asList("a", "b")));
    }

    @Test
    public void should_return_empty_string_when_empty_list() {
        Assert.assertEquals("", listManagementProblems.my_last_but_one(Collections.EMPTY_LIST));
    }

    @Test
    public void should_return_empty_string_when_list_size_is_equal_one() {
        Assert.assertEquals("", listManagementProblems.my_last_but_one(asList("b")));
    }

    @Test
    public void should_return_last_but_one_element_when_list_size_is_bigger_that_one() {
        Assert.assertEquals("a", listManagementProblems.my_last_but_one(asList("a", "b")));
    }

    @Test
    public void should_return_empty_string_when_list_size_is_empty() {
        Assert.assertEquals("", listManagementProblems.elementAt(Collections.EMPTY_LIST, 0));
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void should_return_exception_when_position_doesnt_match_in_list() {
        listManagementProblems.elementAt(asList("a", "b", "c"), 4);
    }

    @Test
    public void should_return_element_at_given_position() {
        Assert.assertEquals("b", listManagementProblems.elementAt(asList("a", "b"), 2));
    }

    @Test
    public void should_return_zero_when_empty_list() {
        Assert.assertEquals(0, listManagementProblems.findNumberOfElement(Collections.EMPTY_LIST));
    }

    @Test
    public void should_return_2_when_list_has_two_element() {
        Assert.assertEquals(2, listManagementProblems.findNumberOfElement(asList("a", "b")));
    }

    @Test
    public void should_return_empty_list_in_case_of_emptylist() {
        Assert.assertEquals(Collections.EMPTY_LIST, listManagementProblems.reverse(Collections.EMPTY_LIST));
    }

    @Test
    public void should_return_reversed_list_when_list_has_two_element() {
        final List reverse = listManagementProblems.reverse(asList("a", "b"));
        Assert.assertEquals("b", reverse.get(0));
        Assert.assertEquals("a", reverse.get(1));
    }

    @Test
    public void should_return_true__when_list_is_empty() {
        final boolean palandrom = listManagementProblems.palandrom(Collections.EMPTY_LIST);
        Assert.assertEquals(true, palandrom);

    }

    @Test
    public void should_return_true__when_list_has_one_element() {
        final boolean palandrom = listManagementProblems.palandrom(asList("a"));
        Assert.assertEquals(true, palandrom);

    }

    @Test
    public void should_return_false__when_list_has_two_different_elements() {
        final boolean palandrom = listManagementProblems.palandrom(asList("a", "b"));
        Assert.assertEquals(false, palandrom);

    }

    @Test
    public void should_return_true__when_list_has_three_palandrom_elements() {
        final boolean palandrom = listManagementProblems.palandrom(asList("a", "b", "a"));
        Assert.assertEquals(true, palandrom);

    }

    @Test
    public void should_return_flatten_list() {
        final List flattedString = listManagementProblems.flatten(asList("a", asList("b", "c")), asList("d"));
        Assert.assertEquals(4, flattedString.size());
        Assert.assertEquals("a", flattedString.get(0));
        Assert.assertEquals("b", flattedString.get(1));
        Assert.assertEquals("c", flattedString.get(2));
        Assert.assertEquals("d", flattedString.get(3));
    }

    @Test
    public void should_return_compress_list() {
        final List flattedString = listManagementProblems.compress(asList("a","a","a","b","b","c","d","d"));
        Assert.assertEquals(4, flattedString.size());
        Assert.assertEquals("a", flattedString.get(0));
        Assert.assertEquals("b", flattedString.get(1));
        Assert.assertEquals("c", flattedString.get(2));
        Assert.assertEquals("d", flattedString.get(3));
    }
}
