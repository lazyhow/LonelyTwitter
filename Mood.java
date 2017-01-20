package ca.ualberta.cs.lonelytwitter;

import java.util.Date;
/**
 * Created by Hao on 2017-01-17.
 */

public class Mood {
    private Date date;

    public Mood(Date date, String message) throws TweetTooLongException{
        super(date, message);
    }
    public Mood(String message) throws TweetTooLongException{
        super(message);
    }
}
