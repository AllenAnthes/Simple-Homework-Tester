import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;

import static org.junit.Assert.assertTrue;


public class ComputeExpressionTest {

    @Rule
    public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();

    @Test
    public void testCompute() {
        ComputeExpression.main(new String[] {});
        assertTrue(systemOutRule.getLog().contains("0.8392857142857143"));
    }
}
