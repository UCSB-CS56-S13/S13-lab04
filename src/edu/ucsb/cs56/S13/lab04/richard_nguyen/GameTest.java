package edu.ucsb.cs56.S13.lab04.richard_nguyen;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
/** test class for Game

@author Richard Nguyen
@version CS56, S13, lab04
@see Game

*/

public class GameTest{
    /**test no arg constructor from Game
       @see Game#Game()
    */
    @Test
    public void test_DefaultConstructor_and_getters(){
	Game game = new Game();
	assertEquals("BattleToad",game.getName());
	assertEquals(1007,game.getBarCode());
    }
    /**
       test 2 args constructor from GameTest
       @see Game#Game()
    */
    @Test
    public void test_TwoArgConstrutor_and_getters(){
	Game game = new Game("Battlefield", 1974);
	assertEquals("Battlefield", game.getName());
	assertEquals(1974, game.getBarCode());
    }
    /**
       test getName from Game
       @see Game#getName()
    */
    @Test 
    public void testGetName(){
	Game game = new Game("Battlefield", 4113);
        assertEquals("Battlefield", game.getName());
    }
    /**
       test getBarCode from Game
       @see Game#getBarCode()
    */
    @Test
    public void testGetBarCode(){
        Game game = new Game("Battlefield", 4113);
        assertEquals(4113, game.getBarCode());
    }
    /**
       test setName from Game
       @see Game#setName()
    */

    @Test
    public void testSetName(){
	Game game = new Game();
	game.setName("COD");
	assertEquals("COD",game.getName());
    }
    /**
       test setBarCode from Game
       @see Game#setBarCode()
    */

    @Test
    public void testSetBarCode(){
        Game game = new Game();
        game.setBarCode(452);
        assertEquals(452,game.getBarCode());
    }
    /**
       test equal from Game
       @see Game#equal()
    */

    @Test
    public void testEqual(){
	Game game = new Game("CS56",5656);
	Game game1= new Game("CS56",5656);
	assertEquals(true, game.equal(game1));
    }
    @Test
    public void test_toString(){
	Game game = new Game("Skyfall" ,2013);
	assertEquals("[Skyfall: 2013]",game.toString());
	    
    }
}
