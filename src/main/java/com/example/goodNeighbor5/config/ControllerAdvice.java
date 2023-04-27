package com.example.goodNeighbor5.config;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.example.goodNeighbor5.exception.ErrorResponse;
import com.example.goodNeighbor5.exception.NeighborException;

@RestControllerAdvice
public class ControllerAdvice{
	
	@ExceptionHandler(NeighborException.class)
	public ErrorResponse handleNeithborException (NeighborException exception) {
		
		var response = new ErrorResponse();
		response.setErrorCode(exception.getErrorCode());
		response.setErrorMessage(exception.getErrorMessage());
		
		return response;
	}
	
	

}

