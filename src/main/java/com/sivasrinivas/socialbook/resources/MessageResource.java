package com.sivasrinivas.socialbook.resources;

import com.sivasrinivas.socialbook.model.Message;
import com.sivasrinivas.socialbook.service.MessageService;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * @author sivasrinivas
 */
@Path("messages")
public class MessageResource {

    private MessageService messageService = new MessageService();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Message> getMessage() {
        return messageService.getAllMessages();
    }
}
