package sample;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class HelloWorldTest {
    @Test
    public void shouldReturnHelloWorld() {
        String result = new HelloWorld().helloWorld();
        String expected = "Hello World!";
        assertThat(result, is(expected));
    }
}
