package org.webapi.jevabrains.messenger.service;

import java.util.ArrayList;
import java.util.List;

import org.webapi.jevabrains.messenger.model.Message;

public class MessageService {

	public List<Message> getAllMessages(){
		Message m1 = new Message(1, "Hello World!", "Dami");
		Message m2 = new Message(2, "Hello Jersey!", "Temi");
		List<Message> list = new ArrayList<>();
		list.add(m1);
		list.add(m2);
		return list;
	}
}
