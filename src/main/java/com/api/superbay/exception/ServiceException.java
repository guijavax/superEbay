package com.api.superbay.exception;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContext;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class ServiceException extends ResponseEntityExceptionHandler {
	
	@Autowired
	private MessageSource message;

	@Override
	protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {
		List<Error> errors = makeListError(ex.getBindingResult());
		return handleExceptionInternal(ex, errors, headers, HttpStatus.BAD_REQUEST, request);
	}


	private  List<Error> makeListError(BindingResult binding) {
		List<Error> errors = new LinkedList<>();
		
		binding.getFieldErrors().forEach(fieldError -> {
			errors.add(new Error(message.getMessage(fieldError, LocaleContextHolder.getLocale())));
		});
		
		return errors;
	}
	
	public static class Error {
		
		private String userMessage;
		private String devMessage;
		
		public Error(String userMessage) {
			this.userMessage = userMessage;
		}

		public Error(String devMessage, String userMessage) {
			this.userMessage = userMessage;
			this.devMessage = devMessage;
		}
		
		public String getUserMessage() {
			return userMessage;
		}

		public String getDevMessage() { return  devMessage; }
	}

}
