package com.music.artists.exception;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.music.artists.dto.CommonResponseDto;
import com.music.artists.service.MessageByLocaleService;

@ControllerAdvice
public class ExceptionController extends ResponseEntityExceptionHandler{
	
	@Autowired
	MessageByLocaleService localResolver;
	
	@ExceptionHandler(CommonException.class)
	public ResponseEntity<Object> genericException(CommonException res) {
		CommonResponseDto response = new CommonResponseDto();
		response.setResponseCode(res.getResponseCode() != 0 ? res.getResponseCode() : -1);
		response.setErrorCode(res.getErrorCode() != null ? res.getErrorCode() : "CMNRES");
		response.setErrorDesc(res.getErrorDesc() != null ? res.getErrorDesc() : localResolver.getErrorMessage("CMNRES"));
		return new ResponseEntity<Object>(response, HttpStatus.OK);
	}
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<Object> genericException(Exception res) {
		CommonResponseDto response = new CommonResponseDto();
		response.setResponseCode(-1);
		response.setErrorCode("CMNRES");
		response.setErrorDesc(localResolver.getErrorMessage("CMNRES"));
		return new ResponseEntity<Object>(response, HttpStatus.OK);
	}
}
