

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class CommentTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class CommentTest
{
    /**
     * Default constructor for test class CommentTest
     */
    public CommentTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }

    @Test
    
    // 18
    public void checkAuthorRating()
    {
        Comment comment3 = new Comment("Neo", "le best", 5);
        assertEquals("Neo", comment3.getAuthor());
        assertEquals(5, comment3.getRating());
    }
    
    // 18.5
    @Test
    public void testUpvoteDownvote()
    {
        Comment comment1 = new Comment("neo", "what it do", 8);
        comment1.upvote();
        comment1.upvote();
        assertEquals(2, comment1.getVoteCount());
        comment1.downvote();
        comment1.downvote();
        comment1.downvote();
        assertEquals(-1, comment1.getVoteCount());
    }
    
    
}



