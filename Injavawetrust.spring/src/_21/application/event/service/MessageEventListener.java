package _21.application.event.service;

import org.springframework.context.ApplicationListener;

import _21.application.event.model.MessageEvent;

public class MessageEventListener implements ApplicationListener<MessageEvent> {

	@Override
	public void onApplicationEvent(MessageEvent event) {

		MessageEvent messageEvent = (MessageEvent) event;
		System.out.println("Message Received : " + messageEvent.getMessage());

	}

}
