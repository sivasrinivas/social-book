package com.sivasrinivas.socialbook.model;

import java.util.Date;

/**
 * @author samara
 */
public class Message {

    private int id;
    private String author;
    private Date dateCreated;
    private String message;

    public Message() {
    }

    public Message(int id, String author, String message) {
        this.id = id;
        this.author = author;
        this.dateCreated = new Date();
        this.message = message;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
