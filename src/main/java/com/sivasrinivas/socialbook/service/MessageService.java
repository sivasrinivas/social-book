package com.sivasrinivas.socialbook.service;

import com.sivasrinivas.socialbook.model.Message;

import java.util.ArrayList;
import java.util.List;

/**
 * @author samara
 */
public class MessageService {

    public List<Message> getAllMessages() {
        Message m1 = new Message(1, "siva", "hello 1");
        Message m2 = new Message(2, "srinivas", "hello 2");
        List<Message> messageList = new ArrayList<Message>();
        messageList.add(m1);
        messageList.add(m2);
        return  messageList;
    }

}
