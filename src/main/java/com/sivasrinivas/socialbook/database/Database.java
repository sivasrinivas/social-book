package com.sivasrinivas.socialbook.database;

import com.sivasrinivas.socialbook.model.Message;
import com.sivasrinivas.socialbook.model.Profile;

import java.util.HashMap;
import java.util.Map;

/**
 * An in-memory database class
 *
 * @author samara
 */
public class Database {

    private static Map<Long, Message> messages = new HashMap<Long, Message>();
    private static Map<Long, Profile> profiles = new HashMap<Long, Profile>();

    public static Map<Long, Message> getMessages() {
        return messages;
    }

    public static Map<Long, Profile> getProfiles() {
        return profiles;
    }
}
