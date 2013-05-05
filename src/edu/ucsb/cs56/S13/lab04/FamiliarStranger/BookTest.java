package edu.ucsb.cs56.S13.lab04.FamiliarStranger;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

/**
  Test class for Book

  @author Dario Castellanos
  @version CS56, S13, lab04
  @see Book
 */

public class BookTest {

    /**
      Test case for no-arg constructor and getters
      @see Book
    */

    @Test
    public void test_NoArgConstructor_and_getters() {
	Book blank = new Book();
	assertEquals("no title", blank.getTitle());
	assertEquals(0, blank.getNumPages());
    }

    /**
      Test case for two-arg constructor and getters
      @see Book
    */

    @Test
    public void test_TwoArgConstructor_and_getters() {
	Book ATTWN = new Book("And Then There Were None", 256);
	assertEquals("And Then There Were None", ATTWN.getTitle());
	assertEquals(256, ATTWN.getNumPages());
    }

    /**
      Test case for title setter
      @see Book
    */

    @Test
    public void test_SetTitle() {
	Book TSA = new Book("blank", 320);
	TSA.setTitle("The Secret Adversary");
	assertEquals("The Secret Adversary", TSA.getTitle());
    }

    /**
      Test case for page number setter
      @see Book
    */

    @Test
    public void test_SetNumPages() {
	Book TSA = new Book("The Secret Adversary", 0);
	TSA.setNumPages(320);
	assertEquals(320, TSA.getNumPages());
    }

    /**
      Test case for toString method
      @see Book
    */

    @Test
    public void test_ToString_ATTWN() {
	Book ATTWN = new Book("And Then There Were None", 256);
	assertEquals("And Then There Were None (256 pages)", ATTWN.toString());
    }

    /**
      Test case for toString method
      @see Book
    */

    @Test
    public void test_ToString_TSA() {
	Book TSA = new Book("The Secret Adversary", 320);
	assertEquals("The Secret Adversary (320 pages)", TSA.toString());
    }

    /**
      Test case for .equals() method
      @see Book
    */

    @Test
    public void test_equals_equal1() {
	Book fake1 = new Book();
	Book fake2 = new Book();
	assertTrue(fake1.equals(fake2));
    }

    /**
      Test case for .equals() method
      @see Book
    */

    @Test
    public void test_equals_equal2() {
	Book book1 = new Book("And Then There Were None", 320);
	Book book2 = new Book("And Then There Were None", 320);
	assertTrue(book1.equals(book2));
    }

    /**
      Test case for .equals() method
      @see Book
    */

    @Test
    public void test_equals_notequal() {
	Book fake = new Book();
	Book book = new Book("And Then There Were None", 320);
	assertFalse(fake.equals(book));
    }
}
