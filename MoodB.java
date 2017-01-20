package ca.ualberta.cs.lonelytwitter;

import ca.ualberta.cs.Mood;

/**
 * Created by Hao on 2017-01-17.
 */

public class MoodB extends Mood {
    public class MoodB extends Mood{
        super(date, message);
    }

    public MoodA(String message) throws TweetTooLongException{
        super(message);
    }

    public Boolean isImportant(){
        return Boolean.TRUE;
    }
}
