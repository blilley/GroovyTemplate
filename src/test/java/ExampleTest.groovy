import org.testng.annotations.Test

import static org.hamcrest.core.Is.*;
import static org.junit.Assert.*;

public class ExampleTest
{
    @Test
    public void nothing(){
        def example = new Example();
        def result = example.execute();

        assertThat(result, is(true));
    }

}