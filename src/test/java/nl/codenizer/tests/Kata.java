package nl.codenizer.tests;

import org.junit.Assert;
import org.junit.Test;

public class Kata {
    @Test
    public void GivenEmptyInput_ThenZeroIsReturned()
    {
        String input = "";

        int output = AddNumbersFromString(input);

        Assert.assertEquals(output, 0);
    }

    @Test
    public void GivenInputIsOneNumber_ThenThatNumberIsReturned()
    {
        String input = "1";

        int output = AddNumbersFromString(input);

        Assert.assertEquals(output, 1);
    }

    @Test
    public void GivenInputIsTwoNumbers_ThenTheSumIsReturned()
    {
        String input = "1,2";

        int output = AddNumbersFromString(input);

        Assert.assertEquals(output, 3);
    }

    @Test
    public void GivenInputIsManyNumbers_ThenTheSumIsReturned()
    {
        String input = "1,2,3,4,5";

        int output = AddNumbersFromString(input);

        Assert.assertEquals(output, 15);
    }

    private int AddNumbersFromString(String input)
    {
        return 0;
    }
}
