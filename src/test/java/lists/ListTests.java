package lists;

import org.junit.Assert;
import org.junit.Test;

import java.util.Collections;
import java.util.List;

public class ListTests {
    @Test

    public void should_return_empty_string_in_case_empty_list() {
        Assert.assertEquals("",new ListManagementProblems().lastElement(Collections.EMPTY_LIST));
    }
}
