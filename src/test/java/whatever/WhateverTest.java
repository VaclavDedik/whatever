package whatever;

import static whatever.Whatever.whatever;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class WhateverTest {
    @Test
    public void testNoExceptionIsThrown() {
        List<String> elems = new ArrayList<>();
        whatever(() -> {
            System.out.println("Do some working magic.");
            elems.add("someMagic");
        });
        assert elems.size() == 1;
    }

    @Test
    public void testRuntimeExceptionIsIgnored() {
        try {
            whatever(() -> {
                System.out.println("Do some magic.");
                throwRuntimeException();
            });
        } catch (Throwable ex) {
            Assert.fail("No exception should be thrown.");
        }
    }

    @Test
    public void testCheckedExceptionIsIgnored() {
        try {
            whatever(() -> {
                System.out.println("Do some broken magic.");
                throwCheckedException();
            });
        } catch (Throwable ex) {
            Assert.fail("No exception should be thrown.");
        }
    }

    private void throwRuntimeException() {
        throw new RuntimeException();
    }

    private void throwCheckedException() throws Exception {
        throw new Exception();
    }
}
