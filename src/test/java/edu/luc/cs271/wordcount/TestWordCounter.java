package edu.luc.cs271.wordcount;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

public class TestWordCounter {

  // TODO complete this test class

  // TODO declare a reference to the SUT (system under test), i.e., WordCounter

  @Before
  public void setUp() {
    // TODO create the SUT instance
  }

  @After
  public void tearDown() {
    // TODO set the SUT instance to null
  }

  @Test
  public void testGetCountEmpty() {

    // TODO verify that the SUT initially returns an empty map
    Map<String, Integer> map1 = new Hashtable<>();
    WordCounter wordCounterEmpty = new WordCounter(map1);
    Assert.assertTrue(wordCounterEmpty.getCounts().isEmpty());

  }

  @Test
  public void testGetCountNonEmpty() {

    // TODO run the SUT on a specific String iterator with some repeated words,
    // then use assertions to verify the correct counts
    // do this for at least two words in the iterator and two not in the iterator
    Iterator<String> test =  Arrays.asList("one","two","one").iterator();
    Map<String, Integer> map1 = new Hashtable<>();
    WordCounter wordCounterNonEmpty = new WordCounter(map1);
    map1.put("one", 0);
    map1.put("two",0);
    map1.put("one",0);
    wordCounterNonEmpty.countWords(test);
    Assert.assertEquals(wordCounterNonEmpty.getCount("one"), 2);
    Assert.assertEquals(wordCounterNonEmpty.getCount("two"), 1);

  }
}
