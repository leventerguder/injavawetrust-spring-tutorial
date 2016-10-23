package _20.messageSourceAware.service;

import org.springframework.context.MessageSource;
import org.springframework.context.MessageSourceAware;

public class MessageService implements MessageSourceAware {

	private MessageSource messageSource;

	@Override
	public void setMessageSource(MessageSource messageSource) {
		this.messageSource = messageSource;
	}

	public MessageSource getMessageSource() {
		return messageSource;
	}

}
