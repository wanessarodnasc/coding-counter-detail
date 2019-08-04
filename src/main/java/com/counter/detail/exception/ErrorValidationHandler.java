package com.counter.detail.exception;

import java.text.MessageFormat;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
* This class treated the code error to response an understandable message to this error. 
*
* @author Wanessa Nascimento
*/
@RestControllerAdvice
public class ErrorValidationHandler {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(ErrorValidationHandler.class);

	@ResponseStatus(code = HttpStatus.NOT_FOUND)
	@ExceptionHandler(MissingServletRequestParameterException.class)
	public String handlerMissingServletRequestParameterException(MissingServletRequestParameterException exception) {
		LOGGER.info(exception.getMessage());
		return exception.getMessage();
	}
	
	@ResponseStatus(code = HttpStatus.NOT_FOUND)
	@ExceptionHandler(BusinessException.class)
	public String handlerBusinessEexception(BusinessException exception) {
		LOGGER.info(MessageFormat.format("Business error. {0}", exception.getMessage()));
		return exception.getMessage();
	}
}
