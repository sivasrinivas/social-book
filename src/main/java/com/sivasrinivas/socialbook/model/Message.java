package com.sivasrinivas.socialbook.model;

import org.joda.time.DateTime;

/**
 * @author samara
 */
public class Message {

    private long id;
    private String author;
    private String message;
    private DateTime date;

    public Message() {
    }

    public Message(long id, String author, String message) {
        this.id = id;
        this.author = author;
        this.message = message;
        this.date = new DateTime();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public DateTime getDate() {
        return date;
    }

    public void setDate(DateTime date) {
        this.date = date;
    }
}
