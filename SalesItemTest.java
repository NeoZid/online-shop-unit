import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class SalesItemTest.
 *
 * @author  mik
 * @version 0.1
 */
public class SalesItemTest
{
    
    /**
     * Default constructor for test class SalesItemTest
     */
    public SalesItemTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    /**
     * Test that a comment can be added, and that the comment count is correct afterwards.
     */
    @Test
    public void testAddComment()
    {
        SalesItem salesIte1 = new SalesItem("Brain surgery for Dummies", 21998);
        assertEquals(true, salesIte1.addComment("James Duckling", "This book is great. I perform brain surgery every week now.", 4));
        assertEquals(1, salesIte1.getNumberOfComments());
    }
    
    @Test
    public void testAddCommentSameAuthor()
    {
        SalesItem salesIte1 = new SalesItem("Brain surgery for Dummies", 21998);
        assertEquals(true, salesIte1.addComment("James Duckling", "This book is great. I perform brain surgery every week now.", 4));
        assertEquals(false, salesIte1.addComment("James Duckling", "test1", 6));
        assertEquals(1, salesIte1.getNumberOfComments());
    }

    /**
     * Test that a comment using an illegal rating value is rejected.
     */
    @Test
    public void testIllegalRating()
    {
        SalesItem salesIte1 = new SalesItem("Java For Complete Idiots, Vol 2", 19900);
        assertEquals(false, salesIte1.addComment("Joshua Black", "Not worth the money. The font is too small.", -5));
    }

    /**
     * Test that a sales item is correctly initialised (name and price).
     */
    @Test
    public void testInit()
    {
        SalesItem salesIte1 = new SalesItem("test name", 1000);
        assertEquals("test name", salesIte1.getName());
        assertEquals(1000, salesIte1.getPrice());
    }

    @Test
    public void addComment()
    {
        SalesItem salesIte1 = new SalesItem("Brain Surgery for Dummies.", 9899);
        assertEquals(true, salesIte1.addComment("Fred", "Great - I perform brain surgery every week now!", 4));
    }

    @Test
    public void negativeRatingTest()
    {
        SalesItem salesIte1 = new SalesItem("asd", 10);
        assertEquals(false, salesIte1.addComment("asd", "test1", 0));
        assertEquals(true, salesIte1.addComment("Asd", "test2", 1));
        assertEquals(false, salesIte1.addComment("Asd", "test3", -1));
    }
    // 19
    @Test
    public void testFindMostHelpfulComment()
    {
        SalesItem salesIte2 = new SalesItem("Chocolate", 3);
        assertEquals(true, salesIte2.addComment("M&M's", "Best choco in world", 5));
        salesIte2.upvoteComment(0);
        assertEquals(true, salesIte2.addComment("Dairymilk", "best milk choco in world", 4));
        salesIte2.upvoteComment(1);
        salesIte2.upvoteComment(0);
        assertNotNull(salesIte2.findMostHelpfulComment());
    }
    
    
    // #20
    @Test
    public void testAll()
    {
        SalesItem salesIte1 = new SalesItem("Choco", 10);
        assertEquals(true, salesIte1.addComment("Neo", "it good", 5));
        salesIte1.showInfo();
        assertEquals("Choco", salesIte1.getName());
        assertEquals(10, salesIte1.getPrice());
        salesIte1.removeComment(0);
        assertEquals(true, salesIte1.addComment("Neo", "it really good good", 5));
        assertEquals("Choco", salesIte1.getName());
    }
}








