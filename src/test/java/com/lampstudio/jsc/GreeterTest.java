package com.lampstudio.jsc;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by KHOAND_ADMIN on 10/13/2017.
 */
public class GreeterTest {
    @Test
    public void it_should_say_hello(){
        Greeter greeter = new Greeter("peter");
        Assert.assertEquals("Hello peter",greeter.hello());
        Assert.assertEquals("Hello jonh",greeter.hello("jonh"));
        Assert.assertNotEquals("Hello jonh",greeter.hello("peter"));
    }
}
