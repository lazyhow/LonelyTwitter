package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by Hao on 2017-01-17.
 */

public class ImportantTweet extends Tweet {
    public ImportantTweet(String message) throws TweetTooLongException{
        super(message);
    }
    public ImportantTweet(Date date, String message){
        super(date, message);
    }
    public Boolean isImportant(){
        return Boolean.TRUE;
    }
    @Override
    public String getMessage(){
        return super.getMessage() + "!!!!";
    }
}
