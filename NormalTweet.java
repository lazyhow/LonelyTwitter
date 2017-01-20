package ca.ualberta.cs.lonelytwitter;

import java.util.Date;
/**
 * Created by Hao on 2017-01-17.
 */

public class NormalTweet extends Tweet {
    public NormalTweet(Date date, String mesage) throws TweetTooLongException{
        super(date, message);
    }
    public NormalTweet(String message) throws TweetTooLongException{
        super(message);
    }
    public Boolean isImportant(){
        return Boolean.FALSE;
    }
}
