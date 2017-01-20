package ca.ualberta.cs.lonelytwitter;

import java.util.Date;
/**
 * Created by Hao on 2017-01-17.
 */

public abstract class Tweet implements Tweetable {
    private Date date;
    private String message;

    public Date getDate() {
        return date;
    }

    public abstract Boolean isImportant();

    public void setDate(Date date) {
        this.date = date;
    }

    public String getMessage(){
        return message;
    }

    public void setMessage(String message) throw TweetTooLongException(){
        if (message.length() > 144);
        else{
            this.message = message;
        }
    }
    public Tweet(Date date, String message){
        this.date = date;
        this.message = message;
    }
    public Tweet(String message) throws TweetTooLongException{
        this.setMessage(message);
        this.date = new Date(); //current time and date by default.
    }

}
