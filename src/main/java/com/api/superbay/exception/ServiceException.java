package com.api.superbay.exception;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContext;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class ServiceException extends ResponseEntityExceptionHandler {
	
	@Autowired
	private MessageSource message;
	
	private List<Error> makeListError(BindingResult binding) {
		List<Error> errors = new ArrayList<>();
		
		binding.getFieldErrors().forEach(fieldError -> {
			errors.add(new Error(message.getMessage(fieldError, LocaleContextHolder.getLocale())));
		});
		
		return errors;
	}
	
	public static class Error {
		
		private String userMessage;
		
		public Error(String userMessage) {
			this.userMessage = userMessage;
		}
		
		public String getUserMessage() {
			return userMessage;
		}
		
	}

}
