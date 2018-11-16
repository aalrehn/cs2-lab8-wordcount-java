package edu.luc.cs271.wordcount;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.Arrays;
import java.util.HashMap;
public class TestWordCounter {

  // TODO complete this test class

  // TODO declare a reference to the SUT (system under test), i.e., WordCounter DONE
  private WordCounter words;
  
  @Before
  public void setUp() {
    words= new WordCounter( new HashMap<>());
  }  // TODO create the SUT instance DONE

  @After
  public void tearDown() {
    words = null;
  }  // TODO set the SUT instance to null DONE

  @Test
  public void testGetCountEmpty() {
    assertTrue(words.getCounts().isEmpty());

  } // TODO verify that the SUT initially returns an empty map DONE?

  @Test
  public void testGetCountNonEmpty() {
    words.countWords( Arrays.asList("Ameen","is", "Hoawai", "TOka", "Baraia").iterator());
    assertEquals(words.getCount("Ameen"), 1);
    assertEquals(words.getCount("is"), 1);
    assertEquals(words.getCount("Howalsk"), 0);
    assertEquals(words.getCount("Braiara"), 0);
    
    // TODO run the SUT on a specific String iterator with some repeated words, DONE??
    // then use assertions to verify the correct counts
    // do this for at least two words in the iterator and two not in the iterator
    //fail();

  }
}