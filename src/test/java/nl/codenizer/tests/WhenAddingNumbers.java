package nl.codenizer.tests;

import com.sun.deploy.util.StringUtils;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by sauron on 30/01/2017.
 */
public class WhenAddingNumbers {
    @Test
    public void GivenAnEmptyString_ThenResultIsZero()
    {
        // Given
        String input = "";

        // When
        int result = WhenAddingTheNumbers(input);

        // Then
        Assert.assertEquals(0, result);
    }

    @Test
    public void GivenAStringWithOneNumber_ThenTheResultIsThatNumber()
    {
        // Given
        String input = "5";

        // When
        int result = WhenAddingTheNumbers(input);

        // Then
        Assert.assertEquals(5, result);
    }

    @Test
    public void GivenAStringWithTwoNumbers_ThenTheResultIsTheirSum()
    {
        // Given
        String input = "1,2";

        // When
        int result = WhenAddingTheNumbers(input);

        // Then
        Assert.assertEquals(3, result);
    }

    @Test
    public void GivenAStringWithMultipleNumbers_ThenTheResultIsTheirSum()
    {
        // Given
        String input = "1,2,3,4,5";

        // When
        int result = WhenAddingTheNumbers(input);

        // Then
        Assert.assertEquals(15, result);
    }

    private int WhenAddingTheNumbers(String input)
    {
        return AddNumbers(input);
    }

    /*
    This is the version of AddNumbers that we ended up with in
    the workshop. A further refactored version can be seen below.
     */
    private int AddNumbers(String input)
    {
        if(input == "") {
            return 0;
        }

        Integer sum = 0;

        while(input.length() > 0)
        {
            int position = input.indexOf(',');

            String part;
            int length;

            if(position < 0) {
                part = input;
                length = input.length();
            }
            else {
                part = input.substring(0, position);
                length = part.length() + 1;
            }

            Integer numberOne = Integer.parseInt(part);

            sum += numberOne;

            input = input.substring(length);
        }

        return sum;
    }

    /*
    This is the final refactored version of AddNumbers above.
    It simplifies the solution by leveraging StringUtils to perform
    the parsing and splitting of the string.
     */
    private int AddNumbersFinalRefactoring(String input) {
        String[] parts = StringUtils.splitString(input, ",");

        Integer sum = 0;

        for (String part : parts) {
            sum += Integer.parseInt(part);
        }

        return sum;
    }
}
