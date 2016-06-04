package _20.messageSourceAware.service;

import java.util.Locale;

import org.springframework.context.MessageSource;
import org.springframework.context.MessageSourceAware;

public class MessageService implements MessageSourceAware {

	private MessageSource messageSource;

	@Override
	public void setMessageSource(MessageSource messageSource) {
		this.messageSource = messageSource;
	}

	public void writeMessage(String code, Object[] args, Locale locale) {
		String message = messageSource.getMessage(code, args, locale);
		System.out.println(message);
	}

}
