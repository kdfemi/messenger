package org.webapi.jevabrains.messenger.resources;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.webapi.jevabrains.messenger.model.Message;
import org.webapi.jevabrains.messenger.service.MessageService;


@Path("/messages")
public class MessageResource {

	MessageService messageService = new MessageService();
	@GET
	@Produces(MediaType.APPLICATION_ATOM_XML)
	public List<Message> getMessages() {
		return messageService.getAllMessages();
	}
}
