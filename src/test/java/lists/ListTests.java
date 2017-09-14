package lists;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

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
        Assert.assertEquals("b", listManagementProblems.my_last(Arrays.asList(new String[]{"a", "b"})));
    }

    @Test
    public void should_return_empty_string_when_empty_list() {
        Assert.assertEquals("", listManagementProblems.my_last_but_one(Collections.EMPTY_LIST));
    }

    @Test
    public void should_return_empty_string_when_list_size_is_equal_one() {
        Assert.assertEquals("", listManagementProblems.my_last_but_one(Arrays.asList(new String[]{"b"})));
    }

    @Test
    public void should_return_last_but_one_element_when_list_size_is_bigger_that_one() {
        Assert.assertEquals("a", listManagementProblems.my_last_but_one(Arrays.asList(new String[]{"a","b"})));
    }
}
