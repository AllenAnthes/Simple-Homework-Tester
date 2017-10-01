import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.contrib.java.lang.system.TextFromStandardInputStream;

import java.lang.reflect.Method;

import static org.junit.Assert.assertTrue;
import static org.junit.contrib.java.lang.system.TextFromStandardInputStream.emptyStandardInputStream;


public class TestInputOutput {

    @Rule
    public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();

    @Rule
    public final TextFromStandardInputStream systemInMock = emptyStandardInputStream();

    private void test(String className, String[] input, String outputContains) throws Exception {

        systemInMock.provideLines(input);

        Class<?> c = Class.forName(className);
        Method main =c.getMethod("main", String[].class);
        main.invoke(null, (Object) null);

        assertTrue(systemOutRule.getLog().contains(outputContains));
    }

    @Test
    public void testCylinderVolume() throws Exception {
        test("CylinderVolume", new String[] {"5.5", "12"}, "1140");
    }

    @Test
    public void testBmiCalculator() throws Exception {
        test("BmiCalculator", new String[] {"95.5", "50"}, "26.8");
    }

    @Test
    public void testComputeExpression() throws Exception {
        test("ComputeExpression", new String[] {}, "0.8392857142857143");
    }

    @Test
    public void testEnergyCalculator() throws Exception {
        test("EnergyCalculator", new String[] {"55.5", "3.5", "10.5"}, "1625484.0");
    }

    @Test
    public void testTipCalculator() throws Exception {
        test("TipCalculator", new String[] {"10", "15"}, "11.5");
    }

    @Test
    public void testSumOfDigits() throws Exception {
        test("SumOfDigits", new String[] {"123"}, "6");
    }
}
