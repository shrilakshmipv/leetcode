import org.junit.Test;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ContainsDuplicates2Test {

    @Test
    public void testContainsDuplicates() {
        ContainsDuplicates2 containsDuplicates2 = new ContainsDuplicates2();
        int[] numsList = {1, 2, 3, 4, 5, 6};
        assertFalse(containsDuplicates2.containsDuplicates(numsList));
    }

    @Test
    public void testContainsDuplicatesWithNull() {
        ContainsDuplicates2 containsDuplicates2 = new ContainsDuplicates2();
        assertFalse(containsDuplicates2.containsDuplicates(null));
    }

    @Test
    public void testContainsDuplicatesWithDuplicates() {
        ContainsDuplicates2 containsDuplicates2 = new ContainsDuplicates2();
        int[] numsList = {1, 2, 3, 4, 5, 1};
        assertTrue(containsDuplicates2.containsDuplicates(numsList));
    }
    
    // add more tests
}
