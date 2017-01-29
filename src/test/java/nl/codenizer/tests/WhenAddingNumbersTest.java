package nl.codenizer.tests;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by sauron on 29/01/2017.
 */
public class WhenAddingNumbersTest {
    @Test
    public void GivenEmptyInput_ThenZeroIsReturned()
    {
        String input = "";

        int output = AddNumbersFromString(input);

        assertEquals(output, 0);
    }

    private int AddNumbersFromString(String input)
    {
        return 0;
    }
}