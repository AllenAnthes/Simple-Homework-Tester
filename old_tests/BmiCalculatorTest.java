import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.contrib.java.lang.system.TextFromStandardInputStream;

import static org.junit.Assert.assertTrue;
import static org.junit.contrib.java.lang.system.TextFromStandardInputStream.emptyStandardInputStream;

public class BmiCalculatorTest {

    @Rule
    public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();

    @Rule
    public final TextFromStandardInputStream systemInMock = emptyStandardInputStream();

    @Test
    public void testBMI() {

        systemInMock.provideLines("95.5", "50");
        BmiCalculator.main(new String[]{""});
        assertTrue(systemOutRule.getLog().contains("26.8") ||
                        systemOutRule.getLog().contains("3.8544424"));

    }
}
