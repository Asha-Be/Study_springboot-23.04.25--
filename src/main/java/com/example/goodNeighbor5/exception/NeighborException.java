package com.example.goodNeighbor5.exception;


public class NeighborException {
	
	private String errorCode;
	private String errorMessage;

	public String getErrorCode() {
		return errorCode;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public static NeighborException from(String errorCode, String errorMessage) {
		var exception = new NeighborException();
		exception.errorCode = errorCode;
		exception.errorMessage = errorMessage;

		return exception;
	}


}
