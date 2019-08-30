package com.api.superbay.exception;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContext;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

/**
 * 
 * @author guilherme
 *
 */

public interface GetErrors  {

	default List<Error> createListError(BindingResult binding) {
		List<Error> error = new LinkedList<>();
		binding.getFieldErrors().forEach(fieldError -> {
			error.add(new Error(fieldError.getField()));
		});
		return error;
	}
	
	
	static class Error {
		
		private String userMessage;
		
		public Error(String userMessage) {
			this.userMessage = userMessage;
		}
		
		public String getUserMessage() {
			return userMessage;
		}
	}

}
