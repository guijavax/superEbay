package com.api.superbay.exception;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContext;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Component;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

/**
 * 
 * @author guilherme
 *
 */
@ControllerAdvice
public interface GetErrors {

	default List<ServiceException.Error> createListError(BindingResult binding) {

		ServiceException serviceException = initializeException();
		List<ServiceException.Error> errors = serviceException.makeListError(binding);

		return errors;
	}

	default ServiceException initializeException () { return  new ServiceException(); }


}
