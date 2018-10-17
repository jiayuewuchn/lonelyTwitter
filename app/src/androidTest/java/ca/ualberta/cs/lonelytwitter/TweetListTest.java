package ca.ualberta.cs.lonelytwitter;

import android.test.ActivityInstrumentationTestCase2;

public class TweetListTest extends ActivityInstrumentationTestCase2<LonelyTwitterActivity>{
    public TweetListTest() {
        super(LonelyTwitterActivity.class);
    }
    // test method for adding tweet into TweetList
    public void testAddTweet(){
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("added tweet");
        TweetList.add(tweet);
        assertTrue(TweetList.hasTweet(tweet));

        assertTrue(Boolean.FALSE);

    }
    // test method for checking whether a tweet is in the TweetList
    public void testHasTweet(){
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("Hello");

        assertFalse(TweetList.hasTweet(tweet));
        TweetList.add(tweet);
        assertTrue(TweetList.hasTweet(tweet));

    }
    public void testGetTweet(){
        TweetList tweetlist = new TweetList();
        Tweet tweet = new NormalTweet("get tweet check");
        TweetList.add(tweet);
        Tweet retrieveTweet = tweetlist.getTweet(0);
        assertEquals(retrieveTweet.getMessage(), tweet.getMessage());
        assertEquals(retrieveTweet.getDate(), tweet.getDate());
    }

    public void testDeleteTweet(){
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("delete tweet");

        TweetList.add(tweet);
        TweetList.delete(tweet);

        assertFalse(TweetList.hasTweet(tweet));

    }
}
