package edu.ucsb.cs56.S13.lab04.sophiamao;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/** Test class for Music

 * @author Sophia Mao
 * @version 2013/04/27 for alb04, cs56, s13
 * @see Music

 */

public class MusicTest {
    /**Test case for no argument constructor
       @see Music
    */
    public void test_Music(){
	Music song = new Music();
	assertEquals(null, song.getTrackName());
	assertEquals(0, song.getSecondsDuration());
    }

    /**Test case for two argument constructor
       @see Music
    */
    public void test_Music2(){
	Music song = new Music("Come As You Are", 219);
	assertEquals("Come As You Are", song.getTrackName());
	assertEquals(219, song.getSecondsDuration());
    }

    /**Test case for Music.setTrackName()
       @see Music
    */
    public void test_setTrackName(){
	Music song = new Music();
	song.setTrackName("Come As You Are");
	assertEquals("Come As You Are", song.getTrackName());

    }
    
    /**Test case for Music.setSecondsDuration()
       @see Music
    */
    public void test_setSecondsDuration(){
	Music song = new Music();
	song.setSecondsDuration(219);
	assertEquals(219, song.getSecondsDuration());
    }

   
    /** Test case for Music.getTrackName()
	@see Music
    */

    @Test
    public void test_getTrackName(){
	Music song = new Music("Come As You Are", 219);
	assertEquals("Come As You Are", song.getTrackName());
    }

    /**Test case for Music.getSecondsDuration()
       @see Music
    */

    @Test
    public void test_getSecondsDuration(){
	Music song = new Music("Come As You Are", 219);
	assertEquals(219, song.getSecondsDuration());
    }

    /**Test case for Music.toString()
       @see Music
    */

    @Test
    public void test_toString(){
	Music song = new Music("Come As You Are", 219);
	assertEquals("Come As You Are - 219sec", song.toString());
    }

    /**Test case for Music.equals(Music)
       @see Music
    */
    public void test_equals(){
	Music song = new Music("Come As You Are", 219);
	Music song2 = new Music("Come As You Are", 219);
	assertEquals(true, song.equals(song2));
	

    }
}
