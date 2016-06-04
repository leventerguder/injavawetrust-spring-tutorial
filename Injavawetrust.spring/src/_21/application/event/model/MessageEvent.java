package _21.application.event.model;

import org.springframework.context.ApplicationEvent;

public class MessageEvent extends ApplicationEvent {

	private static final long serialVersionUID = 1L;

	private String message;

	public MessageEvent(Object source, String message) {
		super(source);
		System.out.println("MessageEvent constructor...");
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	@Override
	public String toString() {
		return "MessageEvent [message=" + message + "]";
	}

}
