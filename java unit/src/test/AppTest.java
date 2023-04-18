package test;

import app.JunitExam;
import org.junit.Assert;
import org.junit.Test;

public class AppTest {

    private Object IllegalArgumentException;

    @Test
    public void testlenOne() {
        Assert.assertEquals(2, JunitExam.wordsCount(new String[]{"a", "bb", "b", "ccc"}, 1));
    }

    @Test
    public void testlenTwo() {
        Assert.assertEquals(1, JunitExam.wordsCount(new String[]{"a", "bb", "b", "ccc"}, 2));
    }

    @Test
    public void testlenThree() {
        Assert.assertEquals(1, JunitExam.wordsCount(new String[]{"a", "bb", "b", "ccc"}, 3));
    }

    @Test
    public void testlenFour() {
        Assert.assertEquals(0, JunitExam.wordsCount(new String[]{"a", "bb", "b", "ccc"}, 4));
    }

    @Test
    public void testlenMoreThanThree() {
        Assert.assertEquals(0, JunitExam.wordsCount(new String[]{"a", "bb", "b", "ccc"}, 100));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testlenEqualsZero() {  
        Assert.assertEquals("IllegalArgumentException", JunitExam.wordsCount(new String[]{"a", "bb", "b", "ccc"}, 0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testlenLessThanZero(){  
        Assert.assertEquals("IllegalArgumentException", JunitExam.wordsCount(new String[]{"a", "bb", "b", "ccc"}, -100));
    }
}
