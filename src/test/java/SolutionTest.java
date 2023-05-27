import org.example.Solution;
import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void stoneGameIIITest1() {
        int[] values = {1, 2, 3, 7};
        String result = "Bob";
        Assert.assertEquals(result, new Solution().stoneGameIII(values));
    }

    @Test
    public void stoneGameIIITest2() {
        int[] values = {1, 2, 3, -9};
        String result = "Alice";
        Assert.assertEquals(result, new Solution().stoneGameIII(values));
    }

    @Test
    public void stoneGameIIITest3() {
        int[] values = {1, 2, 3, 6};
        String result = "Tie";
        Assert.assertEquals(result, new Solution().stoneGameIII(values));
    }
}
