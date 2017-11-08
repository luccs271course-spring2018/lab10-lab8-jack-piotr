package edu.luc.cs271.wordcount;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestWordCounter {

  // TODO complete this test class

  // TODO declare a reference to the SUT (system under test), i.e., WordCounter
  private WordCounter wordCounter1;
  private Map<String, Integer> map1;

  @Before
  public void setUp() {
    // TODO create the SUT instance
    map1 = new Hashtable<String, Integer>(0);
  }

  @After
  public void tearDown() {

    // TODO set the SUT instance to null
    wordCounter1 = null;
  }

  @Test
  public void testGetCountEmpty() {

    // TODO verify that the SUT initially returns an empty map

    WordCounter wordCounter1 = new WordCounter(map1);
    assertTrue(wordCounter1.getCounts().isEmpty());
  }

  @Test
  public void testGetCountNonEmpty() {

    // TODO run the SUT on a specific String iterator with some repeated words,
    // then use assertions to verify the correct counts
    // do this for at least two words in the iterator and two not in the iterator
    Iterator<String> test = Arrays.asList("one", "two", "one").iterator();
    WordCounter wordCounter1 = new WordCounter(map1);
    map1.put("one", 0);
    map1.put("two", 0);
    map1.put("one", 0);
    wordCounter1.countWords(test);
    Assert.assertEquals(wordCounter1.getCount("one"), 2);
    Assert.assertEquals(wordCounter1.getCount("two"), 1);
    Assert.assertEquals(wordCounter1.getCount("zero"), 0);
    Assert.assertEquals(wordCounter1.getCount("hello"), 0);
  }
}
