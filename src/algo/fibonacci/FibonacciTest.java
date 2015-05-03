package algo.fibonacci;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class FibonacciTest {

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                { 0L, 0L }, { 1L, 1L }, { 2L, 1L }, { 3L, 2L }, { 4L, 3L }, { 5L, 5L }, { 6L, 8L },
                { 18L, 2584L }, { 50L, 12586269025L }
        });
    }

    @Parameter
    // first data value (0) is default
    public/* NOT private */long fInput;

    @Parameter(value = 1)
    public/* NOT private */long fExpected;

    @Test
    public void test() {
        assertEquals(fExpected, Fibonacci.compute(fInput));
    }

}
