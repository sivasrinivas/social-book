package com.sivasrinivas.socialbook.services;

import com.sivasrinivas.socialbook.database.Database;
import com.sivasrinivas.socialbook.model.Message;
import org.joda.time.DateTime;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author samara
 */
public class MessageService {

    private static Map<Long, Message> messages = Database.getMessages();

    public MessageService() {
        Message m1 = new Message(1, "siva", "hello 1");
        Message m2 = new Message(2, "srinivas", "hello 2");
        messages.put(m1.getId(), m1);
        messages.put(m2.getId(), m2);
    }

    public List<Message> getAllMessages() {
        return new ArrayList(messages.values());
    }

    public Message getMessage(long id) {
        return messages.get(id);
    }

    public Message addMessage(Message message) {
        message.setId(messages.size() + 1);
        message.setDate(new DateTime());
        messages.put(message.getId(), message);

//        //Hibernate
//        Session session = HibernateUtil.getSessionFactory().openSession();
//
//        session.beginTransaction();
//        session.save(message);
//        session.getTransaction().commit();


        return  message;
    }

    public Message updateMessage(Message message) {
        if( message.getId() <= 0 ) {
            return null;
        }
        messages.put(message.getId(), message);
        return message;
    }

    public Message removeMessage(long id) {
        messages.remove(id);
        return null;
    }
}
