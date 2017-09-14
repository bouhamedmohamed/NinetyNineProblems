package lists;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListTests {

    @Test
    public void should_return_empty_string_in_case_empty_list() {
        final ListManagementProblems listManagementProblems = new ListManagementProblems();
        Assert.assertEquals("", listManagementProblems.my_last(Collections.EMPTY_LIST));
    }

    @Test
    public void should_return_tail_element_in_case_non_empty_list() {
        final ListManagementProblems listManagementProblems = new ListManagementProblems();
        Assert.assertEquals("b", listManagementProblems.my_last(Arrays.asList(new String[]{"a", "b"})));
    }
}
