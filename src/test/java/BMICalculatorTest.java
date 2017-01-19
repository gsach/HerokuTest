import org.jmock.Expectations;
import org.jmock.Mockery;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by ape12 on 19/01/2017.
 */
public class BMICalculatorTest {
    Mockery context = new Mockery();

    @Test
    public void getBMI() {
        BMICalculator bmiCalculator = context.mock(BMICalculator.class);

        context.checking(new Expectations(){{
            allowing(bmiCalculator).calculate(75, 150);
                will(returnValue(33));
        }});

        BMI bmi = new BMI(bmiCalculator);

        Assert.assertEquals((long)33, (long)bmi.calculate(75, 150));
    }
}
